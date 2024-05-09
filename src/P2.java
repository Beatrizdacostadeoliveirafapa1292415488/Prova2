import java.math.BigInteger;
import java.util.Scanner;

public class P2 {public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    char continuar;
    do {
        System.out.println("digite o numero:");
        int num= scanner.nextInt();
        System.out.println("para encerrar digite n ou N.");
        System.out.println("o fatorial de "+num+" é "+fatorial(num));
        System.out.print("digite o proximo fatorial:");
        continuar= scanner.next().charAt(0);
    }
    while (continuar == 'E' || continuar == 'e');
    System.out.println("Fim do programa.");
    scanner.close();

}
    public static BigInteger fatorial(int num){
        BigInteger fato=BigInteger.ONE;

        for (int i=1;i<=num;i++){
            fato=fato.multiply(BigInteger.valueOf(i));
        }
        return fato;
    }
}
