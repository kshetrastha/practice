package com.kshetra.practice2;
import com.kshetra.practice2.util.PriceCalculator;
import java.util.Scanner;
public class Program {

    private static void Menu(){
            System.out.println("1. Open Shop");
            System.out.println("2. Report");
            System.out.println("3. Exit");
            System.out.println("Enter Your Choice: ");
        
    }
    private static void Entry(Scanner input, String[]products, double[]prices,int[] quantity){
        for (int i = 0; i < products.length; i++) {
            System.out.printf("Enter the price of %s : ", products[i]);
            prices[i] = input.nextDouble();

            System.out.printf("Enter the quantity %s : ", products[i]);
            quantity[i] = input.nextInt();
        }

    }
    private static void Report(String[] products,double[]prices, int[]quantity) {
        System.out.println("Product Price Table");
        System.out.println("************************************");
        System.out.println("Product Name \t Quantity \t Product Prices\t Total");
        System.out.println("************************************");

        double grandTotal = 0;

        for (int i = 0; i < products.length; i++) {

            double total = quantity[i] * prices[i];
            System.out.printf("%s\t%d\t%f\t%f\r\n", products[i], quantity[i], prices[i], total);
            grandTotal += total;
        }

        System.out.println("The grand total is :" + grandTotal);
    }
    


        
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] products = { "TV", "DVD", "AC", "COOLER" };
        int size = products.length;
        double[] prices = new double[size];
        int[] quantity = new int[size];

        while (true){
            Menu();
            int choice = input.nextInt();
            if (choice == 1) {
                Entry(input, products,prices,quantity);
                }
         

        if (choice == 2) {

               Report(products, prices, quantity);

            }

            else {
                System.exit(0);
            }
        }
    }

}
