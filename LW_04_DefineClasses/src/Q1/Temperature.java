package Q1;

public class Temperature {
    private double celsius;

    //no argument constructor
    public Temperature() {
        celsius = 0.0;
    }

    //Parameterized constructor
    public Temperature(double celsius) {
        this.celsius = celsius;
    }

    //getter method to return temperature in Celsius
    public double toCelsius() {
        return celsius;
    }

    //getter method to return temperature in Fahrenheit
    public double toFahrenheit(){
        return((celsius * 9 / 5) + 32);
    }

    //setter method to set temperature in Celsius
    public void setCelsius(double celsius){
        this.celsius=celsius;
    }

    //setter method to set temperature in Fahrenheit
    public void setFahrenheit(double Fahrenheit){
        this.celsius=((Fahrenheit - 32) * 5 / 9);

    }

}
