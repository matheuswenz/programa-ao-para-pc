public class aula5 {
    public static void main(String[] args) {
        // aula de loop
        // no inicio do bloco(enquanto) so testa se tiver true
        // no final do bloco(faca enquanto) executa pelo menos uma vez
        //no final do bloco(repita)
        // loop infinito
        // loop controlado por contador
        // com variavel de controle (para) calcula o loop
         // 1. for Usado quando sabemos quantas vezes queremos repetir.

// for (int i = 0; i < 5; i++) {
  //  System.out.println("Repetição: " + i);



// Executa 5 vezes (de 0 até 4).

//2. while Usado quando não sabemos exatamente quantas vezes vai repetir, mas temos uma condição de parada.

// int i = 0;
  // while (i < 5) {
    // System.out.println("Repetição: " + i);
    //  i++;


 //Continua enquanto i < 5 for verdadeiro.

 //3. do-while Parecido com o while, mas garante pelo menos uma execução, pois a condição é verificada depois do bloco.

 // int i = 0;
 // do {
    // System.out.println("Repetição: " + i);
    // i++;
  // } while (i < 5);]
  int cont;
  cont = 0;
   while (cont < 20 ) {
    System.out.println("contador " + cont);
    cont++; // ++ incrementa 1 -- decrementa 1
   }
   cont = 0;
    do {
      System.out.println("contador " + cont);
       cont++;

  } while (cont < 20);
   for (int i=0; i < 20; i++) {
    System.out.println("contador " + i);
   }

}
}
