import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

        double preco;
        double porc;
        double total;

        System.out.println("Qual o preço do produto? ");
            preco = scanner.nextDouble(); 
 
        porc = preco * 0.10;     
        total = porc + preco;
        
        System.out.println("O acréscimo de preço do produto é de " + porc);

        System.out.println("O novo preço do produto é de R$ " + total);
            
        scanner.close();
    }    
}

