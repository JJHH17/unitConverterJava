package unit.convert;

public class Weight {
    private double grams;
    private double kilograms;
    private double pounds;
    private double ounces;

    public void gramsToKilograms(double grams) {
        this.kilograms = grams / 1_000;
    }

    public void gramsToPounds(double grams) {
        this.pounds = grams / 453.6;
    }

    public void gramsToOunces(double grams) {
        this.ounces = grams / 28.35;
    }

    public void kilogramsToGrams(double kilograms) {
        this.grams = kilograms * 1000;
    }

    public void kilogramsToPounds(double Kilograms) {
        this.pounds = kilograms * 2.205;
    }

    public void kilogramsToOunces(double kilograms) {
        this.ounces = kilograms * 35.274;
    }

    public void poundsToGrams(double pounds) {
        this.grams = pounds * 453.6;
    }

    public void poundsToKilograms(double pounds) {
        this.kilograms = pounds / 2.205;
    }

    public void poundsToOunces(double pounds) {
        this.ounces = pounds * 16;
    }

    public void ouncesToGrams(double ounces) {
        this.grams = ounces * 28.35;
    }

    public void ouncesToKilograms(double ounces) {
        this.kilograms = ounces / 35.274;
    }

    public void ouncesToPounds(double ounces) {
        this.pounds = ounces / 16;
    }
}
