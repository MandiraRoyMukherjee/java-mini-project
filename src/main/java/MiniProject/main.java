package MiniProject;

import Controller.Studentcontroller;
import Dao.LoanAgreementDAO;
import Dbpack.connection;
import Models.Customer;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.Random;
import java.util.Scanner;

public class main {


    private static int customerid;

    public static void main(String[] args) {
//        System.out.println("hello");

        System.out.println("\n\t\t\t  **-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**\n");

        System.out.println("\n\t\t\t        =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("\n\t\t\t        =                 WELCOME                   =");
        System.out.println("\n\t\t\t        =                   TO                      =");
        System.out.println("\n\t\t\t        =                 LENDING                  =");
        System.out.println("\n\t\t\t        =               MANAGEMENT                  =");
        System.out.println("\n\t\t\t        =                 SYSTEM                    =");
        System.out.println("\n\t\t\t        =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("\n\t\t\t  **-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**\n");


        //database connection
        Connection con = connection.getConnection();

        try {
            if (con != null) {

                System.out.println("connected");

            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("not connected");
        }
//        LoanAgreementDAO ld=new LoanAgreementDAO();
//       ld.getloanagreement();
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter customer id");
//       int customerid = sc.nextInt();


        // which loan want
        int value;

        // Create a Scanner object for keyboard input.
        Scanner console = new Scanner(System.in);


        System.out.print("welcome to our bank" +
                "" +
                " what kind of loan you want?" +

                " 1. home loan" +
                "" +

                " 2. vehicle loan" +
                "" +

                " 3. education loan ");
        value = console.nextInt();


        switch (value) {
            case 1:
                System.out.println("homeloan");

                break;

            case 2:
                System.out.println("consumer vehicle loan");

                break;

            case 3:
                System.out.println("education loan");

                break;

        }

        Scanner kbd = new Scanner(System.in);
        String decision;
        boolean yn;


        System.out.println("if you have customer id?");
        decision = kbd.nextLine();


        switch (decision) {
            case "yes":
//                System.out.println("enter your customer id");
//                Scanner kb= new Scanner(System.in);
                // int customerid;
//              customerid=kb.nextInt();

//                HashMap<Integer, Integer> customerid = new HashMap<>();
//                Scanner in = new Scanner(System.in);
//
//                for (int i = 0; i < 3; i++) {
//                    Integer a = in.nextInt();
//                    Integer b = in.nextInt();
//
//                    customerid.put(a, (b));
//                }
                Studentcontroller s1 = new Studentcontroller();

                //    Scanner sc = new Scanner(System.in);
                LoanAgreementDAO ld = new LoanAgreementDAO();
                ld.getloanagreement();
//                System.out.println(" To retrieve customer");
//            {
//                System.out.println("Enter customer id");
//
//                customerid = sc.nextInt();
//                Customer c = s1.retrievecustomer(customerid);
//                if (c != null) {
////                    System.out.println("congratulation!!!! you can apply for loan");
//                    System.out.println(c);
//                } else {
//                    System.out.println("your data is not save in our system");
//                }
//            }


//                if(customerid==100 ){
//                    System.out.println("you can apply for loan");
//                }
//                else{
//                    System.out.println("its not valid customer id");
//                }


//               Scanner kb = new Scanner(System.in);
//                String deci;
//                deci = kb.nextLine();
//
//                switch (deci) {
//                    case "yes":
//
//
//                }


            break;
            case "no":
                System.out.println("please at first register yourself");

                int ch = 0;


                //int customerid;
                double monthlyIncome;
                double totalMonthlyExpenses;
                double maxEligibleLoanAmount;

                String customerName, contactNumber, emailAddress, profession, designation, companyName;
                LocalDate dateOfBirth;
                sc = new Scanner(System.in);
                System.out.println("1.To create customer");
//                System.out.println("2. To retrieve customer");
                ch = sc.nextInt();
//        StudentService sService = new StudentService();
//
//       CustomerDAO dao=new CustomerDAO();
                Studentcontroller s = new Studentcontroller();
//
                if (ch == 1) {
                    //  System.out.println("Enter id");
                    // int customerid = 0;
                    Random rnd = new Random();
                    customerid = rnd.nextInt();

                    sc.nextLine();
                    System.out.println("Enter name");
                    customerName = sc.next();
                    System.out.println("Enter dob");
                    String strdate = sc.next();
                    dateOfBirth = LocalDate.parse(strdate);
                    sc.nextLine();
                    System.out.println("Enter number");
                    contactNumber = sc.next();
                    sc.nextLine();
                    System.out.println("Enter email");
                    emailAddress = sc.next();
                    System.out.println("Enter income");
                    monthlyIncome = sc.nextDouble();
                    sc.nextLine();
                    System.out.println("Enter proffesion");
                    profession = sc.next();
                    System.out.println("Enter monthly expenses");
                    totalMonthlyExpenses = sc.nextDouble();
                    System.out.println("Enter max eligible loan amount");
                    maxEligibleLoanAmount = sc.nextDouble();


                    sc.nextLine();
                    System.out.println("Enter designation");
                    designation = sc.next();
                    sc.nextLine();
                    System.out.println("Enter company name");
                    companyName = sc.next();

//
//         Student s = new Student(stid, name, dob, marks, regdate);
                    Customer c = new Customer(customerid, customerName, dateOfBirth, contactNumber, emailAddress, monthlyIncome, profession, totalMonthlyExpenses, maxEligibleLoanAmount, designation, companyName);
                    System.out.println(s.insertcustomer(c));

                }
//                } else {
//                    System.out.println("Enter customer id");
//                    customerid = sc.nextInt();
//                    Customer c = s.retrievecustomer(customerid);
//                    System.out.println(c);
//                }
                break;
        }


//        Scanner kbd1 = new Scanner(System.in);
//        String decision1;
//        System.out.println("do you want to update your name,email,phone");
//        decision1 = kbd1.nextLine();
//
//
//
//
//        switch (decision1) {
//            case "yes": {
//                CustomerDAO dao = new CustomerDAO();
//                String customerName, contactNumber, emailAddress;
//                LocalDate dateOfBirth;
//
//                System.out.println("Enter id");
//                customerid=sc.nextInt();
//                sc = new Scanner(System.in);
//                sc.nextLine();
//                System.out.println("Enter name");
//                customerName = sc.next();
//                System.out.println("Enter dob");
//                String strdate = sc.next();
//                dateOfBirth = LocalDate.parse(strdate);
//                sc.nextLine();
//                System.out.println("Enter number");
//                contactNumber = sc.next();
//                sc.nextLine();
//                System.out.println("Enter email");
//                emailAddress = sc.next();
//                Customer c = new Customer(customerName, dateOfBirth, contactNumber, emailAddress);
//                System.out.println(dao.updatecustomer(c));
//                break;
//            }
//            case "no":
//
//                System.out.println("fill the loan form");
//
//
//
//
//        }







        }

    private static Customer findCustomer() {

//       int customerid = 0;
        double monthlyIncome;
        double totalMonthlyExpenses;
        double maxEligibleLoanAmount;

        String customerName, contactNumber, emailAddress, profession, designation, companyName;
        LocalDate dateOfBirth;
//        Customer st = null;
        Connection con = connection.getConnection();

        String str = "select * from customer where CustomerId="+customerid;
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


//
//            int ch = 0;
//
//
//            int customerid;
//            double monthlyIncome;
//            double totalMonthlyExpenses;
//            double maxEligibleLoanAmount;
//
//            String customerName, contactNumber, emailAddress, profession, designation, companyName;
//            LocalDate dateOfBirth;
//            Scanner sc = new Scanner(System.in);
//            System.out.println("1.To create customer");
//            System.out.println("2. To retrieve customer");
//            ch = sc.nextInt();
////        StudentService sService = new StudentService();
////
////       CustomerDAO dao=new CustomerDAO();
//           Studentcontroller s = new Studentcontroller();
////
//            if (ch == 1) {
//                System.out.println("Enter id");
//                customerid = sc.nextInt();
//                sc.nextLine();
//                System.out.println("Enter name");
//                customerName = sc.next();
//                System.out.println("Enter dob");
//                String strdate = sc.next();
//                dateOfBirth = LocalDate.parse(strdate);
//                sc.nextLine();
//                System.out.println("Enter number");
//                contactNumber = sc.next();
//                sc.nextLine();
//                System.out.println("Enter email");
//                emailAddress = sc.next();
//                System.out.println("Enter income");
//                monthlyIncome = sc.nextDouble();
//                sc.nextLine();
//                System.out.println("Enter proffesion");
//                profession = sc.next();
//                System.out.println("Enter monthly expenses");
//                totalMonthlyExpenses = sc.nextDouble();
//                System.out.println("Enter max eligible loan amount");
//                maxEligibleLoanAmount = sc.nextDouble();
//
//
//                sc.nextLine();
//                System.out.println("Enter designation");
//                designation = sc.next();
//                sc.nextLine();
//                System.out.println("Enter company name");
//                companyName = sc.next();
////
////         Student s = new Student(stid, name, dob, marks, regdate);
//                Customer c = new Customer(customerid, customerName, dateOfBirth, contactNumber, emailAddress, monthlyIncome, profession, totalMonthlyExpenses, maxEligibleLoanAmount, designation, companyName);
//                System.out.println(s.insertcustomer(c));
//            } else {
//                System.out.println("Enter customer id");
//                customerid = sc.nextInt();
//                Customer c = s.retrievecustomer(customerid);
//                System.out.println(c);
//            }
//
//        }

    private static int presentinbank() {



        return 0;
    }

//    private static CustomerDAO retrievecustomer(int customerid) {
//
//        CustomerDAO dao=new CustomerDAO();
//         dao.getcustomer(customerid);
//
//        return dao;
//    }
    }

