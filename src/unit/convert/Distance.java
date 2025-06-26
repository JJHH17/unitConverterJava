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
    }

    public void metersToCentimeters(double meters) {
    }

    public void metersToKilometers(double meters) {
    }

    public void metersToInches(double meters) {
    }

    public void metersToFeet(double meters) {
    }

    public void metersToMiles(double meters) {
    }

    public void KilometersToMillimeters(double kilometers) {
    }

    public void kilometersToCentimeters(double kilometers) {
    }

    public void kilometersToMeters(double kilometers) {
    }

    public void kilometersToInches(double kilometers) {
    }

    public void KilometersToFeet(double kilometers) {
    }

    public void kilometersToMiles(double kilometers) {
    }
}
