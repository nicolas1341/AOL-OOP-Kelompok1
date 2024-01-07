package restoran;

public class MenuSpesial extends Menu {
	private String MenuDescription;
	public MenuSpesial(int MenuID, String MenuName, String MenuType, int MenuPrice, String MenuDescription) {
		super(MenuID, MenuName, MenuType, MenuPrice);
		this.MenuDescription = MenuDescription;
	}
	public String getMenuDescription() {
		return MenuDescription;
	}
	public void setMenuDescription(String menuDescription) {
		MenuDescription = menuDescription;
	}
	

}
