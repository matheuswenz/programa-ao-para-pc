import java.util.Random;
import java.util.Scanner;

public class atividade3 {
  
/*
 * ANOTAÇÕES GERAIS SOBRE O ARQUIVO:
 * * 1. O que são 'imports'?
 * - Java tem muitas ferramentas prontas, organizadas em "pacotes" ou "bibliotecas".
 * - O comando 'import' nos permite "trazer" essas ferramentas para dentro do nosso programa.
 * - Sem o 'import java.util.Scanner', por exemplo, o Java não saberia como ler o que digitamos no teclado.
 */


/*
 * 2. O que é uma 'public class'?
 * - Uma 'class' é o bloco de construção fundamental em Java. Pense nela como uma "planta" ou um "molde"
 * que organiza todo o nosso código: variáveis e métodos (as funções).
 * - 'public' significa que esta classe pode ser acessada por outras partes do seu projeto.
 * - O nome do arquivo (.java) DEVE ser exatamente igual ao nome da classe pública (neste caso, MenuDeEstudos.java).
 */
public class MenuDeEstudos {

    /*
     * 3. O que é o método 'main'?
     * - 'public static void main(String[] args)'
     * - Este é o PONTO DE PARTIDA, o "coração" de qualquer programa Java. A execução sempre começa aqui.
     * - 'public': Pode ser chamado de fora da classe.
     * - 'static': Significa que este método pertence à CLASSE em si, e não a um objeto criado a partir dela.
     * Isso permite que o Java o execute sem precisar criar uma instância da 'MenuDeEstudos'.
     * - 'void': Significa que este método não "devolve" (retorna) nenhum valor quando termina de executar.
     * - 'String[] args': É um parâmetro para receber argumentos da linha de comando (um tópico mais avançado).
     */
    public static void main(String[] args) {

        /*
         * 4. Gerenciando o 'Scanner' de forma inteligente:
         * - Criamos o objeto 'Scanner' UMA ÚNICA VEZ aqui no método principal.
         * - Por que? Para evitar criar e destruir múltiplos "leitores" de teclado, o que é ineficiente.
         * - Depois, nós passamos essa única instância 'leitorMenu' como um "parâmetro" para os outros
         * métodos que precisam dela. É como emprestar uma ferramenta em vez de comprar uma nova a cada tarefa.
         */
        Scanner leitorMenu = new Scanner(System.in);
        int opcao; // Variável para guardar a escolha do usuário no menu.

        /*
         * 5. O laço 'do-while' para o menu:
         * - Este tipo de laço é PERFEITO para menus, pois ele executa o bloco de código (o 'do')
         * PELO MENOS UMA VEZ e só DEPOIS verifica a condição ('while').
         * - Isso garante que o menu seja exibido na primeira vez que o programa roda.
         */
        do {
            // Exibimos o menu de opções. O '\n' serve para pular uma linha, organizando a visualização.
            System.out.println("\n=============================================");
            System.out.println("||       MENU DE ATIVIDADES EM JAVA        ||");
            System.out.println("=============================================");
            System.out.println("|| Escolha a atividade que deseja executar:  ||");
            System.out.println("||-----------------------------------------||");
            System.out.println("|| 1. Exibir valores entre dois números    ||");
            System.out.println("|| 2. Exibir se o segundo for maior        ||");
            System.out.println("|| 3. Exibir em ordem crescente/decrescente||");
            System.out.println("|| 4. Somar pares até digitar 0            ||");
            System.out.println("|| 5. Jogo de Adivinhação                  ||");
            System.out.println("|| 6. Contagem regressiva de 10 minutos    ||");
            System.out.println("|| 7. Soma de ímpares múltiplos de 3       ||");
            System.out.println("||-----------------------------------------||");
            System.out.println("|| 0. Sair do programa                     ||");
            System.out.println("=============================================");
            System.out.print("Digite sua opção: ");

            opcao = leitorMenu.nextInt();

            /*
             * 6. A estrutura 'switch-case':
             * - É uma forma mais limpa e organizada de escrever uma série de 'if-else if-else'.
             * - Ele avalia o valor da variável 'opcao' e "salta" diretamente para o 'case' correspondente.
             * - 'break': É FUNDAMENTAL! Ele impede que o código continue executando os 'cases' abaixo
             * (um efeito chamado "fall-through").
             * - 'default': É o bloco executado se o valor de 'opcao' não corresponder a nenhum 'case'.
             */
            switch (opcao) {
                case 1:
                    atividade1(leitorMenu); // Chamamos o método da atividade, passando o 'leitor' como ferramenta.
                    break;
                case 2:
                    atividade2(leitorMenu);
                    break;
                case 3:
                    atividade3(leitorMenu);
                    break;
                case 4:
                    atividade4(leitorMenu);
                    break;
                case 5:
                    atividade5(leitorMenu);
                    break;
                case 6:
                    atividade6(); // Este método não precisa ler nada do teclado, então não passamos o 'leitor'.
                    break;
                case 7:
                    atividade7(); // Este também não precisa.
                    break;
                case 0:
                    System.out.println("\nPrograma encerrado. Bons estudos!");
                    break;
                default:
                    System.out.println("\nOpção inválida! Por favor, escolha um número do menu.");
                    break;
            }

        } while (opcao != 0); // A condição é checada aqui: o laço continua enquanto 'opcao' for DIFERENTE de 0.

        /*
         * 7. Fechando o 'Scanner':
         * - É uma boa prática "fechar" o 'Scanner' quando temos certeza de que não vamos mais usá-lo.
         * - Isso libera os recursos do sistema que estavam sendo usados para monitorar o teclado.
         */
        leitorMenu.close();
    }

