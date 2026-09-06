/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.flowershopsale;
    import java.util.Scanner;
/**
 *
 * @author alyss
 */
public class FlowerShopSale {

   
    public static void main(String[] args) {
        // Bouquet types
        try (Scanner sc = new Scanner(System.in)) {
            // Bouquet types
            String[] bouquetTypes = {"Roses", "Tulips", "Lilies"};
            // Days of the week
            String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
            
            // 2D array: rows = days, columns = bouquet types
            int[][] sales = new int[days.length][bouquetTypes.length];
            
            // Input sales data
            System.out.println("Enter sales data for each day and bouquet type:");
            for (int i = 0; i < days.length; i++) {
                System.out.println("---- " + days[i] + " ----");
                for (int j = 0; j < bouquetTypes.length; j++) {
                    System.out.print("Enter sales for " + bouquetTypes[j] + ": ");
                    sales[i][j] = sc.nextInt();
                }
            }
            
            // Report header
            System.out.println("\nFLOWER SHOP WEEKLY SALES REPORT");
            System.out.println("===================================");
            System.out.printf("%-10s", "DAY");
            for (String bouquet : bouquetTypes) {
                System.out.printf("%10s", bouquet);
            }
            System.out.printf("%10s%n", "TOTAL");
            System.out.println("---------------------------------------------------------------");
            
            // Totals
            int[] bouquetTotals = new int[bouquetTypes.length];
            int overallTotal = 0;
            
            // Print table row by row
            for (int i = 0; i < days.length; i++) {
                System.out.printf("%-10s", days[i]);
                int dayTotal = 0;
                for (int j = 0; j < bouquetTypes.length; j++) {
                    System.out.printf("%10d", sales[i][j]);
                    dayTotal += sales[i][j];
                    bouquetTotals[j] += sales[i][j];
                }
                System.out.printf("%10d%n", dayTotal);
                overallTotal += dayTotal;
            }
            
            // Print totals row
            System.out.println("---------------------------------------------------------------");
            System.out.printf("%-10s", "TOTAL");
            for (int j = 0; j < bouquetTypes.length; j++) {
                System.out.printf("%10d", bouquetTotals[j]);
            }
            System.out.printf("%10d%n", overallTotal);
            
            // Detailed totals
            System.out.println();
            for (int j = 0; j < bouquetTypes.length; j++) {
                System.out.println("Total sales for " + bouquetTypes[j] + ": " + bouquetTotals[j]);
            }
            System.out.println("Overall total sales for the week: R " + overallTotal);
        }
    }
    
}


   
    
