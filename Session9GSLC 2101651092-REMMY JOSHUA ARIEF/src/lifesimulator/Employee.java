package lifesimulator;
/* class Employee child dari class Person
 * ambil method work() dari interface Work
 * tambah variable money (encapsulation)
 */
import temp.Working;

public class Employee extends Person implements Working{
	


	private int money;

	public Employee(String name, int stamina, int intelligence, int money) {
		super(name, stamina, intelligence);
		this.money = money;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	@Override
	public void working() {
		System.out.println(super.getClass().getSimpleName() + " " + super.getName() + "is Working");
		money += 50;
		setStamina(getStamina() - 30);
		setIntelligence(getIntelligence() + 15);
	}
	
	@Override
	public void eat() {
		System.out.println(super.getClass().getSimpleName() + " " + super.getName() + "is Eating");
		setStamina(getStamina() + 20);
		money -= 5;
	}

	@Override
	public void sleep() {
		System.out.println(super.getClass().getSimpleName() + " " + super.getName() + "is Sleeping");
		setStamina(getStamina() + 80);
	}


}
