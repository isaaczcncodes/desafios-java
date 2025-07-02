import java.util.Scanner;

public class Desafio04_Palindromo {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma frase ou palavra: ");
        String palavra = scanner.nextLine();

        String texto = palavra.replace(" ", "").toLowerCase();

        String invertida = new StringBuilder(texto).reverse().toString();

        if (texto.equals(invertida)){
            System.out.println("Sua mensagem é um palíndromo!");
        }
        else {
            System.out.println("Sua mensagem não é um palíndromo!");
        }
    }
}
