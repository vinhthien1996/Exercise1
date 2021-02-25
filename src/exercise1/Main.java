package exercise1;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Menu menu = new Menu();

		while (true) {
			int choose = menu.getMenu();

			switch (choose) {
				// ADD STUDENT
				case 1: {
					while(true) {					
						boolean rsMenu;
						rsMenu = menu.addStudent();
						
						if (!rsMenu)
							break;
					}
					break;
				}
				
				// SHOW STUDENT
				case 2: {
					menu.showListStudent();
					break;
				}
				
				// FIND STUDENT
				case 3: {
					menu.menuFind();
				}
				
				
			}
		}
	}

	public Main() {
		super();
	}

}