    // ======================================================================================
    // ||                    INÍCIO DOS MÉTODOS DE CADA ATIVIDADE                          ||
    // ======================================================================================
    /*
     * NOTA SOBRE MÉTODOS:
     * Dividir o código em métodos (funções) é um dos princípios mais importantes da programação.
     * Torna o código mais:
     * - ORGANIZADO: Cada método tem uma única responsabilidade.
     * - LEGÍVEL: É mais fácil entender 'atividade1()' do que um bloco gigante de código no 'main'.
     * - REUTILIZÁVEL: Poderíamos chamar 'atividade1()' de várias partes do programa se precisássemos.
     */

    /**
     * ATIVIDADE 1: Exibir valores entre dois números.
     * @param leitor - Recebe o Scanner do 'main' para poder ler a entrada do usuário.
     */
    public static void atividade1(Scanner leitor) {
        System.out.println("\n--- ATIVIDADE 1: Exibir Intervalo ---");
        System.out.print("Digite o número inicial: ");
        int numero1 = leitor.nextInt();
        System.out.print("Digite o número final: ");
        int numero2 = leitor.nextInt();

        System.out.println("A contagem de " + numero1 + " até " + numero2 + " é:");
        
        // O laço 'for' é ideal para repetições com um número DEFINIDO de vezes.
        // Estrutura do 'for': ( inicialização ; condição de parada ; incremento/decremento )
        for (int i = numero1; i <= numero2; i++) {
            System.out.println(i);
        }
    }

    /**
     * ATIVIDADE 2: Exibir a lista somente se o segundo valor for maior que o primeiro.
     * @param leitor - Recebe o Scanner do 'main'.
     */
    public static void atividade2(Scanner leitor) {
        System.out.println("\n--- ATIVIDADE 2: Exibir Intervalo (Condicional) ---");
        System.out.print("Digite o primeiro número: ");
        int numero1 = leitor.nextInt();
        System.out.print("Digite o segundo número: ");
        int numero2 = leitor.nextInt();

        // O 'if' é a principal estrutura de DECISÃO. Ele executa o bloco de código
        // somente se a condição dentro dos parênteses for AVALIADA como VERDADEIRA.
        if (numero2 > numero1) {
            System.out.println("Como " + numero2 + " é maior que " + numero1 + ", a lista será exibida:");
            for (int i = numero1; i <= numero2; i++) {
                System.out.println(i);
            }
        } else {
            // O 'else' (senão) é o bloco executado caso a condição do 'if' seja FALSA.
            System.out.println("O segundo número não é maior que o primeiro. A lista não será exibida.");
        }
    }

    /**
     * ATIVIDADE 3: Exibir em ordem crescente ou decrescente.
     * @param leitor - Recebe o Scanner do 'main'.
     */
    public static void atividade3(Scanner leitor) {
        System.out.println("\n--- ATIVIDADE 3: Ordem Crescente ou Decrescente ---");
        System.out.print("Digite um número: ");
        int n1 = leitor.nextInt();
        System.out.print("Digite outro número: ");
        int n2 = leitor.nextInt();

        // Usamos o 'if-else' para escolher QUAL laço 'for' executar.
        if (n1 < n2) {
            System.out.println("Ordem CRESCENTE (do menor para o maior):");
            // Se n1 for menor, contamos para CIMA (i++ significa i = i + 1).
            for (int i = n1; i <= n2; i++) {
                System.out.println(i);
            }
        } else {
            System.out.println("Ordem DECRESCENTE (do maior para o menor):");
            // Se n1 for maior (ou igual), contamos para BAIXO (i-- significa i = i - 1).
            for (int i = n1; i >= n2; i--) {
                System.out.println(i);
            }
        }
    }

