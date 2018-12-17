package createdata;

import java.util.ArrayList;
import java.util.Random;
import create.Country;
import create.Event;
import create.Location;
import create.Organization;
import create.Person;
import create.Relationship;

public class CreateData {
	static ArrayList<Relationship> relationshipList;
	public Country country;
	public Event event;
	public Location location;
	public Organization organization;
	public String quanhe;
	public static Person person;
	
	int n1,n2,n3,n4;
	
	// ham random mot so tu nhien trong khoang cho truoc 
	public static int rand(int min, int max) {
        try {
            Random rn = new Random();
            int range = max - min + 1;
            int randomNum = min + rn.nextInt(range);
            return randomNum;
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }
	
	
	// tao ra n moi quan he
	public CreateData(int n) {
		relationshipList = new ArrayList<>();
		Manager manager = new Manager("D:\\Person.txt", "D:\\Country.txt", "D:\\QuanHe.txt", "D:\\Organization.txt", "D:\\Event.txt","D:\\Location.txt","D:\\Time.txt");
		while (n>0) {
			n1 = rand(0,n);
			n2 = rand(0,n);
			n3 = rand(0,n);
			n4 = rand(0,n);
			
			Relationship relationship = new Relationship(manager.personList.get(n1 % (manager.personList.size())),manager.organizationList.get(n2 % (manager.organizationList.size())), manager.quanHeList.get(n3 % (manager.quanHeList.size())), manager.timeList.get(n4 % (manager.timeList.size())));
			relationshipList.add(relationship);
			
			relationship = new Relationship(manager.eventList.get(n1 % (manager.eventList.size())),manager.countryList.get(n2 % (manager.countryList.size())), manager.quanHeList.get(n3 % (manager.quanHeList.size())), manager.timeList.get(n4 % (manager.timeList.size())));
			relationshipList.add(relationship);
			
			relationship = new Relationship(manager.eventList.get(n1 % (manager.eventList.size())),manager.locationList.get(n2 % (manager.locationList.size())), manager.quanHeList.get(n3 % (manager.quanHeList.size())), manager.timeList.get(n4 % (manager.timeList.size())));
			relationshipList.add(relationship);
			
			relationship = new Relationship(manager.personList.get(n1 % (manager.personList.size())),manager.countryList.get(n2 % (manager.countryList.size())), manager.quanHeList.get(n3 % (manager.quanHeList.size())), manager.timeList.get(n4 % (manager.timeList.size())));
			relationshipList.add(relationship);
			
			relationship = new Relationship(manager.personList.get(n1 % (manager.personList.size())),manager.locationList.get(n2 % (manager.locationList.size())), manager.quanHeList.get(n3 % (manager.quanHeList.size())), manager.timeList.get(n4 % (manager.timeList.size())));
			relationshipList.add(relationship);
			
			relationship = new Relationship(manager.organizationList.get(n1 % (manager.organizationList.size())),manager.countryList.get(n2 % (manager.countryList.size())), manager.quanHeList.get(n3 % (manager.quanHeList.size())), manager.timeList.get(n4 % (manager.timeList.size())));
			relationshipList.add(relationship);
			
			relationship = new Relationship(manager.organizationList.get(n1 % (manager.organizationList.size())),manager.locationList.get(n2 % (manager.locationList.size())), manager.quanHeList.get(n3 % (manager.quanHeList.size())), manager.timeList.get(n4 % (manager.timeList.size())));
			relationshipList.add(relationship);
			
			n= n -7;
		}
		
		
		
	}

}
