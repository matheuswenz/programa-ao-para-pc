
import java.util.Scanner;

public class atividade2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // atividade 1
        // Calcular o volume de uma esfera dado o raio R
        System.out.print(" mede um numero para ser o R para calcyular volume da esfera  ");
        double R = scanner.nextDouble();
        double volume = (4.0 / 3.0) * Math.PI * Math.pow(R, 3);
        System.out.printf("O volume da esfera com raio %.2f e: %.2f%n", R, volume);
        // atividade 2
        System.out.print(" me fale sua matricula, numero de horas tarbalhadas e o valor que voce recebe por hora, qual mes se refere as informaçao  ");
        String matricula = scanner.next();
        int horasTrabalhadas = scanner.nextInt();
       
        double valorPorHora = scanner.nextDouble();
        String mes = scanner.next();
        int horasNormais = Math.min(horasTrabalhadas, 200);
        int horasExtras = Math.max(horasTrabalhadas - 200, 0);
        double salarioBase = horasNormais * horasTrabalhadas;
        double adicionalExtra = horasExtras * (horasTrabalhadas * 1.5); 
        double salarioTotal = salarioBase + adicionalExtra;
        System.out.println("\n--- Dados do Funcionário ---");
        System.out.println("Matrícula: " + matricula);
        System.out.println("Horas trabalhadas: " + horasTrabalhadas);
        System.out.println("Mês: " + mes);
        System.out.printf("Salário total: R$ %.2f%n", salarioTotal);

        if (horasExtras > 0) {
            System.out.println("O funcionário fez " + horasExtras + "h extras no mês.");
        } else {
            System.out.println("O funcionário não fez horas extras no mês.");
        }
        // atividade 3
        System.out.print(" vou organizar seu numeros em ordem crescente, me fale 3 numeros  ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int menor, meio, maior;
        if (num1 <= num2 && num1 <= num3) {
            menor = num1;
            if (num2 <= num3) {
                meio = num2;
                maior = num3;
            } else {
                meio = num3;
                maior = num2;
            }
        } else if (num2 <= num1 && num2 <= num3) {
            menor = num2;
            if (num1 <= num3) {
                meio = num1;
                maior = num3;
            } else {
                meio = num3;
                maior = num1;
            }
        } else {
            menor = num3;
            if (num1 <= num2) {
                meio = num1;
                maior = num2;
            } else {
                meio = num2;
                maior = num1;
            }
        }
        System.out.println("Números em ordem crescente: " + menor + ", " + meio + ", " + maior);
        // atividade 4
        System.out.print(" me fale sua altura, peso e sexo (M ou F) e eu te digo seu peso ideal e se voce esta acima ou abaixo do peso ideal  ");

        double altura = scanner.nextDouble();
        double peso = scanner.nextDouble();
        String sexo = scanner.next();
        double pesoIdeal;
        if (sexo.equalsIgnoreCase("M")) {
            pesoIdeal = 72.7 * altura - 58;
        } else if (sexo.equalsIgnoreCase("F")) {
            pesoIdeal = 62.1 * altura - 44.7;
        } 
        else {
            System.out.println("Sexo inválido. Use 'M' para masculino ou 'F' para feminino.");
            return;
        }
        System.out.printf("Seu peso ideal é: %.2f kg%n", pesoIdeal);
        if (peso < pesoIdeal) {
            System.out.println("Você está abaixo do peso ideal.");
        } else if (peso > pesoIdeal) {
            System.out.println("Você está acima do peso ideal.");
        } else {
            System.out.println("Você está no peso ideal.");
        }
        // atividade 5
        System.out.print(" me fale seu data de nascimento e vou falar se pode votar e dirigir  ");
        int anoNascimento = scanner.nextInt();
        int anoAtual = 2025;
        int idade = anoAtual - anoNascimento;
        if (idade >= 18) {
            System.out.println("Você pode votar e dirigir.");
        } else if (idade >= 16) {
            System.out.println("Você pode votar, mas não pode dirigir.");
        } else {
            System.out.println("Você não pode votar nem dirigir.");
        }
        // atividade 6
        System.out.print("me fale 2 numeros e o operador (+, -, *, /) que deseja fazer  ");
        double numero1 = scanner.nextDouble();
        double numero2 = scanner.nextDouble();
        String operador = scanner.next();
        double resultado;
        switch (operador) {
            case "+":
                resultado = numero1 + numero2;
                System.out.printf("Resultado: %.2f%n", resultado);
                break;
            case "-":
                resultado = numero1 - numero2;
                System.out.printf("Resultado: %.2f%n", resultado);
                break;
            case "*":
                resultado = numero1 * numero2;
                System.out.printf("Resultado: %.2f%n", resultado);
                break;
            case "/":
                if (numero2 != 0) {
                    resultado = numero1 / numero2;
                    System.out.printf("Resultado: %.2f%n", resultado);
                } else {
                    System.out.println("Erro: Divisão por zero não é permitida.");
                }
                break;
            default:
                System.out.println("Operador inválido. Use +, -, * ou /.");
        }
        
        

        
    }
    
}
