package job;
/* class Proplayer child dari class Employee	
 * ambil method training() dari interface Training
 * tambah variable power (encapsulation)
 */
import java.util.concurrent.ThreadLocalRandom;

import lifesimulator.Employee;
import temp.GamingHouse;

public class ProPlayer extends Employee implements GamingHouse {

	

	private int strategy;
	private int powerTeam;


	public ProPlayer(String name, int stamina, int intelligence, int money, int strategy, int powerTeam) {
		super(name, stamina, intelligence, money);
		this.strategy = strategy;
		this.powerTeam = powerTeam;
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
	public void GamingHouse() {
		
		int num = ThreadLocalRandom.current().nextInt(0,8);
		
		String w = null;
		
		switch(num) {
		case 0:{
			w = "is practice communication language";
		}
		case 1:{
			w = "is set up device";
			break;
		}
		case 2:{
			w = "is going to workup";
			break;
		}
		case 3:{
			w = "is practice match with BeaconTime";
			break;
		}
		case 4:{
			w = "is practice match with MAD Team";
			break;
		}
		case 5:{
			w = "is practice match with Saigon Phantom";
			break;
		}
		case 6:{
			w = "is practice match with Burriram Esports";
			break;
		}
		case 7:{
			w = "is practice match with BikerTopia Team";
			break;
		}

		case 8:{
			w = "Evaluation game Training & Strategy";
			break;
		}
	}
		System.out.println(super.getClass().getSimpleName() + " " + super.getName() + " " + w);
		setStamina(getStamina() - 25);
		setStrategy(getStrategy() + 10);
		setPowerTeam(getPowerTeam() + 15);
		
	}


	@Override
	public void working() {
		// TODO Auto-generated method stub
		
		int num = ThreadLocalRandom.current().nextInt(0,8);
		String w = null;
		
		switch(num) {
		case 0:{
			w = "is Competing in AOV";
			break;	
		}
		case 1:{
			w = "is Competing in GCS";
			break;
		}
		case 2:{
			w = "is Competing in ROV";
			break;
		}
		case 3:{
			w = "is Competing in LienQuan";
			break;
		}
		case 4:{
			w = "is Competing in MSP";
			break;
		}
		case 5:{
			w = "is Competing in NA";
			break;
		}
		case 6:{
			w = "is Competing in Arena of Valor International Championship";
			break;
		}
		case 7:{
			w = "is Competing in Arena of Valor World Cup";
			break;
		}
		case 8:{
			w = "is Competing at Asian Games";
			break;
		}
		
	}	
		
		System.out.println(super.getClass().getSimpleName() + " " + super.getName() + " " + w);
		setMoney(getMoney() + 200);
		setStamina(getStamina() - 75);
		setStrategy(getStrategy() + 20);
		setPowerTeam(getPowerTeam() + 30);
		setIntelligence(getIntelligence() + 25);

}

	@Override
	public void eat() {
		System.out.println(super.getClass().getSimpleName() + " " + super.getName() + "is Eating");
		setStamina(getStamina() + 20);
		setMoney(getMoney() - 5);
	}	
	
	@Override
	public void sleep() {
		System.out.println(super.getClass().getSimpleName() + " " + super.getName() + "is Sleeping");
		setStamina(getStamina() + 50);
	}
	
	
	
	
}
