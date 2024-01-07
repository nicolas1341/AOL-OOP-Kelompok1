package restoran;

import java.sql.Connection;
import java.sql.PreparedStatement;

import connection.DatabaseConnector;

public class MsReservation {
    private Connection msReservation;

    public MsReservation() {
        DatabaseConnector connector = new DatabaseConnector();
        msReservation = connector.connect("msrestoran");
    }

    void addBooking(int reservationID, String customerName, String cabang, String tableType, int jumlahCustomer) {
        if (msReservation != null) {
            try {
                PreparedStatement insert = msReservation.prepareStatement(
                        "INSERT INTO msreservation(ReservationID, CustomerName, Cabang, TableType, JumlahCustomer, Status) VALUES(?,?,?,?,?, 'DefaultStatus')");
                insert.setInt(1, reservationID);
                insert.setString(2, customerName);
                insert.setString(3, cabang);
                insert.setString(4, tableType);
                insert.setInt(5, jumlahCustomer);
                insert.executeUpdate();
                System.out.println("Booking added successfully!");
            } catch (Exception e) {
                System.out.println("Error while adding booking: " + e.getMessage());
            }
        }
    }
}
