package headfirst.designpatterns.composite.menu; 

public class MenuTestDrive {
	public static void main(String args[]) {
		MenuComponent pancakeHouseMenu = new Menu("팬케이크 하우스 MENU", "아침 메뉴");
		MenuComponent dinerMenu = new Menu("객체마을 식당 메뉴", "저녁 메뉴");
		MenuComponent dessertMenu = new Menu("디저트 메뉴", "디저트를 즐겨 보세요");
		MenuComponent allMenus = new Menu("전체 메뉴", "전체 메뉴");
  
		allMenus.add(pancakeHouseMenu);
		allMenus.add(dinerMenu);

		pancakeHouseMenu.add(new MenuItem("팬케이크1", "팬케이크와 토스트", true, 2.99));
		pancakeHouseMenu.add(new MenuItem("팬케이크2", "팬케이크와 시럽", true, 3.49));
		dinerMenu.add(new MenuItem("채식 BLT", "토마토", true, 2.99));
		dinerMenu.add(new MenuItem("BLT", "베이컨 및 샌드위치", false, 2.99));
		dessertMenu.add(new MenuItem("애플 파이", "맛있는 애플파이", true, 1.59));

		dinerMenu.add(dessertMenu);

  
		Waitress waitress = new Waitress(allMenus);
		waitress.printMenu();
	}
}
