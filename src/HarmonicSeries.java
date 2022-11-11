import java.util.Scanner;

public class HarmonicSeries {
    public static void main(String[] args) {
        int number;
        double series=0.0;
        Scanner scanner=new Scanner(System.in);
        System.out.println("bir sayı giriniz");
        number=scanner.nextInt();

        for (double i=1; i<=number;i++){
            series+=(1/i);


        }
        System.out.println("harmonic seri="+series);
    }
}
