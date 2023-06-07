import java.util.Scanner;

public class artikYil {
    public static void main(String[] args) {
        int year;
        Scanner inp =new Scanner(System.in);


        System.out.print("Yılı giriniz: ");
        year =inp.nextInt();

     // 4'e tam bolunecek
     // 100 'un katlarindan sadece 400'e bolunenler alinacak

        if((year %4 == 0 && year % 100 !=0) ||(year % 400 == 0)){
            System.out.println(year + " Artık yıldır!");
        }else{
            System.out.println(year + "Artık yıl değildir!");
        }
    }
}
