package unit.convert;

public class Distance {
    private double millimeters;
    private double centimeters;
    private double meters;
    private double kilometers;
    private double inches;
    private double feet;
    private double miles;

    public void millimetersToCentimeters(double millimeters) {
        this.centimeters = millimeters / 10;
    }

    public void millimetersToMeters(double millimeters) {
        this.meters = millimeters / 1_000;
    }

    public void millimetersToKilometers(double millimeters) {
        this.kilometers = millimeters / 1_000_000;
    }

    public void millimetersToInches(double millimeters) {
        this.inches = millimeters / 25.4;
    }

    public void millimetersToFeet(double millimeters) {
        this.feet = millimeters / 304.8;
    }

    public void millimetersToMiles(double millimeters) {
        this.miles = millimeters / 1_609_344;
    }

    public void metersToMillimeters(double meters) {
        this.millimeters = meters / 1000;
    }

    public void metersToCentimeters(double meters) {
        this.centimeters = meters * 100;
    }

    public void metersToKilometers(double meters) {
        this.kilometers = meters / 1_000;
    }

    public void metersToInches(double meters) {
        this.inches = meters * 39.37;
    }

    public void metersToFeet(double meters) {
        this.feet = meters * 3.281;
    }

    public void metersToMiles(double meters) {
        this.miles = meters / 1_609;
    }

    public void KilometersToMillimeters(double kilometers) {
        this.millimeters = kilometers * 1_000_000;
    }

    public void kilometersToCentimeters(double kilometers) {
        this.centimeters = kilometers * 100_000;
    }

    public void kilometersToMeters(double kilometers) {
        this.meters = kilometers * 1_000;
    }

    public void kilometersToInches(double kilometers) {
        this.inches = kilometers * 39_370;
    }

    public void KilometersToFeet(double kilometers) {
        this.feet = kilometers * 3_281;
    }

    public void kilometersToMiles(double kilometers) {
        this.miles = kilometers / 1.609;
    }

    public void inchesToMillimeters(double inches) {
        this.millimeters = inches * 25.4;
    }

    public void inchesToCentimeters(double inches) {
        this.centimeters = inches * 2.54;
    }

    public void inchesToMeters(double inches) {
        this.meters = inches / 39.37;
    }

    public void inchesToKilometers(double inches) {
        this.kilometers = inches / 39_370;
    }

    public void inchesToFeet(double inches) {
        this.feet = inches / 12;
    }

    public void inchesToMiles(double inches) {
        this.miles = inches / 63_360;
    }

    public void feetToMillimeters(double feet) {
        this.millimeters = feet * 304.8;
    }

    public void feetToCentimeters(double feet) {
        this.centimeters = feet * 30.48;
    }

    public void feetToMeters(double feet) {
        this.meters = feet / 3.281;
    }

    public void feetToKilometers(double feet) {
        this.kilometers = feet / 3_281;
    }

    public void feetToInches(double feet) {
        this.inches = feet * 12;
    }

    public void feetToMiles(double feet) {
        this.miles = feet / 5_280;
    }

    public void milesToMillimeters(double miles) {
        this.millimeters = miles * 1_609_344;
    }

    public void milesToCentimeters(double miles) {
        this.centimeters = miles * 160_900;
    }

    public void milesToMeters(double miles) {
        this.meters = miles * 1_609;
    }

    public void milesToKilometers(double miles) {
        this.kilometers = miles * 1.609;
    }

    public void milesToInches(double miles) {
        this.inches = miles * 63_360;
    }

    public void milesToFeet(double miles) {

    }
}
