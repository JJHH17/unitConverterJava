package unit.convert;

public class Temperature {

    private int fahrenheit;
    private int celsius;

    public Temperature(int fahrenheit, int celsius) {
        this.fahrenheit = fahrenheit;
        this.celsius = celsius;
    }

    public void calcFahrenheit(int celsius) {
        this.fahrenheit = (celsius * 9/5) + 32;
    }

    public String getFahrenheit() {
        return this.fahrenheit + "°F";
    }

    public void calcCelsius(int fahrenheit) {
        this.celsius = (fahrenheit - 32) * 5/9;
    }

    public String getCelsius() {
        return this.celsius + "°C";
    }
}
