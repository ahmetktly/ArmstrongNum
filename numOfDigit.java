import java.util.Scanner;

public class numOfDigit{

    public static void main(String[] args) {
        
        Scanner inp=new Scanner(System.in);

        System.out.print("Basamak sayıları toplamını merak ettiğiniz sayıyı giriniz :");

        int num = inp.nextInt();
        int num2 = num;
        int basValue;
        int ans = 0;
        

        while (num2 != 0) {
            
            num2 /= 10;
            
        }

        num2 = num;

        while (num2 != 0) {

            basValue = num2 % 10;
           
            ans += basValue;

            num2 /= 10;

        }

        System.out.println(num + " Sayısının basamak sayılarının toplamı = "+ ans);


    }
}