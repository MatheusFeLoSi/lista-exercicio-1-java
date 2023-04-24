import java.util.Scanner; 

public class Questao7 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        double vendas;
        double sal;
        double per;
        double resu;
         
        
        
        System.out.println("Digite seu salário: ");
            sal = scanner.nextDouble();
           
        System.out.println("Valor de vendas realizadas no mês: ");
            vendas = scanner.nextDouble(); 

        System.out.println("Qual a porcentagem sobre as vendas: ");
            per = scanner.nextDouble();

        resu = sal + (per * vendas);

        System.out.println("O salário total do vendedor é de R$ " + resu);
        
        scanner.close();
    }
}
