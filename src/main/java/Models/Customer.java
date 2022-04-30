package Models;

import java.time.LocalDate;
import java.util.Random;
import java.util.Scanner;

public class Customer {
    private int customerid;
    private String customerName;
    private String dateOfBirth;
    private String contactNumber;
    private String emailAddress;
    private double monthlyIncome;
    private String profession;
    private double totalMonthlyExpenses;
    private double maxEligibleLoanAmount;
    private String designation;
    private String companyName;
    Random rand = new Random();
    Scanner sc = new Scanner(System.in);

    public Customer(int customerid, String customerName, LocalDate dateOfBirth, String contactNumber, String emailAddress, double monthlyIncome, String profession, double totalMonthlyExpenses, double maxEligibleLoanAmount, String designation, String companyName) {
        this.customerid = customerid;
        this.customerName = customerName;
        this.dateOfBirth = String.valueOf(dateOfBirth);
        this.contactNumber = contactNumber;
        this.emailAddress = emailAddress;
        this.monthlyIncome = monthlyIncome;


        this.profession = profession;
        this.totalMonthlyExpenses = totalMonthlyExpenses;
        this.maxEligibleLoanAmount = maxEligibleLoanAmount;
        this.designation = designation;
        this.companyName = companyName;
    }

    public Customer(String customerName, LocalDate dateOfBirth, String contactNumber, String emailAddress) {
    }

    public double getCalculateDBR() {
        double DBR = totalMonthlyExpenses / monthlyIncome;
        return DBR;
    }

    public double getCalculateMaxEligibleEMI() {
        double MaxEMI = (monthlyIncome - ((getCalculateDBR()) * 20 / 100))
                * (50 / 100);
        return MaxEMI;

    }

    public void getCalculateEligibleLoanAmount() {
        double r = sc.nextInt();
        double t = sc.nextInt();
        double MaxLoanAmt = getCalculateMaxEligibleEMI() * (((Math.pow((1 + r), t)) - 1) / (r * (Math.pow((1 + r), t))));
    }

    public String toString() { return "Customer{" +
            "customerid=" + customerid +
            ", customerName='" + customerName + '\'' + ", dateOfBirth=" + dateOfBirth +
            ", contactNumber='" + contactNumber + '\'' + ", emailAddress='" + emailAddress + '\'' + ", monthlyIncome=" + monthlyIncome +
            ", profession='" + profession + '\'' +
            ", totalMonthlyExpenses=" + totalMonthlyExpenses + ", maxEligibleLoanAmount=" + maxEligibleLoanAmount +
            ", designation='" + designation + '\'' + ", companyName='" + companyName + '\'' + ", rand=" + rand +
            ", sc=" + sc + '}';
    }

    public int getCustomerid() {
        return customerid;
    }

    public void setCustomerid(int customerid) {
        this.customerid = customerid;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public double getMonthlyIncome() {
        return monthlyIncome;
    }

    public void setMonthlyIncome(double monthlyIncome) {
        this.monthlyIncome = monthlyIncome;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public double getTotalMonthlyExpenses() {
        return totalMonthlyExpenses;
    }

    public void setTotalMonthlyExpenses(double totalMonthlyExpenses) {
        this.totalMonthlyExpenses = totalMonthlyExpenses;
    }

    public double getMaxEligibleLoanAmount() {
        return maxEligibleLoanAmount;
    }

    public void setMaxEligibleLoanAmount(double maxEligibleLoanAmount) {
        this.maxEligibleLoanAmount = maxEligibleLoanAmount;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Random getRand() {
        return rand;
    }

    public void setRand(Random rand) {
        this.rand = rand;
    }

    public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }


//    public Customer retrieveStudent(int customerid)
//    {
//        CustomerDAO cdao=new CustomerDAO();
//        return cdao.getcustomer(customerid);
//    }
}