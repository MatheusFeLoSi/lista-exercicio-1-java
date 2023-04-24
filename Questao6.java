import java.util.Scanner; 

public class Questao6 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int num1;
        int num2;
        double resu; 
        
        System.out.println("Digite o primeiro valor: ");
            num1 = scanner.nextInt();

        System.out.println("Digite o segundo valor: ");
            num2 = scanner.nextInt();

        resu = Math.log(num1) / Math.log(num2);

        System.out.println("O logaritmo de " + num1 + " na base " + num2 + " é " + resu);

        scanner.close();
    }
}
