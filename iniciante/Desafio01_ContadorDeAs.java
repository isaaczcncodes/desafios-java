import java.util.Scanner;

public class Desafio01_ContadorDeAs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite alguma palavra: ");
        String palavra = scanner.nextLine();

        int contador = 0;

         for(int i = 0; i < palavra.length(); i++){
            char letra = palavra.charAt(i);

            if(letra == 'a' || letra == 'A'){
                contador++;
            }
        }

        System.out.println("A quantidade de letras "+"A"+" é de: " + contador);
        scanner.close();
    }
}