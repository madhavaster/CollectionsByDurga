package different.ways.to.iterate.through.a.map.in.java;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.BiConsumer;

public class Test {

	public static void main(String[] args) {
		Employee e1= new Employee(1,"madhav",50000.00);
		Employee e2= new Employee(2,"swapna",10000.00);
		Employee e3= new Employee(3,"hemanth",30000.00);
		Employee e4= new Employee(4,"manas",20000.00);
		Employee e5= new Employee(5,"maddy",60000.00);

		Department d1 = new Department(1, "IT");
		Department d2 = new Department(2,"Finance");
		
		HashMap<Employee,Department> hm = new HashMap();
		hm.put(e1, d1);
		hm.put(e2, d1);
		hm.put(e3, d1);
		hm.put(e4, d2);
		hm.put(e5, d2);

		Set<Entry<Employee, Department>> entrySet = hm.entrySet();
		Iterator<Entry<Employee, Department>> iterator = entrySet.iterator();
		while(iterator.hasNext()) {
			Entry<Employee, Department> next = iterator.next();
			System.out.println(next.getKey()+"......"+next.getValue());
		}
		System.out.println("-----------------------------------------------------------");
		Set<Entry<Employee, Department>> entrySet2 = hm.entrySet();
		for(Entry<Employee, Department> entry : entrySet2) {
			System.out.println(entry.getKey()+"......."+entry.getValue());
		}
		System.out.println("-----------------------------------------------------------");
		Set<Employee> keySet = hm.keySet();
		for(Employee e: keySet) {
			System.out.println(e+"......."+hm.get(e));
		}
		System.out.println("-----------------------------------------------------------");
		Collection<Department> values = hm.values();
		System.out.println(values);
		System.out.println("-----------------------------------------------------------");
		hm.forEach(new BiConsumer<Employee, Department>() {
			@Override
			public void accept(Employee key, Department value) {
				System.out.println(key+".........................."+value);
			}
		});
		System.out.println("-----------------------------------------------------------");
		hm.forEach((key1,value1)-> System.out.println(key1+">>>"+value1));
		System.out.println("-----------------------------------------------------------");
	}
}
class Employee{
	private int eid;
	private String ename;
	public Employee(int eid, String ename, Double salary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
	}
	private Double salary;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", salary=" + salary + "]";
	}
}
class Department{
	private int did;
	private String dname;
	public Department(int did, String dname) {
		super();
		this.did = did;
		this.dname = dname;
	}
	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	@Override
	public String toString() {
		return "Department [did=" + did + ", dname=" + dname + "]";
	}
}
