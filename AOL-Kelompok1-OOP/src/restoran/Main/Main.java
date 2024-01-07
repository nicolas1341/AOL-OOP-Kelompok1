package restoran;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Properties;

import connection.DatabaseConnector;

public class Main {
	private static int reservationIdCounter = 1;

	public static void main(String[] args) {
		menu();
		
		MsStaff  staff = new MsStaff();
		staff.insertStaff(101, "Brandon", "Bandung");
		staff.insertStaff(102, "Vincent", "Bandung");
		staff.insertStaff(103, "John", "Jakarta");
		staff.insertStaff(104, "Carmel", "Jakarta");
		staff.insertStaff(105, "Pearly", "Surabaya");
		staff.insertStaff(106, "Billy", "Surabaya");

	}
	private static void menu() {
		Scanner scanner = new Scanner(System.in);
		int choice = 0;
		do {
			System.out.println("\n=== LaperAh Restaurant ===");
			System.out.println("1. Add Booking");
			System.out.println("2. View Table");
			System.out.println("3. Add Tables");
			System.out.println("4. Add Menu");
			System.out.println("5. View Menu");
			System.out.println("6. Checkout");
			System.out.println("7. Exit");
			choice = scanner.nextInt();
			
			switch (choice) {
				case 1:
					scanner.nextLine();
				    System.out.print("Enter Customer Name: ");
				    String customerName = scanner.nextLine();
				    System.out.print("Enter Branch (e.g., Jakarta, Bandung, Surabaya): ");
				    String branch = scanner.nextLine();
				    System.out.println("Select Table Type:");
				    System.out.println("1. Romantic for 2 People");
				    System.out.println("2. General for 4 People");
				    System.out.println("3. Family for 10 People");
				    System.out.print("Enter Table Type (1/2/3): ");
				    int tableTypeChoice = scanner.nextInt();
				    String tableType = getTableType(tableTypeChoice); 
				    System.out.print("Enter Number of Customers: ");
				    int numberOfCustomers = scanner.nextInt();

				    MsReservation reservation = new MsReservation();
				    reservation.addBooking(reservationIdCounter++, customerName, branch, tableType, numberOfCustomers);
				    break;

				
				case 2: 
					System.out.println("1. Romantic for 2 People");
					System.out.println("2. General for 4 People");
					System.out.println("3. Family for 10 People");
					break;
				case 3: 
					break;
				case 4: 
					break;
				case 5: 
					break;
				case 6:
					break;
				case 7: 
					break;
				 default:
	                    System.out.println("Invalid choice. Please try again.");
			}
		}while(choice !=7); 
	}
	private static String getTableType(int tableTypeChoice) {
		return null;
	}
	

}
