package restoran;

public class TableType {
    private String Type;
    private int Kapasitas;

    public TableType(String Type, int Kapasitas) {
        this.Kapasitas = Kapasitas;
        this.Type = Type;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public int getKapasitas() {
        return Kapasitas;
    }

    public void setKapasitas(int kapasitas) {
        Kapasitas = kapasitas;
    }

    public void displayTableTypeDetails() {
        System.out.println("Table Type: " + Type);
        System.out.println("Capacity: " + Kapasitas + " people");
    }

    public static TableType getTableType(int choice) {
        switch (choice) {
            case 1:
                return new TableType("Romantic", 2);
            case 2:
                return new TableType("General", 4);
            case 3:
                return new TableType("Family", 10);
            default:
                System.out.println("Invalid Table Type choice. Returning default.");
                return new TableType("Unknown", 0);
        }
    }
}
