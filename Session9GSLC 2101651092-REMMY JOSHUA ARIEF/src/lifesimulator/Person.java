package lifesimulator;

/* abstract class Person (base)
 * ada unsur encapsulation
 * variable name, stamina, intelligence
 * abstract method eat(), sleep()
 */


public abstract class Person {

	private String name;
	private int stamina;
	private int intelligence;
	
	public Person(String name, int stamina, int intelligence) {
		super();
		this.name = name;
		this.stamina = stamina;
		this.intelligence = intelligence;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStamina() {
		return stamina;
	}

	public void setStamina(int stamina) {
		this.stamina = stamina;
	}

	public int getIntelligence() {
		return intelligence;
	}

	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}
	

	public abstract void eat();
	public abstract void sleep();
}
