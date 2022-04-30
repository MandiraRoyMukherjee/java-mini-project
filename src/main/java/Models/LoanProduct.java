package Models;
import javax.swing.plaf.PanelUI;
public class LoanProduct {
        public String loanProductId;
        public String loanProductName;
        public boolean assetBased;
        public double minTenure;
        public double maxTenure;
        public double minLoanAmount;
        public double maxLoanAmount;
        public double roi;
        public int LTV;

        public LoanProduct(String loanProductId, String loanProductName, boolean assetBased,
                           double minTenure,double maxTenure, double minLoanAmount,
                           double maxLoanAmount, double roi, int LTV) {
            this.loanProductId = loanProductId;
            this.loanProductName = loanProductName;
            this.assetBased = assetBased;
            this.minTenure = minTenure;
            this.maxTenure = maxTenure;
            this.minLoanAmount = minLoanAmount;
            this.maxLoanAmount = maxLoanAmount;
            this.roi = roi;
            this.LTV = LTV;
        }

        public String getLoanProductId() {
            return loanProductId;
        }

        public void setLoanProductId(String loanProductId) {
            this.loanProductId = loanProductId;
        }

        public String getLoanProductName() {
            return loanProductName;
        }

        public void setLoanProductName(String loanProductName) {
            this.loanProductName = loanProductName;
        }

        public boolean isAssetBased() {
            return assetBased;
        }

        public void setAssetBased(boolean assetBased) {
            this.assetBased = assetBased;
        }

        public double getMinTenure() {
            return minTenure;
        }

        public void setMinTenure(double minTenure) {
            this.minTenure = minTenure;
        }

        public double getMaxTenure() {
            return maxTenure;
        }

        public void setMaxTenure(double maxTenure) {
            this.maxTenure = maxTenure;
        }

        public double getMinLoanAmount() {
            return minLoanAmount;
        }

        public void setMinLoanAmount(double minLoanAmount) {
            this.minLoanAmount = minLoanAmount;
        }

        public double getMaxLoanAmount() {
            return maxLoanAmount;
        }

        public void setMaxLoanAmount(double maxLoanAmount) {
            this.maxLoanAmount = maxLoanAmount;
        }

        public double getRoi() {
            return roi;
        }

        public void setRoi(double roi) {
            this.roi = roi;
        }

        public int getLTV() {
            return LTV;
        }

        public void setLTV(int LTV) {
            this.LTV = LTV;
        }
//public LTVCalculationAsPerCollatoralType(int )
    }
