
import java.util.Scanner;

public class aula4 {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
    System.out.print("te 3 numeros para um suposto triangulo   ");
    int a = scanner.nextInt();
    int b = scanner.nextInt();
    int c = scanner.nextInt();
    if (a < b + c && b < a + c && c < a + b) {
        System.out.println("os numeros podem formar um triangulo");
        if (a == b && b == c) {
            System.out.println("o triangulo e equilatero");
        } else if (a == b || b == c || a == c) {
            System.out.println("o triangulo e isosceles");
        } else {
            System.out.println("o triangulo e escaleno");
        }
    } 
    
      
    
    
}
}