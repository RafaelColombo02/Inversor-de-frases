import java.util.Scanner;

public class InversorFrases {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar uma frase ao usuário
        System.out.print("Digite uma frase: ");
        String frase = scanner.nextLine();

        // Remover os espaços em branco da frase
        String fraseSemEspacos = frase.replaceAll("\\s+", "");

        // Inverter a frase
        StringBuilder fraseInvertida = new StringBuilder(fraseSemEspacos).reverse();

        // Exibir a frase invertida
        System.out.println("Frase invertida: " + fraseInvertida);

        scanner.close();
    }
}
