package Models;
import Enum.*;

import java.time.LocalDate;

public class Payment {
    public String chequeNumber;
    public PaymentMode paymentMode;
    public LocalDate chequeDate;
    public LocalDate depositDate;
    public double chequeAmount;
    public String drawnOn;
    public ChequeStatus status;

    public Payment(String chequeNumber,
                   PaymentMode paymentMode,
                   LocalDate chequeDate,
                   LocalDate depositDate,
                   double chequeAmount,
                   String drawnOn,
                   ChequeStatus status) {
        this.chequeNumber = chequeNumber;
        this.paymentMode = paymentMode;
        this.chequeDate = chequeDate;
        this.depositDate = depositDate;
        this.chequeAmount = chequeAmount;
        this.drawnOn = drawnOn;
        this.status = status;
    }

    public String getChequeNumber() {
        return chequeNumber;
    }

    public PaymentMode getPaymentMode() {
        return paymentMode;
    }

    public LocalDate getChequeDate() {
        return chequeDate;
    }

    public LocalDate getDepositDate() {
        return depositDate;
    }

    public double getChequeAmount() {
        return chequeAmount;
    }

    public String getDrawnOn() {
        return drawnOn;
    }

    public ChequeStatus getStatus() {
        return status;
    }

    public void setChequeNumber(String chequeNumber) {
        this.chequeNumber = chequeNumber;
    }

    public void setPaymentMode(PaymentMode paymentMode) {
        this.paymentMode = paymentMode;
    }

    public void setChequeDate(LocalDate chequeDate) {
        this.chequeDate = chequeDate;
    }

    public void setDepositDate(LocalDate depositDate) {
        this.depositDate = depositDate;
    }

    public void setChequeAmount(double chequeAmount) {
        this.chequeAmount = chequeAmount;
    }

    public void setDrawnOn(String drawnOn) {
        this.drawnOn = drawnOn;
    }

    public void setStatus(ChequeStatus status) {
        this.status = status;
    }
}
