import java.util.Scanner;


public class aulajava3 { 
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

         System.out.print("Digite um valor byte: "); // byte e um tipo de dado inteiro de 8 bits

        byte valorByte = scanner.nextByte();
        System.out.println("Valor byte: " + valorByte);

        System.out.print("Digite um valor short: ");// short e um tipo de dado inteiro de 16 bits
        short valorShort = scanner.nextShort();
        System.out.println("Valor short: " + valorShort);

        System.out.print("Digite um valor int: ");// int e um tipo de dado inteiro de 32 bits
        int valorInt = scanner.nextInt();
        System.out.println("Valor int: " + valorInt);

        System.out.print("Digite um valor long: ");// long e um tipo de dado inteiro de 64 bits
        long valorLong = scanner.nextLong();
        System.out.println("Valor long: " + valorLong);

        System.out.print("Digite um valor float: ");// float e um tipo de dado com ponto flutuante de 32 bits
        float valorFloat = scanner.nextFloat();
        System.out.println("Valor float: " + valorFloat);

        System.out.print("Digite um valor double: ");// double e um tipo de dado com ponto flutuante de 64 bits
        double valorDouble = scanner.nextDouble();
        System.out.println("Valor double: " + valorDouble);

        System.out.print("Digite um caractere (char): ");// char e um tipo de dado que armazena um unico caractere
        char valorChar = scanner.next().charAt(0);
        System.out.println("Valor char: " + valorChar);

        System.out.print("Digite um valor boolean (true ou false): ");// boolean e um tipo de dado logico que armazena true ou false
        boolean valorBoolean = scanner.nextBoolean();
        System.out.println("Valor boolean: " + valorBoolean);

        scanner.close();
    }
}

    

