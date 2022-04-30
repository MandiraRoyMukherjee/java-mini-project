package Models;
import Enum.*;
public class CustomerVehicleLoan {
 AssetCategory assetCategory;
 AssetVariant assetVariant;
 String assetModel;
 String manufacturer;
 int yearOfManufacture;
 double assetCost;
 double downPayment;

    public CustomerVehicleLoan(AssetCategory assetCategory,AssetVariant assetVariant,
                               String assetModel, String manufacturer,
                               int yearOfManufacture, double assetCost,
                               double downPayment) {
        this.assetCategory = assetCategory;
        this.assetVariant = assetVariant;
        this.assetModel = assetModel;
        this.manufacturer = manufacturer;
        this.yearOfManufacture = yearOfManufacture;
        this.assetCost = assetCost;
        this.downPayment = downPayment;
    }

    public AssetCategory getAssetCategory() {
        return assetCategory;
    }

    public AssetVariant getAssetVariant() {
        return assetVariant;
    }

    public String getAssetModel() {
        return assetModel;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public double getAssetCost() {
        return assetCost;
    }

    public double getDownPayment() {
        return downPayment;
    }

    public void setAssetCategory(AssetCategory assetCategory) {
        this.assetCategory = assetCategory;
    }

    public void setAssetVariant(AssetVariant assetVariant) {
        this.assetVariant = assetVariant;
    }

    public void setAssetModel(String assetModel) {
        this.assetModel = assetModel;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public void setAssetCost(double assetCost) {
        this.assetCost = assetCost;
    }

    public void setDownPayment(double downPayment) {
        this.downPayment = downPayment;
    }
}
