import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int filhos; 
        int Hrm; 
        double Hrt = 5.50;
        double fam;
        double Tbruto;


        System.out.println("Horas trabalhadas no mês ");
            Hrm = scanner.nextInt();

        System.out.println("Foram " + Hrm + " horas trabalhadas no mês");

        System.out.println("Valor do salário da família ");
            fam = scanner.nextDouble();
        
        System.out.println("Salário total da família é de R$ " + fam);

        System.out.println("Total de número de filhos");
            filhos = scanner.nextInt();

        System.out.println("A família tem " + filhos + " filhos");

       Tbruto = (Hrm * Hrt) + (fam * filhos);

       System.out.println("O salário bruto do funcionario é de R$ " + Tbruto);
    
        scanner.close();
    }
}
