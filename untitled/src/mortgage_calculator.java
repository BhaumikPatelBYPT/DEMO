import java.text.NumberFormat;
import java.util.Scanner;

public class mortgage_calculator {
    public static void main(String[] args) {
        final byte Month_In_Year=12;
        final byte percent=100;
        int NumberOfPayment=0;

        Scanner sc=new Scanner(System.in);
        int principal=0;
        float Monthly_Interest=0;
        while (true) {
            System.out.println("Principal: ");
            principal = sc.nextInt();
            if (principal>=1000 && principal<=1000_000){
                break;
            }else {
                System.out.println("Enter value between 100 and 1000000");
            }
        }
        while (true) {


            System.out.println("Anual Interest Rate: ");
            float anualInterest = sc.nextFloat();
                if (anualInterest>=1 && anualInterest<=30) {

                     Monthly_Interest = anualInterest / Month_In_Year / percent;
                    break;
                }
            System.out.println("Enter values between 1 and 30");
        }

        while (true) {


            System.out.println("Period in Year");
            byte year = sc.nextByte();
            if (year >= 1 && year <= 30) {
                 NumberOfPayment = year * Month_In_Year;
                break;
            }
            System.out.println("Enter a values between 1 and 30");
        }
        double mortage=principal*(Monthly_Interest * Math.pow(1+Monthly_Interest,NumberOfPayment)/Math.pow(1+Monthly_Interest,NumberOfPayment)-1);

        String mortgageFormatted= NumberFormat.getCurrencyInstance().format(mortage);
        System.out.println("Mortgage :"+mortgageFormatted);
    }
}
