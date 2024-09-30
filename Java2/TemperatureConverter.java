import java.util.Scanner;
class TemperatureConverter{
    public static void main(String args[]){
        System.out.println("Welcome to TemperatureConverter! Input a temperature in degrees fahrenheit to recieve an output in degrees celsius.");
       

        Scanner scanner = new Scanner(System.in);
        
        if (scanner.hasNextInt()){
            int temperatureInput = scanner.nextInt();
            if (temperatureInput < -460) {
            System.out.println("Invalid temperature.");
            }
            else if (temperatureInput > 134) {
            System.out.println("No it isn't.");
            }
            else{
            double temperatureOutput = (temperatureInput - 32) * 5 / 9;
            System.out.println(temperatureOutput);
            }
       
        }
    scanner.close();
    }
}