import java.util.Scanner;
import java.lang.Math;

public class Questao10 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        double A;
        double B;
        double C; 

        System.out.println("Digite o primeiro valor: ");    
            A = scanner.nextDouble(); 
        
        System.out.println("Digite o segundo valor: ");    
            B = scanner.nextDouble(); 
        
        System.out.println("Digite o terceiro valor: ");    
            C = scanner.nextDouble();
            
         System.out.println("A média aritmética é: " + (A+B+C)/3); 
         
         System.out.println("A média harmônica é: " + 3/((1/A)+(1/B)+(1/C))); 
         
         System.out.println("A média geométrica é: " + Math.cbrt(A*B*C)); 
            
         scanner.close();
    }
}
