package Models;

import Enum.LoanStatus;
import Enum.RepayFrequency;

import java.time.LocalDate;
import java.util.Scanner;

import static java.lang.Math.pow;

public class LoanAgreement {
    private static int count = 1;
    private int loanAgreementID;
    private int loan_id;
    private LoanProduct LoanProduct;
    private double loanAmount;
    private int tenure;
    private double roi;
    public LoanStatus loanStatus;
    private double emiPerMonth;
    private LocalDate loanDisbursalDate;
    private RepayFrequency repaymentFrequency;

    public LoanAgreement(int loanAgreementID, int loan_id,
                         LoanProduct loanProduct,
                         double loanAmount, int tenure, double roi,
                         LoanStatus loanStatus, double emiPerMonth,
                         LocalDate loanDisbursalDate,
                         RepayFrequency repaymentFrequency) {
        this.loanAgreementID = loanAgreementID;
        this.loan_id = loan_id;
        LoanProduct = loanProduct;
        this.loanAmount = loanAmount;
        this.tenure = tenure;
        this.roi = roi;
        this.loanStatus = loanStatus;
        this.emiPerMonth = emiPerMonth;
        this.loanDisbursalDate = loanDisbursalDate;
        this.repaymentFrequency = repaymentFrequency;
    }

    public LoanAgreement() {
        loanAgreementID = count++;
    }

    public int getLoanAgreementID() {
        return loanAgreementID;
    }

  public double calculateEMI(double p, double r, int t) {
//        loanAmount=p;
//        roi=r;
//        tenure=t;
//        double i=pow((1+r),t);
//        double emi=(p*r*i)/(i-1);
//        System.out.println("EMI="+emi);


      double emiAmount;
      if (RepayFrequency.MONTHLY == repaymentFrequency) {
          double monthlyInterestRate = roi / (12 * 100);
          double numMonths = tenure * 12;
          emiAmount = (loanAmount * monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numMonths)) /
                  (Math.pow(1 + monthlyInterestRate, numMonths) - 1);
          emiPerMonth = emiAmount;
          return emiPerMonth;
      } else if (RepayFrequency.QUARTERLY == repaymentFrequency) {
          double quarterlyInterestRate = roi / (4 * 100);
          double numquarter = tenure * 4;
          emiAmount = (loanAmount * quarterlyInterestRate * Math.pow(1 + quarterlyInterestRate, numquarter)) /
                  (Math.pow(1 + quarterlyInterestRate, numquarter) - 1);
          emiPerMonth = emiAmount;
          return emiPerMonth;
      } else if (RepayFrequency.HALFYEARLY == repaymentFrequency) {
          double halfyearlyInterestRate = roi / (2 * 100);
          double numhalfyear = tenure * 2;
          emiAmount = (loanAmount * halfyearlyInterestRate * Math.pow(1 + halfyearlyInterestRate, numhalfyear)) /
                  (Math.pow(1 + halfyearlyInterestRate, numhalfyear) - 1);
          emiPerMonth = emiAmount;
          return emiPerMonth;
      } else {//yearly
          double yearlyInterestRate = roi / (1 * 100);
          double numyear = tenure * 1;
          emiAmount = (loanAmount * yearlyInterestRate * Math.pow(1 + yearlyInterestRate, numyear)) /
                  (Math.pow(1 + yearlyInterestRate, numyear) - 1);
          emiPerMonth = emiAmount;
          return emiPerMonth;
      }

    }

    public void generateRepaymentSchedule(double principal, double
            annualInterestRate, double numYears) {
        Scanner sc = new Scanner(System.in);
        double Ln = 0;
        double monthlyInterestRate = annualInterestRate / (12 * 100);
        double numMonths = numYears * 12;
        double inst_amt = (principal * monthlyInterestRate * pow(1 +
                monthlyInterestRate, numMonths)) /
                (pow(1 + monthlyInterestRate, numMonths) - 1);
        double OPn = 0;
        double Pn = 0;
        int sum = 0;
        for (int i = 0; i < numYears * 12; i++) {
            OPn = principal - (inst_amt * i);
            Ln = OPn * monthlyInterestRate;
            System.out.println("Interest componenet for installment number "
                    + (i + 1) + " is " + Ln);
            Pn = inst_amt - Ln;
            sum += Pn;
            System.out.println("_________________________________");
            System.out.println("Principal componenet for installment number "
                    + (i + 1) + " is " + Pn);
            System.out.println("_________________________________");
        }
    }

    public double calculateLatePenalty() {
        return 0;
    }

    public double calculateLoanToValueRatio() {

        Scanner sc = new Scanner(System.in);
        double property_value = sc.nextInt();
        double d = ( loanAmount/ property_value ) * 100 ;
        return d ;


    }
}

