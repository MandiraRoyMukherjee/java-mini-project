package Models;
import Enum.*;
public class HomeLoan {
    public PropertyType propertyType;
    public NatureOfProperty natureOfProperty;
    public PropertyPurpose propertyPurpose;
    public PropertyOwnership propertyOwnership;
    public double marketValue;
    public double builtUpArea;
    public double carpetArea;
    public int propertyAge;

    public PropertyType getPropertyType() {
        return propertyType;
    }

    public NatureOfProperty getNatureOfProperty() {
        return natureOfProperty;
    }

    public PropertyPurpose getPropertyPurpose() {
        return propertyPurpose;
    }

    public PropertyOwnership getPropertyOwnership() {
        return propertyOwnership;
    }

    public double getMarketValue() {
        return marketValue;
    }

    public double getBuiltUpArea() {
        return builtUpArea;
    }

    public double getCarpetArea() {
        return carpetArea;
    }

    public int getPropertyAge() {
        return propertyAge;
    }

    public void setPropertyType(PropertyType propertyType) {
        this.propertyType = propertyType;
    }

    public void setNatureOfProperty(NatureOfProperty natureOfProperty) {
        this.natureOfProperty = natureOfProperty;
    }

    public void setPropertyPurpose(PropertyPurpose propertyPurpose) {
        this.propertyPurpose = propertyPurpose;
    }

    public void setPropertyOwnership(PropertyOwnership propertyOwnership) {
        this.propertyOwnership = propertyOwnership;
    }

    public void setMarketValue(double marketValue) {
        this.marketValue = marketValue;
    }

    public void setBuiltUpArea(double builtUpArea) {
        this.builtUpArea = builtUpArea;
    }

    public void setCarpetArea(double carpetArea) {
        this.carpetArea = carpetArea;
    }

    public void setPropertyAge(int propertyAge) {
        this.propertyAge = propertyAge;
    }
}
