package exercicios;

public class ConversorTemperatura {

    public static double converterCelsiusParaFahrenheit(double celsius) {
        double fator1 = 9.0 / 5.0;
        double fator2 = 32.0;
        double fahrenheit = (celsius * fator1) + fator2;
        return fahrenheit;
    }

    public static void main(String[] args) {
        double temperaturaCelsius = 20.0;
        double temperaturaFahrenheit = converterCelsiusParaFahrenheit(temperaturaCelsius);

        System.out.println(temperaturaCelsius + " graus Celsius equivalem a " + temperaturaFahrenheit + " graus Fahrenheit.");
    }
}

