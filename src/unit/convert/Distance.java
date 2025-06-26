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

    public void centimetersToMillimeters(double centimeters) {
        this.millimeters = centimeters * 10;
    }

    public void centimetersToMeters(double centimeters) {
        this.meters = centimeters / 100;
    }

    public void centimetersToKilometers(double centimeters) {
        this.kilometers = centimeters / 100_000;
    }

    public void centimetersToInches(double centimeters) {
        this.inches = centimeters / 2.54;
    }

    public void centimetersToFeet(double centimeters) {
        this.feet = centimeters / 30.48;
    }

    public void centimetersToMiles(double centimeters) {
        this.miles = centimeters / 160_000;
    }


}
