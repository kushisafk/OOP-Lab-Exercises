import java.util.Scanner;

public class SalesTaxCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double price, ap, tax;
        double sum_price=0;
        double sum_ap=0;
        double sum_tax=0;
        System.out.print("Enter the price(-1 to end): $");
        price = sc.nextDouble();

        while (price != -1){
            ap = price/1.07;
            tax = price-ap;
            sum_price += price;
            sum_ap += ap;
            sum_tax += tax;
            System.out.printf("Actual price: $%.2f, Sales Tax: %.2f%n", ap, tax);
            System.out.print("Enter the price(-1 to end): $");
            price = sc.nextDouble();
        }
        System.out.printf("Total Price: $%.2f%n",sum_price);
        System.out.printf("Total Actual Price: $%.2f%n",sum_ap);
        System.out.printf("Total Sales Tax: $%.2f%n",sum_tax);    
    }
}
