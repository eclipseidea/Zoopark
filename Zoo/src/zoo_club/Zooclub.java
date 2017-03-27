package zoo_club;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.UUID;

public class Zooclub {

	Map<Person, List<Animals>> map;
	
	public Zooclub(Map<Person, List<Animals>> map, List<Animals> animals) {
		super();
		this.map = map;
	}

	public Zooclub() {
		
	}

	public Zooclub(Map<Person, List<Animals>> map) {
		super();
		this.map = map;
	}

	
	public Map<Person, List<Animals>> getMap() {
		return map;
	}

	public void setMap(Map<Person, List<Animals>> map) {
		this.map = map;
	}

	@Override
	public String toString() {
		return "Zooclub [map=" + map + "]";
	}

	public void addPersonToClub(Map<Person, List<Animals>> map) {
		List<Animals> animals = new ArrayList<Animals>();
		String name = "NAME"+ UUID.randomUUID().toString().replaceAll("[^a-zA-Z]", "").toUpperCase().substring(0, 3);
		int age = 8 + (int) (Math.random() * (80 - 8));
		Person person = new Person(name, age);
		map.put(person, animals);
	}

	public void addAnimalsToPerson(Map<Person, List<Animals>> map) {
		System.out.println("Enter name of person");
		String nameOfPerson = Zoo_master.scanner.nextLine();
		String nameOfAnimalls = "name"+ UUID.randomUUID().toString().replaceAll("[^a-zA-Z]", "").toUpperCase().substring(0, 3);
		int types = 1 + (int) (Math.random() * (10 - 1));
		String type = (types > 5) ? "Cat" : "Dog";
		boolean search = false;
		for (Map.Entry<Person, List<Animals>> mep : map.entrySet()) {
		if (nameOfPerson.equals(mep.getKey().getName())) {
		    mep.getValue().add(new Animals(type, nameOfAnimalls));
				search = true;
			}
		}
		if (!search) {
			System.out.println("your person  not founded");
		}
	}
   
	public void deleteAnimalFromPerson(Map<Person, List<Animals>> map){
		    System.out.println("Enter animal");
	        String animall = Zoo_master.scanner.nextLine();
	    	for (Map.Entry<Person, List<Animals>> mep: map.entrySet()) {
	    		Iterator<Animals>iterator = mep.getValue().iterator();
	    		while (iterator.hasNext()) {
	    			Animals animal = iterator.next();
			    	 if(animal.getName().equalsIgnoreCase(animall)){
	    				iterator.remove();
	    			}
				}
	    	}
	}

	public void deletePersonFromZooclub(Map<Person, List<Animals>> map){
		   System.out.println("Enter name of person");
	       String name = Zoo_master.scanner.nextLine();
	       Iterator<Map.Entry<Person, List<Animals>>>iterator = map.entrySet().iterator();
   		         while (iterator.hasNext()) {
   			        Entry<Person, List<Animals>> person = iterator.next();
		    	       if(person.getKey().getName().equalsIgnoreCase(name)){
   				           iterator.remove();
		    	       }
		         }
	}
	
    public void delleteConcretAnimallFromAllPerson(Map<Person, List<Animals>> map){
    	System.out.println("Enter type of animal");
    	String type = Zoo_master.scanner.nextLine(); 
    	for (Map.Entry<Person, List<Animals>> mep: map.entrySet()) {
    		Iterator<Animals>iterator = mep.getValue().iterator();
    		while (iterator.hasNext()) {
    			Animals animal = iterator.next();
		    	 if(animal.getType().equalsIgnoreCase(type)){
    				iterator.remove();
    			}
			}
    	}
    }
	
	public void showAllZooClub(Map<Person, List<Animals>> map){
    	for (Map.Entry<Person, List<Animals>> mep: map.entrySet()) {
			System.out.println("Person "+mep.getKey().getName()+" have got:" );
		     for (int i = 0; i < mep.getValue().size(); i++) {
		    	 System.out.println(mep.getValue().get(i));
			}
    	}
    }
}
