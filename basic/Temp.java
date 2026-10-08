package basic;

public class Temp {
    // Fahrenheit = (Celsius × 9/5) + 32
    public static void main(String[] args) {
        double celsius = 30;

        double fahrenheit = (celsius * 9 / 5) + 32;

        System.out.println(fahrenheit);

        double cels = (fahrenheit - 32) * 5 / 9;
        System.out.println(cels);

    }
}
