import java.util.Scanner;

public class helloworld {

    public static void main(String[] args) {
        System.out.println("ola mundo");
        Scanner input = new Scanner(System.in);

        System.out.print("Digite seu idade: ");
        int idade = input.nextInt();

        System.out.print("qual o seu nome: ");
        String nome = input.next();

        System.out.printf("sua idade: %s",idade);
        System.out.println();
        System.out.printf("seu nome: %s",nome);
        System.out.println();

    }
}