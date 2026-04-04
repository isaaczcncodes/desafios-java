import java.util.Scanner;

public class Desafio07_CalculadoraSimples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num1;
        double num2;
        char operacao;
        double resultado = 0;

        System.out.println("\nDigite o primeiro número da operação: ");
        num1 = Double.parseDouble(scanner.nextLine());

        System.out.println("\nDigite a operação escolhida (+, -, * ou /): ");
        operacao = scanner.nextLine().charAt(0);
        
        System.out.println("\nDigite o segundo número da operação: ");
        num2 = Double.parseDouble(scanner.nextLine());

        switch (operacao) {
            case '+':
                resultado = (num1 + num2);
                break;

            case '-':
                resultado = (num1 - num2);
                break;

            case '*':
                resultado = (num1 * num2);
                break;

            case '/':
                if (num2 == 0) {
                    System.out.println("\nOperação inválida! É impossível dividir por 0.");
                    scanner.close();
                    return;
                }
                resultado = (num1 / num2);
                break;
            
            default:
                System.out.println("\nOperação Inválida!");
                break;
        }

        System.out.println("\nResultado: " + num1 + " " + operacao + " " + num2 + " = " + resultado);
        System.out.println("O resultado da operação é: " + resultado);
        scanner.close();
    }
}