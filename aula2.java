
import java.util.Scanner;

class aula2{
    public static void main(String[] args) {

int A;
int B;

int soma;
int subtracao;
int multiplicacao;
// double e numero com ponto flutuante
double divisao; 
double resto_divisao;
Scanner s = new Scanner(System.in); // variavel de entrada de dados no terminal

System.out.println("Digite o valor de : ");

System.out.println("A :"); 

A = s.nextInt(); // entrada de dados

System.out.println("B :");

B = s.nextInt(); // entrada de dados 



 soma = A + B;
 subtracao = A - B;
 multiplicacao = A * B;
 divisao =  A / B;   
resto_divisao = A % B;



 System.out.println("Soma: " + soma
 + "\nSubtração: " + subtracao + "\nMultiplicação: " + multiplicacao + "\nDivisão: " + divisao);
 System.out.println("Resto da divisão: " + resto_divisao);

 















}
}