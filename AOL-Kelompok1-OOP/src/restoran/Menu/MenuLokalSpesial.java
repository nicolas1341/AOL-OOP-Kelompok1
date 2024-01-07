package restoran;

public class MenuLokalSpesial extends Menu {
    private String MenuDescription;
    private String Location;

    public MenuLokalSpesial(int MenuID, String MenuName, String MenuType, int MenuPrice, String MenuDescription, String Location) {
        super(MenuID, MenuName, MenuType, MenuPrice);
        this.MenuDescription = MenuDescription;
        this.Location = Location;
    }

    public String getMenuDescription() {
        return MenuDescription;
    }

    public void setMenuDescription(String menuDescription) {
        MenuDescription = menuDescription;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }
}
