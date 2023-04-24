import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int num1;
        int num2;
        double media;  
 
        System.out.println("Digite o primeiro número: ");
            num1 = scanner.nextInt(); 

        System.out.println("Digite o segundo número: ");
            num2 = scanner.nextInt();  
            
        media = ((num1 + num2)/2);   

        System.out.println("A média entre os números " + num1 + " e " + num2 + " é " + media );
    
        scanner.close();
    } 
}

    
