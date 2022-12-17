package lifesimulator;
/* class Student child dari class Person
 * tambah method study()
 */
public class Student extends Person{

	public Student(String name, int stamina, int intelligence) {
		super(name,stamina,intelligence);
	}


	@Override
	public void eat() {
		System.out.println(super.getClass().getSimpleName() + " " + super.getName() + "is Eating");
		setStamina(getStamina() + 20);
		
	}
	
	public void study() {
		System.out.println(super.getClass().getSimpleName() + " " + super.getName() + "is Studying");
		setIntelligence(getIntelligence() + 10);
		setStamina(getStamina() - 10);
	}

	@Override
	public void sleep() {
		System.out.println(super.getClass().getSimpleName() + " " + super.getName() + "is Sleeping");
		setStamina(getStamina() + 100);
	}
	
}
