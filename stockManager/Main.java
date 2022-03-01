package stockManager;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 *** created common object of service class to run multiple functions ***
		 */
		StockPortfolio obj = new StockPortfolio();

		/*
		 ** Loop to always ask for the options and call that function
		 */
		while (true) {
			System.out.println(" 1: To Add New Stock \n 2: To Display StockPortfolio ");
			System.out.println("Enter your choice: ");
			int opt = sc.nextInt();

			switch (opt) {
			case 1:
				obj.addStocks();
				break;
			case 2:
				obj.stockReport();
				break;
			default:
				System.out.println("Invalid Input");
				break;
			}
		}

	}

}