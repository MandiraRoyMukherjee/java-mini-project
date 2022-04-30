package Models;
import Enum.*;
import java.time.*;

public class RepaymentSchedule {
    public double emiAmount;
    public LocalDate emiDueDate;
    public EmiPaidStatus status;
    public double principalComponent;
    public double interestAmount;
    public double balancePrincipalComponent;
    public double penaltyCharges;

    public RepaymentSchedule(double emiAmount, LocalDate emiDueDate,
                             EmiPaidStatus status,
                             double principalComponent,
                             double interestAmount,
                             double balancePrincipalComponent,
                             double penaltyCharges) {
        this.emiAmount = emiAmount;
        this.emiDueDate = emiDueDate;
        this.status = status;
        this.principalComponent = principalComponent;
        this.interestAmount = interestAmount;
        this.balancePrincipalComponent = balancePrincipalComponent;
        this.penaltyCharges = penaltyCharges;
    }

    public double getEmiAmount() {
        return emiAmount;
    }

    public LocalDate getEmiDueDate() {
        return emiDueDate;
    }

    public EmiPaidStatus getStatus() {
        return status;
    }

    public double getPrincipalComponent() {
        return principalComponent;
    }

    public double getInterestAmount() {
        return interestAmount;
    }

    public double getBalancePrincipalComponent() {
        return balancePrincipalComponent;
    }

    public double getPenaltyCharges() {
        return penaltyCharges;
    }

    public void setEmiAmount(double emiAmount) {
        this.emiAmount = emiAmount;
    }

    public void setEmiDueDate(LocalDate emiDueDate) {
        this.emiDueDate = emiDueDate;
    }

    public void setStatus(EmiPaidStatus status) {
        this.status = status;
    }

    public void setPrincipalComponent(double principalComponent) {
        this.principalComponent = principalComponent;
    }

    public void setInterestAmount(double interestAmount) {
        this.interestAmount = interestAmount;
    }

    public void setBalancePrincipalComponent(double balancePrincipalComponent) {
        this.balancePrincipalComponent = balancePrincipalComponent;
    }

    public void setPenaltyCharges(double penaltyCharges) {
        this.penaltyCharges = penaltyCharges;
    }
}