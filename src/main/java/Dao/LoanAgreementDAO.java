package Dao;


import Controller.Studentcontroller;
import Dbpack.connection;
import Models.Customer;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.Scanner;

public class LoanAgreementDAO {

    private int customerid;

    public int getloanagreement() {
        int loanid = 0;
        double loanamount;
        int tenure;
        double roi, emipermonth;
        String loanstatus;

        LocalDate loandisbursaldate;
        String repayment;

        Connection con = connection.getConnection();
        try {
            if (con != null) {
                // PreparedStatement ps = con.prepareStatement("select * from customer where customerid=?");
//
//
                //         ps.setInt(1, customerid);
                Statement st = con.createStatement();
//            PreparedStatement st = con.prepareStatement()


              //  ResultSet rs = st.executeQuery("select * from customer where customerid=?");

//                rs.setInt(1, customerid);

                int userdata=0;
                Scanner sc= new Scanner(System.in);
                System.out.println("Enter customer id");
                int customerid = sc.nextInt();
                ResultSet rs = st.executeQuery("Select * from customer where customerid='"+customerid+"'");
                if(rs.next()) {


               userdata = rs.getInt(1);
//                    System.out.println(userdata);


                    if (customerid == userdata) {

                        System.out.println("customer is  registerd");
                        System.out.println("congratulation!!!! you can apply for loan");

                        {
                            System.out.println(" To retrieve customer");
                            System.out.println("Enter customer id");
                            Studentcontroller s1 = new Studentcontroller();

                            customerid = sc.nextInt();
                            Customer c = s1.retrievecustomer(customerid);
                            if (c != null) {
//                    System.out.println("congratulation!!!! you can apply for loan");
                                System.out.println(c);
                            } else {
                                System.out.println("your data is not save in our system");
                            }
                        }



                    }
                }
                else  {
                    System.out.println("customer is not registed");
                    System.out.println("you cant apply for loan");
                }




            }
            



        } catch (SQLException e) {
            e.printStackTrace();
        }


        return loanid;
    }



    

}