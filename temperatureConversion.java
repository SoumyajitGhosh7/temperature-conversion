import java.util.Scanner;
class Conversion{
    public static void convertFromCelsius(double celsius){
        double fahrenheit=celsius * 9 / 5 + 32;
        double kelvin=celsius + 273.15;
        System.out.printf("%.2f Celsius is equivalent to %.2f Fahrenheit and %.2f Kelvin.%n", celsius, fahrenheit, kelvin);
    }

    public static void convertFromFahrenheit(double fahrenheit){
        double celsius=(fahrenheit - 32) * 5 / 9;
        double kelvin=(fahrenheit - 32) * 5 / 9 + 273.15;
        System.out.printf("%.2f Fahrenheit is equivalent to %.2f Celsius and %.2f Kelvin.%n", fahrenheit, celsius, kelvin);
    }

    public static void convertFromKelvin(double kelvin) {
        double celsius=kelvin - 273.15;
        double fahrenheit=(kelvin - 273.15) * 9 / 5 + 32;
        System.out.printf("%.2f Kelvin is equivalent to %.2f Celsius and %.2f Fahrenheit.%n", kelvin, celsius, fahrenheit);
    }
}

public class temperatureConversion {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the unit of the temperature (C for Celsius, F for Fahrenheit, K for Kelvin): ");
        char unit=sc.next().charAt(0);
        System.out.println("Enter the value of temperature ");
        double tempVal=sc.nextDouble();
        switch (unit) {
            case 'C':
                Conversion.convertFromCelsius(tempVal);
                break;
            case 'F':
                Conversion.convertFromFahrenheit(tempVal);
                break;
            case 'K':
                Conversion.convertFromKelvin(tempVal);
                break;
            default:
                System.out.println("Invalid unit entered. Please enter C, F, or K.");
        }
        sc.close();
    }
}