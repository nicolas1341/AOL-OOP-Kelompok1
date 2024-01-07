package restoran;

public class Reservation {
    private int ReservationID;
    private String CustomerName;
    private String Cabang;
    private TableType tableType;
    private int JumlahCustomer;
    private String Status;

    public Reservation(int ReservationID, String CustomerName, String Cabang, TableType tableType, int JumlahCustomer, String Status) {
        this.Cabang = Cabang;
        this.CustomerName = CustomerName;
        this.JumlahCustomer = JumlahCustomer;
        this.ReservationID = ReservationID;
        this.Status = Status;
        this.tableType = tableType;
    }

    public TableType getTableType() {
        return tableType;
    }

    public void setTableType(TableType tableType) {
        this.tableType = tableType;
    }

    public int getReservationID() {
        return ReservationID;
    }

    public void setReservationID(int reservationID) {
        ReservationID = reservationID;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String customerName) {
        CustomerName = customerName;
    }

    public String getCabang() {
        return Cabang;
    }

    public void setCabang(String cabang) {
        Cabang = cabang;
    }

    public int getJumlahCustomer() {
        return JumlahCustomer;
    }

    public void setJumlahCustomer(int jumlahCustomer) {
        JumlahCustomer = jumlahCustomer;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public void displayReservationDetails() {
        System.out.println("Reservation ID: " + ReservationID);
        System.out.println("Customer Name: " + CustomerName);
        System.out.println("Branch: " + Cabang);
        System.out.println("Table Type: " + tableType.getType());
        System.out.println("Number of Customers: " + JumlahCustomer);
        System.out.println("Status: " + Status);
    }
}
