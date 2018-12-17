package createdata;

import create.Person;

public class Main {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Manager manager = new Manager("D:\\Person.txt", "D:\\Country.txt", "D:\\QuanHe.txt", "D:\\Organization.txt", "D:\\Event.txt","D:\\Location.txt","D:\\Time.txt");
//		for (Person person : manager.personList) {		
//			System.out.println(person.getM_DinhDanh());
//			System.out.println(person.getM_NhanHienThi());
//			System.out.println(person.getChucVu());
//			System.out.println(person.getM_MoTa());
//			
//		}
//		
//		for (Country country : manager.countryList) {
//			System.out.println(country.getM_DinhDanh());
//		}
//		for (Organization organization: manager.organizationList) {
//			System.out.println(organization.getM_DinhDanh());
//		}
//		for (String quanhe: manager.quanHeList) {
//			System.out.println(quanhe);
//		}
		CreateData createdata = new CreateData(1000);
		@SuppressWarnings("unused")
		Person person = new Person();
		person = createdata.relationshipList.get(4).getPerson();
		System.out.println(person.getChucVu());
	}

}
