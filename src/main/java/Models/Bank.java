package Models;


import Dbpack.connection;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;


public  class Bank  {

 private ArrayList<LoanProduct> loanProducts;
   private Map<Customer, List<LoanAgreement>> customers;
    public static Connection con = null;


    public void registerCustomer() {

        con = connection.getConnection();
//        if (findCustomer(c.getCustomerId()) == null) {
//            PreparedStatement ps = null;
//            int n = 0;
//            String str = "insert into customer values(?,?,?,?,?,?,?,?,?,?,?,?,?)";

        try {
            if (con != null) {

                System.out.println("connected");

            }
        } catch (Exception e) {
            e.printStackTrace();
        }




//            try {
//                ps = con.prepareStatement(str);
//                ps.setInt(1, c.getCustomerId());
//                ps.setString(2, c.getCustomerName());
//                ps.setDate(3, c.getDateOfBirth());
//                ps.setString(4, c.getContactNumber());
//                ps.setString(5, c.getEmailAddress());
//                ps.setDouble(6, c.getMonthlyIncome());
//                ps.setString(7, c.getProfession());
//                ps.setDouble(8, c.getTotalMonthlyExpense());
//                ps.setDouble(9, 0);
//                ps.setString(10, c.getDesignation());
//                ps.setString(11, c.getCompanyName());
//                ps.setDouble(12,c.calculateDBR());
//                ps.setDouble(13,c.calculateMaxEligibleEMI());
//                n = ps.executeUpdate();
//
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
//            if (n == 1) {
//                System.out.println("one row inserted");
////                return true;
//            } else {
//                System.out.println("Insertion failed");
////                return false;
//            }
//        }
//        else {
//            System.out.println("Customer is already registered");
//        }
//
//        try {
//            con.close();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//
////        return false;
//    }
//
//    @Override
//    public String applyLoan(int customerId, double loanAmount, double roi, int tenure, LoanProduct typeOfLoan, RepayFrequency repaymentFrequency) {
//        return null;
//    }
//
//    @Override
//    public String trackLoanStatus(String loanAgreementId) {
//        con = DataManager.getConnection();
//        PreparedStatement ps = null;
//        String status="";
//        String str = "select loanstatus from loanagreement where loanagreementid ='"+loanAgreementId+"'";
//        try {
//            ps = con.prepareStatement(str);
//            ResultSet rs = ps.executeQuery();
//            while(rs.next()){
//                status = rs.getString(1);
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//
//        try {
//            con.close();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//
//        return status;
//    }
//
//

//    @Override
//    public Customer findCustomer(int CustomerId) {
//        con = connection.getConnection();
//        String str = "select * from customer where CustomerId="+CustomerId;
//        Customer customer = null;
//        try {
//            Statement st = con.createStatement();
//            ResultSet rs = st.executeQuery(str);
//            while(rs.next()){
//                customer = new customer(rs.getInt(1),rs.getString(2),rs.getDate(3),
//                        rs.getString(4), rs.getString(5),rs.getDouble(6),rs.getString(7),
//                        rs.getDouble(8),rs.getString(10),rs.getString(11));
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//
//        try {
//            con.close();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//
//
//        return customer;
//    }
//
//        @Override
//        public void approveRejectLoan(File f) {
//
//        }
//
//        @Override
//        public double calculateLoanPenalty(String loanAgreementId) {
//            return 0.0;
//        }
//
//        @Override
//        public ArrayList<LoanAgreement> getAllActiveLoanDetails() {
//            return null;
//        }
//
//        @Override
//        public LoanAgreement getLoanDetails(String loanAgreementId) {
//            return null;
//        }
//
//        @Override
//        public String payEMI(String loanAgreementId, double emiAmount, int month) {
//            return null;
//        }
//
//
//
//        @Override
//        public void loanDisbursal(String LoanAgreementId) {
//
//        }
    }
}



