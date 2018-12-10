package createdata;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import create.Country;
import create.Event;
import create.Location;
import create.NguonGoc;
import create.Organization;
import create.Person;
import create.QuanHe;

public class Manager {
	ArrayList<Person> personList;
	ArrayList<Country> countryList;
	ArrayList<Organization> organizationList;
	ArrayList<Event> eventList;
	ArrayList<Location> locationList;
	ArrayList<NguonGoc> nguonGocList;
	ArrayList<QuanHe> quanHeList;
	
	
	public Manager() {
		
	}
	
	@SuppressWarnings("resource")
	public Manager(String personFile, String countryFile, String quanHeFile, String organizationFile, String eventFile, String locationFile) {
		personList = new ArrayList<>();
		countryList = new ArrayList<>();
		organizationList = new ArrayList<>();
		eventList = new ArrayList<>();
		locationList = new ArrayList<>();
		quanHeList = new ArrayList<>();
		try {
			// nap danh sach Person vao personList
			BufferedReader br = new BufferedReader(new FileReader(personFile));
			String line = null;
			while ((line = br.readLine()) != null) {
				Person person = new Person();
				person.setM_DinhDanh(line); // add dinh danh
				line = br.readLine();
				person.setM_NhanHienThi(line); // add nhan hien thi
				line = br.readLine();
				person.setChucVu(line); // add Chuc vu
				line = br.readLine();
				person.setM_MoTa(line); // add mo ta
				personList.add(person);		
			}
			// nap danh sach country vao countryList
			br = new BufferedReader(new FileReader(countryFile));
			line = null;
			while ((line = br.readLine()) != null) {
				Country country = new Country();
				country.setM_DinhDanh(line); // add dinh danh
				line = br.readLine();
				country.setM_NhanHienThi(line); // add nhan hien thi
				line = br.readLine();
				country.setThuDo(line); // add thu do
				line = br.readLine();
				country.setM_MoTa(line); // Add Mo ta
				
				line = br.readLine();
				
				countryList.add(country);		
			}
			
			// nap danh sach quan he vao quanHeList
			br = new BufferedReader(new FileReader(quanHeFile));
			line = null;
			while ((line = br.readLine()) != null) {
				QuanHe quanhe = new QuanHe();
				quanhe.setQuanhe(line);
				quanHeList.add(quanhe);		
			}
			// nap danh sach OrganizationList
			br = new BufferedReader(new FileReader(organizationFile));
			line = null;
			while((line= br.readLine())!= null) {
				Organization organization= new Organization();
				organization.setM_DinhDanh(line); //add dinh danh
				line = br.readLine();
				organization.setM_NhanHienThi(line); // add nhan hien thi
				line = br.readLine();
				organization.setTruSo(line); // add tru so 
				line = br.readLine();
				organization.setM_MoTa(line); // add Mo ta
				
				line = br.readLine(); // dong thua de them nguon goc trich rut
				
				organizationList.add(organization); // them vao list
				
			}
			// Nap danh sach Event vao eventList
			br = new BufferedReader(new FileReader(eventFile));
			line = null;
			while((line= br.readLine())!= null) {
				Event event= new Event();
				event.setM_DinhDanh(line); //add dinh danh
				line = br.readLine();
				event.setM_NhanHienThi(line); // add nhan hien thi
				line = br.readLine();
				event.setM_MoTa(line); // add Mo ta
				
				line = br.readLine(); // dong thua de them nguon goc trich rut
				
				eventList.add(event); // them vao list
				
			}
			
			// Nap danh sach Location vao locationList
			br = new BufferedReader(new FileReader(locationFile));
			line = null;
			while((line= br.readLine())!= null) {
				Location location= new Location();
				location.setM_DinhDanh(line); //add dinh danh
				line = br.readLine();
				location.setM_NhanHienThi(line); // add nhan hien thi
				line = br.readLine();
				location.setM_MoTa(line); // add Mo ta
				
				line = br.readLine(); // dong thua de them nguon goc trich rut
				
				locationList.add(location); // them vao list
				
			}
			
			// nap danh sach NguonGoc vao nguonGocList
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
//	public static Manager instance = new Manager();
	
	
}