    /**
     * ATIVIDADE 4: Somar números pares até o usuário digitar zero.
     * @param leitor - Recebe o Scanner do 'main'.
     */
    public static void atividade4(Scanner leitor) {
        System.out.println("\n--- ATIVIDADE 4: Soma de Números Pares ---");
        
        // Uma variável "acumuladora" deve sempre ser inicializada, geralmente com 0.
        int soma = 0; 
        int numero;

        System.out.println("Digite números pares (entre 1 e 100). Digite 0 para ver o resultado final.");
        do {
            System.out.print("Informe um número: ");
            numero = leitor.nextInt();

            // CONDIÇÃO COMPOSTA com o operador LÓGICO E (&&)
            // Todas as partes precisam ser verdadeiras para o 'if' ser executado.
            // 1. numero % 2 == 0  -> O número é par? (O operador '%' calcula o RESTO da divisão).
            // 2. numero > 0         -> O número é maior que zero? (Para não somar o 0).
            // 3. numero <= 100      -> O número está dentro do limite?
            if (numero % 2 == 0 && numero > 0 && numero <= 100) {
                soma = soma + numero; // Adiciona o número válido à soma. Forma curta: soma += numero;
                System.out.println("-> Número par adicionado! Soma atual: " + soma);
            }

        } while (numero != 0); // O laço para quando o usuário digita exatamente 0.

        System.out.println("-------------------------------------");
        System.out.println("Soma final dos números pares válidos: " + soma);
    }

    /**
     * ATIVIDADE 5: Jogo de adivinhação.
     * @param leitor - Recebe o Scanner do 'main'.
     */
    public static void atividade5(Scanner leitor) {
        System.out.println("\n--- ATIVIDADE 5: Jogo de Adivinhação ---");
        
        Random sorteador = new Random();
        
        // 'sorteador.nextInt(100)' gera um número de 0 a 99.
        // Somamos 1 para que o intervalo seja de 1 a 100, como esperado no jogo.
        int numeroSecreto = sorteador.nextInt(100) + 1;
        int chute;

        System.out.println("Eu pensei em um número entre 1 e 100. Tente adivinhar!");
        do {
            System.out.print("Qual o seu chute? ");
            chute = leitor.nextInt();

            // A estrutura 'if-else if' é usada para dar dicas específicas.
            if (chute > numeroSecreto) {
                System.out.println("-> ALTO DEMAIS! Tente um número menor.");
            } else if (chute < numeroSecreto) {
                System.out.println("-> BAIXO DEMAIS! Tente um número maior.");
            }
        } while (chute != numeroSecreto); // O jogo continua enquanto o chute for DIFERENTE do número secreto.

        System.out.println("PARABÉNS! Você acertou! O número secreto era " + numeroSecreto);
    }

    /**
     * ATIVIDADE 6: Contagem regressiva de 10 minutos.
     */
    public static void atividade6() {
        System.out.println("\n--- ATIVIDADE 6: Contagem Regressiva 10 Minutos ---");
        System.out.println("Iniciando contagem... (versão rápida)");

        // LAÇOS ANINHADOS (um dentro do outro)
        // Para cada volta do laço de fora (minutos), o laço de dentro (segundos) executa seu ciclo COMPLETO.
        for (int minutos = 9; minutos >= 0; minutos--) { // Conta os minutos de 9 para baixo.
            for (int segundos = 59; segundos >= 0; segundos--) { // Conta os segundos de 59 para baixo.
                
                // 'System.out.printf' permite formatar a saída.
                // '%02d' significa: mostre um inteiro decimal ('d'), e garanta que ele tenha
                // pelo menos 2 dígitos ('2'), preenchendo com zero ('0') à esquerda se necessário.
                System.out.printf("%02d:%02d\n", minutos, segundos);
            }
        }
        System.out.println("TEMPO ESGOTADO!");
    }

    /**
     * ATIVIDADE 7: Soma de ímpares múltiplos de 3, de 1 a 100.
     */
    public static void atividade7() {
        System.out.println("\n--- ATIVIDADE 7: Soma de Ímpares Múltiplos de 3 ---");
        int soma = 0;

        // Percorremos todos os números de 1 a 100.
        for (int i = 1; i <= 100; i++) {
            
            // Verificamos a dupla condição:
            // 1. 'i % 2 != 0': O número é ímpar? (O resto da divisão por 2 NÃO é zero).
            // 2. 'i % 3 == 0': O número é múltiplo de 3? (O resto da divisão por 3 É zero).
            // O '&&' (E lógico) garante que SÓ somamos se AMBAS as condições forem verdadeiras.
            if (i % 2 != 0 && i % 3 == 0) {
                soma += i; // Adiciona o número à soma.
            }
        }
        System.out.println("A soma final é: " + soma);
    }
}
}