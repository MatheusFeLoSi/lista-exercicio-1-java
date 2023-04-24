import java.util.Scanner;

public class Questao8 {
     public static void main(String[] args) {

         Scanner scanner = new Scanner(System.in);

         int NV;
         int NR;
         int NM;
         int NC;

         System.out.print("Digite a quantidade de veículos: ");
         NV = scanner.nextInt();

         System.out.print("Digite o total de rodas: ");
         NR = scanner.nextInt();

         NM = (NR - (NV * 4)) / 2;
         NC = NV - NM;

         System.out.println("Total de carros: " + NC);
        
         System.out.println("Total de motos: " + NM);

         scanner.close();
     }
 }

