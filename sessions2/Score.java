package sessions2;


import java.util.Scanner;

public class Score {
    public static void main(String[] args) {
        int toan1, toan2,kh1,kh2,eng1,eng2,total1,total2,hb1,hb2;
        System.out.println("Enter marks obtained in Maths:");
        Scanner scan = new Scanner(System.in);
        toan1 = scan.nextInt();
        System.out.println("Enter marks obtained in Science:");
        kh1 = scan.nextInt();
        System.out.println("Enter marks obtained in English:");
        eng1 = scan.nextInt();

        System.out.println("Enter marks obtained in Maths:");
        toan2 = scan.nextInt();
        System.out.println("Enter marks obtained in Science:");
        kh2 = scan.nextInt();
        System.out.println("Enter marks obtained in English:");
        eng2 = scan.nextInt();

        System.out.println("Marks of LingChi:");
        System.out.printf("Maths =  %d",toan1);
        System.out.println();
        System.out.printf("Science = %d",kh1);
        System.out.println();
        System.out.printf("English = %d",eng1);
        System.out.println();
        System.out.println();
        System.out.println("Marks of ThuyDuong:");
        System.out.printf("Maths = %d",toan2);
        System.out.println();
        System.out.printf("Science = %d",kh2);
        System.out.println();
        System.out.printf("English = %d",eng2);
        System.out.println();
        System.out.println();
        total1 = toan1 + kh1 + eng1;
        total2 = toan2 + kh2 + eng2;
        hb1 = total1/3;
        hb2 = total2/3;
        System.out.printf("Total marks scored by LingChi =  %d",total1);
        System.out.println();
        System.out.printf("Percentage = %d",hb1);
        System.out.println("%");
        System.out.println();
        System.out.println();

        System.out.printf("Total marks scored by ThuyDuong =  %d",total2);
        System.out.println();
        System.out.printf("Percentage = %d ",hb2);
        System.out.println("%");
        System.out.println();
        System.out.println();

        System.out.println("Is LingChi's percentage lesser than ThuyDuong?");
        if( hb1 >= hb2){
            System.out.println("No");
        }
        else if (hb1 < hb2){
            System.out.println("Yes");
        }

        System.out.println("Is LingChi's percentage greater than ThuyDuong?");
        if( hb1 > hb2){
            System.out.println("Yes");
        }
        else if (hb1 <= hb2){
            System.out.println("No");
        }
        System.out.println("LingChi's and ThuyDuong's percentage are equal?");
        if( hb1 == hb2){
            System.out.println("Yes");
        }
        else if (hb1 < hb2 || hb2 < hb1){
            System.out.println("No");
        }

        System.out.printf("Scholership Amount for LingChi = ");
        if(hb1 > 75){
            System.out.printf("$20000");
        }
        if(hb1 >= 65 && hb1 <= 75){
            System.out.printf("$10000");
        }
        else {
            System.out.printf("$0");
        }

        System.out.println();
        System.out.printf("Scholership Amount for ThuyDuong = ");
        if(hb2 > 75){
            System.out.printf("$20000");
        }
        if(hb2 >= 65 && hb2 <= 75){
            System.out.printf("$10000");
        }
        else {
            System.out.printf("$0");
        }

    }
}
