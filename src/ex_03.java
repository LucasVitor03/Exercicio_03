import java.util.Scanner;

public class ex_03 {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = sc.nextInt();

        System.out.print("Digite um segundo número: ");
        int numero2 = sc.nextInt();

        int soma = numero + numero2;
        System.out.print(numero + " + " + numero2 + " = " + soma);

        sc.close();

    }
}