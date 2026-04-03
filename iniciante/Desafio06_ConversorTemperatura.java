import java.util.Scanner;

public class Desafio06_ConversorTemperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite 1 caso queira fazer a conversao de Celsius para Fahrenheit");
        System.out.println("Digite 2 caso queira fazer a conversao de Fahrenheit para Celsius");
        int decisao = Integer.parseInt(scanner.nextLine());

        if(decisao == 1){
            System.out.println("Digite o valor em Celsius: " );
            double tempCelsius = Double.parseDouble(scanner.nextLine());

            double tempFahrenheit = (tempCelsius * 9.0/5.0 + 32);

            System.out.println("Em Fahrenheit: " + tempFahrenheit + "°");
        }
        else{
            System.out.println("Digite o valor em Fahrenheit: ");
            double tempFahrenheit = Double.parseDouble(scanner.nextLine());

            double tempCelsius = (tempFahrenheit - 32) * 5.0/9.0;

            System.out.println("Em Celsius: " + tempCelsius + "°");
        }
        scanner.close();
    }
}