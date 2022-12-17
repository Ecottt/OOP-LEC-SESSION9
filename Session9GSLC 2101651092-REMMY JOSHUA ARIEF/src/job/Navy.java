package job;
//class Navy child dari class IndonesiaNationalArmy
import java.util.concurrent.ThreadLocalRandom;

public class Navy extends IndonesiaNationalArmy {

	


	public Navy(String name, int stamina, int intelligence, int skill, int strategy, int powerTeam) {
		super(name, stamina, intelligence, skill, strategy, powerTeam, powerTeam);
		// TODO Auto-generated constructor stub
	}


	@Override
	public void training() {
		
		int num = ThreadLocalRandom.current().nextInt(0,9);
		String w = null;
		
		switch(num) {
		case 0:{
			w = "is jogging";
			break;
		}
		case 1:{
			w = "is work up";
			break;
		}
		case 2:{
			w = "is having a discussion";
			break;
		}
		case 3:{
			w = "is training self defense arts";
			break;
		}
		case 4:{
			w = "is training shooting and swim";
			break;
		}
		case 5:{
			w = "is training strategy offense and defense at war";
			break;
		}
		case 6:{
			w = "is having a break time";
			break;
		}
		case 7:{
			w = "is having evaluation";
			break;
		}
	}
		System.out.println(super.getClass().getSimpleName() + " " + super.getName() + " " + w);
		setStamina(getStamina() - 30);
		setStrategy(getStrategy() + 15);
		setPowerTeam(getPowerTeam() + 10);
}
	

	@Override
	public void working() {
		
		int num = ThreadLocalRandom.current().nextInt(0,9);
		String w = null;
		
		switch(num) {
		case 0:{
			w = "is war at Russian";
			break;
		}
		case 1:{
			w = "is war at Amerika";
			break;
		}
		case 2:{
			w = "is having a discussion strategy";
			break;
		}
		case 3:{
			w = "is war at Netherlands";
			break;
		}
		case 4:{
			w = "is war at Portugal";
			break;
		}
		case 5:{
			w = "is war at Spain";
			break;
		}
		case 6:{
			w = "is war at Argentina";
			break;
		}
		case 7:{
			w = "is war at Jepang";
			break;
		}
	
	}
		System.out.println(super.getClass().getSimpleName() + " " + super.getName() + " " + w);
		setMoney(getMoney() + 1000);
		setStamina(getStamina() - 100);
		setStrategy(getStrategy() + 30);
		setPowerTeam(getPowerTeam() + 50);
		setIntelligence(getIntelligence() + 35);
		
}

	@Override
	public void eat() {
		System.out.println(super.getClass().getSimpleName() + " " + super.getName() + "is Eating");
		setStamina(getStamina() + 25);
		setMoney(getMoney() - 0);
	}
	
	@Override
	public void sleep() {
		System.out.println(super.getClass().getSimpleName() + " " + super.getName() + "is Sleeping");
		setStamina(getStamina() + 50);
	}
	
	

}
