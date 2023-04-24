import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

        double m;
        double c;
        double i;
        int n;

        System.out.println("Capital a ser aplicado: ");
            c = scanner.nextDouble();
        
        System.out.println("Prazo de aplicação em meses: ");
            n = scanner.nextInt();

        System.out.println("Taxa de juros: ");
            i = scanner.nextDouble(); 

            i = i/100;
            m = c * Math.pow(1 + i, n);
        
        System.out.println("O montante a ser recebido é " + m);

        scanner.close();
    }
}
