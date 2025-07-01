import java.util.Scanner;

public class Desafio03_VerificaVogais {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma palavra: ");

        String palavra = scanner.nextLine();
        boolean Vogais = false;

        for (int i = 0; i < palavra.length(); i++) {
            char letra = Character.toLowerCase(palavra.charAt(i));

            if(letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                Vogais = true;
                break;
            }
        }
        if(Vogais) {
            System.out.println("Sua palavra tem vogais.");
        }
        else {
            System.out.println("Sua palavra não tem vogais.");
        }
    }
}