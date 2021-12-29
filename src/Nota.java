import java.util.Scanner;

public class Nota {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int maior = 0;
        int soma = 0;
        int media;

        int cont = 0;
        do {
            System.out.println("Digite 5 numeros: ");
            numero = scan.nextInt();
            if (numero > maior) maior = numero;
            soma = (soma + numero);
            media = soma / 5;
            cont++;
        }while (cont < 5);

        System.out.println(maior);
        System.out.println(media);

    }
}
