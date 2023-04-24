import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        double celsius;
        double temp;
        
        System.out.println("Digite a temperatura");
            temp = scanner.nextDouble(); 
            
        System.out.println("A temperatura é de " + temp + "°F");
        
        celsius = (temp - 32)/1.8;
        
        System.out.println("Sendo assim, a temperatura em C° é de " + celsius);

        scanner.close();
    }
}
