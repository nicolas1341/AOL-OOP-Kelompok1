package restoran;

public class Menu {
    private int MenuID;
    private String MenuName;
    private String MenuType;
    private int MenuPrice;
    private String MenuDescription;

    public Menu(int MenuID, String MenuName, String MenuType, int MenuPrice, String MenuDescription) {
        this.MenuID = MenuID;
        this.MenuName = MenuName;
        this.MenuPrice = MenuPrice;
        this.MenuDescription = MenuDescription;
        this.MenuType = MenuType;
    }

    public int getMenuID() {
        return MenuID;
    }

    public void setMenuID(int menuID) {
        MenuID = menuID;
    }

    public String getMenuName() {
        return MenuName;
    }

    public void setMenuName(String menuName) {
        MenuName = menuName;
    }

    public String getMenuType() {
        return MenuType;
    }

    public void setMenuType(String menuType) {
        MenuType = menuType;
    }

    public int getMenuPrice() {
        return MenuPrice;
    }

    public void setMenuPrice(int menuPrice) {
        MenuPrice = menuPrice;
    }

    public String getMenuDescription() {
        return MenuDescription;
    }

    public void setMenuDescription(String menuDescription) {
        MenuDescription = menuDescription;
    }
}
