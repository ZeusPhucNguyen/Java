package sessions2;

import java.util.Scanner;

public class Order {
    public static void main(String[] args) {
        int quan, ao,totalquan,totalao,total,discount;
        System.out.println("Enter the number of Shirts to order:");
        Scanner scan = new Scanner(System.in);
        ao = scan.nextInt();
        System.out.println("Enter the number of Trousers to order:");
        quan = scan.nextInt();

        totalquan = quan*700;
        totalao = ao*300;
        total = totalao + totalquan;
        System.out.println("Item     Quantity     Price     Total");
        System.out.println("-------------------------------------------------");
        System.out.printf("Shirts        ");
        System.out.printf(ao + "        ");
        System.out.printf("300       ");
        System.out.println(totalao);

        System.out.println();
        System.out.printf("Trousers      ");
        System.out.printf(quan + "        ");
        System.out.printf("700       ");
        System.out.println(totalquan);

        System.out.println();
        System.out.printf("Discount                          ");
        if(total > 3000){
            discount = total/10;
            System.out.println(discount);
        }
        else {
            discount = 0;
            System.out.println(0);
        }
        System.out.println("-------------------------------------------------");

        System.out.printf("Net Total                         ");
        System.out.println(total - discount);
        System.out.println("-------------------------------------------------");

        System.out.println();
        System.out.printf("Point Earned     ");
        if((total - discount) > 3000){
            System.out.println((total - discount)/100);
        }
        else{
            System.out.println(0);
        }
        System.out.println("Thank you!");
    }
}
