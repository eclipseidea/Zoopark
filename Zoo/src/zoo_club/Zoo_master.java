package zoo_club;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Zoo_master {

	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		Zooclub zooclub = new Zooclub();
		Map<Person, List<Animals>> map = new HashMap<Person, List<Animals>>();
		boolean workMenu = true;
		while (workMenu) {
			System.out.println();
			System.out.println();
			System.out.println("input 1 for add person ");
			System.out.println("input 2 for add animall");
			System.out.println("input 3 for delete animal from person ");
			System.out.println("input 4 for delete person from zooclub ");
			System.out.println("input 5 for delete concret animal from all persons ");
			System.out.println("input 6 for exit");
			
			String menu = Zoo_master.scanner.nextLine();

			switch (menu) {
			case "1":
				zooclub.addPersonToClub(map);
				zooclub.showAllZooClub(map);
				break;
			case "2":
				zooclub.addAnimalsToPerson(map);
				zooclub.showAllZooClub(map);
				break;
			case "3":
				zooclub.deleteAnimalFromPerson(map);
				zooclub.showAllZooClub(map);
				break;
			case "4":
				zooclub.deletePersonFromZooclub(map);
				zooclub.showAllZooClub(map);
				break;
			case "5":
				zooclub.delleteConcretAnimallFromAllPerson(map);
				zooclub.showAllZooClub(map);
				break;
			case "6":
				workMenu = false;
				System.out.println("Exit from menu");
				System.exit(0);
				break;
			}
		}
	}
}
