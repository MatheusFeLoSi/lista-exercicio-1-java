import java.util.Scanner;

public class Questao9 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        double seg;
        
        System.out.println("Escreva o numero que deseja em segundos ");
            seg = scanner.nextInt();

        System.out.println(seg + "s corresponde a " + seg/60 + " minutos, " + seg/3600 +  " horas " );
 
        scanner.close();
    }
}
