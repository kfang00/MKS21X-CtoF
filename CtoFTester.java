public class CtoFTester {
  public static double celsiusToFahrenheit(double celsius) {
    return (celsius * 9.0/5) + 32;
  }
  public static double fahrenheitToCelsius(double fahrenheit) {
    return (fahrenheit - 32) * (5/9.0);
  }
  public static void main(String[] args){
    System.out.println(celsiusToFahrenheit(30));
    System.out.println(fahrenheitToCelsius(90));
  }

}



