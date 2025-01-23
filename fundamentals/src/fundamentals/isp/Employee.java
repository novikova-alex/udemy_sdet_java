package fundamentals.isp;

//Classes implementing the segregated interfaces
public class Employee implements Workable, Eatable, Sleepable {

	@Override
	public void sleep() {
		System.out.println("Employee is sleeping");
		
	}

	@Override
	public void eat() {
		System.out.println("Employee is eating");
		
	}

	@Override
	public void work() {
		System.out.println("Employee is working");
		
	}
 
}
