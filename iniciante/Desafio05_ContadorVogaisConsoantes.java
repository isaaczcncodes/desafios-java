import java.util.Scanner;

public class Desafio05_ContadorVogaisConsoantes{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua palavra: ");
        String palavra = scanner.nextLine();

        int contadorVogais = 0;
        int contadorConsoantes = 0;

        for(int i = 0; i < palavra.length(); i++){
            char letra = palavra.charAt(i);
            letra = Character.toLowerCase(letra);

            if(letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u'){
                contadorVogais++;
            } else {
                contadorConsoantes++;
            }
        }

        System.out.println("A quantidade de vogais na sua palavra é: " + contadorVogais + ", e quantidade de consoantes é: " + contadorConsoantes);
        scanner.close();
    }
}