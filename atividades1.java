
import java.util.Scanner;

public class atividades1 {
    public static void main(String[] args) {
        // atividade 1
        Scanner scanner = new Scanner(System.in);
        System.out.print("atividade 1 : ");
        System.out.print("digite sua nota: ");
        double notafinal = scanner.nextDouble();
        if (notafinal >= 6) {
            System.out.println("aprovado");
        } else if (notafinal >= 5 && notafinal < 6) {
            System.out.println("fazer prova substitutiva");
        } else {
            System.out.println("reprovado");
        }

        System.out.print("atividade 2 : ");
        System.out.print("qual seu nome: ");
        String nome = scanner.next();
        System.out.print("qual sua idade: ");
        int idade = scanner.nextInt();
        System.out.print("qual seu genero: ");
        String genero = scanner.next();
        System.out.print("sua cor favorita : ");
        String cor = scanner.next();
        System.out.print("voce pratica esportes :");
        String esportes = scanner.next();
        System.out.println("seu nome e " + nome + ", sua idade e " + idade + ", seu genero e " + genero + ", sua cor favorita e " + cor + " e pratica esportes " + esportes);

        System.out.print("atividade 3 : ");
        System.out.print("digite um numero 1: ");
        int numero1 = scanner.nextInt();
        System.out.print("digite um numero 2: ");
        int numero2 = scanner.nextInt();
        int soma, subtraçao, multiplicação;
        double divisão;
        soma = numero1 + numero2;
        subtraçao = numero1 - numero2;
        multiplicação = numero1 * numero2;
        divisão = numero1 / numero2;
        System.out.println("a soma e " + soma + ", a subtraçao e " + subtraçao + ", a multiplicação e " + multiplicação + " e a divisão e " + divisão);

        System.out.print("atividade 4: ");
        System.out.print("digite um numero: ");
        int nan1 = scanner.nextInt();
        System.out.print("digide outro numero: ");
        int nan2 = scanner.nextInt();
        if (nan1 > nan2) {
            System.out.println("o numero " + nan1 + " e maior que " + nan2);
        } else if (nan2 > nan1) {
            System.out.println("o numero " + nan2 + " e maior que " + nan1);
        } else {
            System.out.println("os numeros sao iguais");
        }
        System.out.print("atividade 5: ");
        System.out.print("digite um numero: ");
        int numero = scanner.nextInt();
        if (numero % 2 == 0) {
            System.out.println("o numero " + numero + " e par");
        } else {
            System.out.println("o numero " + numero + " e impar");
        }
        double rest, rest4, rest6, rest8, rest10;

        System.out.print("atividade 6: ");
        System.out.print("digite um numero: ");
        int num = scanner.nextInt();
        rest = Math.pow(num, 2);
        rest4 = Math.pow(num, 4);
        rest6 = Math.pow(num, 6);
        rest8 = Math.pow(num, 8);
        rest10 = Math.pow(num, 10);
        System.out.println("o numero " + num + " elevado ao quadrado e " + rest + ", elevado a quarta e " + rest4 + ", elevado a sexta e " + rest6 + ", elevado a oitava e " + rest8 + " e elevado a decima e " + rest10);



        System.out.print("atividade 8: ");
        System.out.print("valor de litros de agua do relogio dia 1: ");
        int dia1 = scanner.nextInt();
        System.out.print("valor de litros de agua do relogio dia 30: ");    
        int dia30 = scanner.nextInt();
        int consumo = dia30 - dia1; 
        double sonsumodia = consumo / 30.0;
        System.out.println("o consumo de agua no mes foi de " + consumo + " litros e a media diaria foi de " + sonsumodia + " litros");

        System.out.print("atividade 9: ");
        System.out.print("Digite um número inteiro qualquer: ");
            int numero10 = scanner.nextInt();
            
            double resultado; 
           
            if (numero10 > 10 && numero10 < 100) {
                
                resultado = Math.pow(numero10, 2);
                System.out.printf("O número está entre 10 e 100.\n");
               
                System.out.printf("O valor de %d ao quadrado é: %.5f\n", numero10, resultado);
                
            } 
            
            else {
                
                if (numero10 < 0) {
                    System.out.println("Não é possível calcular a raiz quadrada real de um número negativo.");
                } else {
                    
                    resultado = Math.sqrt(numero10);
                    System.out.printf("O número não está entre 10 e 100.\n");
                    
                    System.out.printf("A raiz quadrada de %d é: %.5f\n", numero10, resultado);
                }
            }


        

        
        








    }
}