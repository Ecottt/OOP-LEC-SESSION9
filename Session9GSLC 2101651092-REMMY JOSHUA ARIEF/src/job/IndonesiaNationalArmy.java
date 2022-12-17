package job;
/* abstract class IndonesiaNationalArmy (base buat class Army,AirForce,Navy) child dari class Employee
 * ambil method training() dari interface Training
 * tambah variable skill (encapsulation)
 */
import lifesimulator.Employee;
import temp.Training;

public abstract class IndonesiaNationalArmy extends Employee implements Training {

	private int skill;
	private int strategy;
	private int powerTeam;
	

	
	public IndonesiaNationalArmy(String name, int stamina, int intelligence, int money, int skill, int strategy,
			int powerTeam) {
		super(name, stamina, intelligence, money);
		this.skill = skill;
		this.strategy = strategy;
		this.powerTeam = powerTeam;
	}

	public int getSkill() {
		return skill;
	}

	public void setSkill(int skill) {
		this.skill = skill;
	}

	public int getStrategy() {
		return strategy;
	}

	public void setStrategy(int strategy) {
		this.strategy = strategy;
	}

	public int getPowerTeam() {
		return powerTeam;
	}

	public void setPowerTeam(int powerTeam) {
		this.powerTeam = powerTeam;
	}

	@Override
	public void training() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void working() {
		// TODO Auto-generated method stub
		super.working();
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		super.sleep();
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		super.eat();
	}
	
	
	

}
