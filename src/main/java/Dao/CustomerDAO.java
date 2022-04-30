package Dao;


import Dbpack.connection;
import Models.Customer;

import java.sql.*;
import java.time.LocalDate;

import static java.sql.Date.valueOf;

public class CustomerDAO {


    public Customer getcustomer(int customerId)
//       int id,marks;
//        LocalDate dob,regdate;String name;
    {
        int customerid;
        double monthlyIncome;
        double totalMonthlyExpenses;
        double maxEligibleLoanAmount;

        String customerName,contactNumber,emailAddress,profession,designation,companyName;
        LocalDate dateOfBirth;
        Customer st=null;
        Connection con= connection.getConnection();
        try { if(con!=null) {
            PreparedStatement ps = con.prepareStatement("select * from customer where customerId=?");
           ps.setInt(1, customerId);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {

               customerid = rs.getInt(1);
                customerName = rs.getString(2);
               dateOfBirth  = rs.getDate(3).toLocalDate();
                contactNumber = rs.getString(4);
                emailAddress= rs.getString(5);
                monthlyIncome = rs.getDouble(6);
                profession= rs.getString(7);
                totalMonthlyExpenses= rs.getDouble(8);
                maxEligibleLoanAmount =rs.getDouble(9);
                designation= rs.getString(10);
                companyName= rs.getString(11);




                st = new Customer( customerid, customerName, dateOfBirth,  contactNumber,  emailAddress,  monthlyIncome, profession, totalMonthlyExpenses,  maxEligibleLoanAmount, designation,  companyName);
            }


        }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            if(con!=null) {
                try {
                    con.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return st;
    }
    public int insertcustomer(Customer c) {
        int i = 0;
        Connection con= connection.getConnection();
        try {
            if (con != null) {
                PreparedStatement ps = con.prepareStatement("insert into customer values(?,?,?,?,?,?,?,?,?,?,?)");
//                ps.setInt(1, s.getStid());
//                ps.setString(2, s.getName());
//                ps.setDate(3, Date.valueOf(s.getDob()));
//                ps.setInt(4, s.getMarks());
//                ps.setDate(5, Date.valueOf(s.getReg_date()));

                ps.setInt(1,c.getCustomerid());
                ps.setString(2,c.getCustomerName());
                ps.setDate(3, valueOf(c.getDateOfBirth()));
                ps.setString(4,c.getContactNumber());
                ps.setString(5,c.getEmailAddress());
                ps.setDouble(6,  c.getMonthlyIncome());
                ps.setString(7,c.getProfession());
                ps.setDouble(8,c.getTotalMonthlyExpenses());
                ps.setDouble(9,c.getMaxEligibleLoanAmount());
                ps.setString(10,c.getDesignation());
                ps.setString(11,c.getCompanyName());


                i = ps.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            return i;
        }
    }

    public int updatecustomer(Customer c) {

        int i = 0;
        Connection con = connection.getConnection();
        try {
            if (con != null) {
                PreparedStatement ps = con.prepareStatement("update customer set customername=?,dateofbirth=?,contactnumber=?,emailaddress=?  where customerid=?");

                ps.setString(2,c.getCustomerName());
                ps.setDate(3, valueOf(c.getDateOfBirth()));
                ps.setString(4,c.getContactNumber());
                ps.setString(5,c.getEmailAddress());

                ps.setInt(1, c.getCustomerid());


                i = ps.executeUpdate();
                System.out.println(i);
            }

        } catch (SQLException e) {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return i;
    }


    public Customer findCustomer(int CustomerId) {





        int customerid;
        double monthlyIncome;
        double totalMonthlyExpenses;
        double maxEligibleLoanAmount;

        String customerName, contactNumber, emailAddress, profession, designation, companyName;
        LocalDate dateOfBirth;
//        Customer st = null;
        Connection con = connection.getConnection();
        String str = "select * from customer where CustomerId=" + CustomerId;
        Customer customer = null;
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(str);
//            while(rs.next()){
////                Customer c = new Customer(customerid, customerName, dateOfBirth, contactNumber, emailAddress, monthlyIncome, profession, totalMonthlyExpenses, maxEligibleLoanAmount, designation, companyName);
//            }


            while (rs.next()) {

                customerid = rs.getInt(1);
                customerName = rs.getString(2);
                dateOfBirth = rs.getDate(3).toLocalDate();
                contactNumber = rs.getString(4);
                emailAddress = rs.getString(5);
                monthlyIncome = rs.getDouble(6);
                profession = rs.getString(7);
                totalMonthlyExpenses = rs.getDouble(8);
                maxEligibleLoanAmount = rs.getDouble(9);
                designation = rs.getString(10);
                companyName = rs.getString(11);


                customer= new Customer(customerid, customerName, dateOfBirth, contactNumber, emailAddress, monthlyIncome, profession, totalMonthlyExpenses, maxEligibleLoanAmount, designation, companyName);
            }
        } catch(SQLException e){
                e.printStackTrace();
            }

            try {
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }

        return customer;

    }


//    public Customer retrieveStudent(int customerid) {
//
//        CustomerDAO cdao=new CustomerDAO();
//        return cdao.getcustomer(customerid);
//
//
//
//    }
}
