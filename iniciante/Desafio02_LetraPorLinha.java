import java.util.Scanner;

public class Desafio02_LetraPorLinha {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma palavra: ");
        String palavra = scanner.nextLine();

        System.out.println("Letras:");

        for (int i = 0; i < palavra.length(); i++){
            char letra = palavra.charAt(i);
            System.out.println(letra);
        }
    }
}
