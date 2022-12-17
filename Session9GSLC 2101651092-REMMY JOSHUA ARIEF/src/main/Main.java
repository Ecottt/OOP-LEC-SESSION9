package main;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

import job.AirForce;
import job.Army;
import job.IndonesiaNationalArmy;
import job.Navy;
import job.ProPlayer;
import lifesimulator.Employee;
import lifesimulator.Person;
import lifesimulator.Student;


public class Main {

	Scanner sc = new Scanner(System.in);
	
	// method life simulator
	
	public void menu() {
		
		System.out.println("LIFE SIMULATOR");
		System.out.println("@@@@@@@@@@@@@@@");
		
		// minta masukkan nama
		
		System.out.println("Please Enter Your Name : ");
		String name = sc.nextLine();
		
		//buat object new person dari class Person dengan upcasting ke class Student
		Person newPerson = new Student(name, 50, 35);
		
		// menu do-while sampai ilmu >= 100 buat naik level
		
		int menu;
		
		do {
			
			Status(newPerson);
			// list menu berdasarkan method dari class Student
			
			
			System.out.println("1. Eat");
			System.out.println("2. Sleep");
			System.out.println("3. Study");
			
			// minta inputan menu dari user (validasi menu dari 1 - 3)
			
			System.out.println("Choose Menu : ");
			menu = sc.nextInt();
			sc.nextLine();
			
			switch(menu) {
			case 1:{
				newPerson.eat();
				sc.nextLine();
				break;
			}
			case 2:{
				newPerson.sleep();
				sc.nextLine();
				break;
			}
			case 3:{
				// validasi jika stamina <= 20, maka method study() tidak akan dijalankan
				if(newPerson.getStamina() <= 20) {
					System.out.println(newPerson.getClass().getSimpleName() + " " + newPerson.getName() + " is Tired...");
					sc.nextLine();
					}else {
						((Student) newPerson).study();
						sc.nextLine();
					}
				break;
			}
		}
			
		} while ((menu >= 1 || menu <= 3 ) && newPerson.getIntelligence() < 100);
		
		// ambil 1 random number buat nentuin job setelah naik level
		
		int num = ThreadLocalRandom.current().nextInt();
		
		switch(num) {
			
		case 1:{
			// pindahin object newPerson yang class Student ke object newPerson1 class Employee
			Employee newPerson1 = new Employee(newPerson.getName(), newPerson.getStamina(), newPerson.getIntelligence(), 100 );
			
			// menu do-while sampai num2 bukan 1
			
			int menu2;
			
			int num2 = 1;
			
			do {
				Status(newPerson1);
				
				// list menu berdasarkan method dari class Employee
				
				System.out.println("1. Eat");
				System.out.println("2. Sleep");
				System.out.println("3. Work");
				
				// minta inputan menu2 dari user (validasi menu dari 1 - 3)
				
				System.out.println("Choose Menu : ");
				menu2 = sc.nextInt();
				sc.nextLine();
				
				switch(menu2) {
				
				case 1:{
					// validasi jika money <= 20, maka method eat() tidak akan dijalankan
					if(newPerson1.getMoney() <= 20) {
						System.out.println(newPerson1.getClass().getSimpleName() + " " + newPerson1.getName() + " Doesn't have money left.....");
						sc.nextLine();
					}else {
						newPerson1.eat();
						sc.nextLine();
					}
					
					break;
				}
				case 2:{
					// buat dapat random number untuk num2
					newPerson1.sleep();
					
					num2 = ThreadLocalRandom.current().nextInt(1,3);
					sc.nextLine();
					
					break;
				}
				case 3:{
					// validasi jika stamina <= 20, maka method work() tidak akan dijalankan
					if(newPerson1.getStamina() <= 20) {
						System.out.println(newPerson1.getClass().getSimpleName() + " " + newPerson1.getName() + " is Tired..");
						sc.nextLine();
					}else {
						newPerson1.working();
						sc.nextLine();
					}
					
					break;
				}
				
				}
				
			}  while ((menu2 >= 1 || menu <= 3 ) && num2 == 1);
			
				System.out.println("Sept " + newPerson1.getName() + " sweet dreams.." );
			
			break;
		}
		case 2:{
			// pindahin object newPerson yang class Student ke object newPerson1 class ProPlayer
			ProPlayer newPlayer = new ProPlayer(newPerson.getName(), newPerson.getStamina(), newPerson.getIntelligence(), 100, 50, 50);
			
			// menu do-while sampai num2 bukan 1
			int menu21;
			
			int num21 = 1;
			
			do {
				Status(newPerson1);
				// list menu berdasarkan method dari class ProPlayer
				System.out.println("1. Eat");
				System.out.println("2. Sleep");
				System.out.println("3. Work");
				System.out.println("4. Train");
				// minta inputan menu2 dari user (validasi menu dari 1 - 4)
				System.out.println("Choose Menu : ");
				menu21 = sc.nextInt();
				sc.nextLine();
				
				switch(menu21) {
				
				case 1:{
					
					// validasi jika money <= 20, maka method eat() tidak akan dijalankan
					if(newPerson1.getMoney() <= 20) {
						System.out.println(newPerson1.getClass().getSimpleName() + " " + newPerson1.getName() + " Doesn't have money left.....");
						sc.nextLine();
					}else {
						newPerson1.eat();
						sc.nextLine();
					
					break;
					}
				case 2:{
					// buat dapat random number untuk num2
					newPerson1.sleep();
					
					num2 = ThreadLocalRandom.current().nextInt(1,3);
					sc.nextLine();
					
					break;
				}
				case 3:{
					
					if(newPerson1.getStamina() <= 20) {
						System.out.println(newPerson1.getClass().getSimpleName() + " " + newPerson1.getName() + " is Tired..");
						sc.nextLine();
					}else {
						newPerson1.working();
						sc.nextLine();
					}
					
					break;
				}
					
				 case 4:{

						if(newPerson1.getStamina() <= 20) {
							System.out.println(newPerson1.getClass().getSimpleName() + " " + newPerson1.getName() + " is Tired..");
							sc.nextLine();
						}else {
							newPerson1.working();
							sc.nextLine();
					 
					 
					 break;
					 
					}
					 
				}						
		} while ((menu2 >= 1 || menu <= 4 ) && num2 == 1);
		
		System.out.println("Sept " + newPerson1.getName() + " sweet dreams.." );
	
		break;
	}
		
		case 3:{
			
			Army newArmy = new Army(newPerson.getName(), newPerson.getStamina(), newPerson.getIntelligence(), 100,50,100); 
			
			int menu2;
			
			int num2 = 1;
			
			do {
				
				Status(newPerson1);

				System.out.println("1. Eat");
				System.out.println("2. Sleep");
				System.out.println("3. Work");
				System.out.println("4. Train");
				
				System.out.println("Choose Menu : ");
				menu21 = sc.nextInt();
				sc.nextLine();
				
				switch(menu21) {
				case 1:{
					if(newPerson1.getMoney() <= 20) {
						System.out.println(newPerson1.getClass().getSimpleName() + " " + newPerson1.getName() + " Doesn't have money left.....");
						sc.nextLine();
					}else {
						newPerson1.eat();
						sc.nextLine();
					
					break;
					}
				case 2:{
					
					newPerson1.sleep();
					
					num2 = ThreadLocalRandom.current().nextInt(1,3);
					sc.nextLine();
					
					break;
				}
				case 3:{
					
					if(newPerson1.getStamina() <= 20) {
						System.out.println(newPerson1.getClass().getSimpleName() + " " + newPerson1.getName() + " is Tired..");
						sc.nextLine();
					}else {
						newPerson1.working();
						sc.nextLine();
					}
					
					break;
				}
					
				 case 4:{

						if(newPerson1.getStamina() <= 20) {
							System.out.println(newPerson1.getClass().getSimpleName() + " " + newPerson1.getName() + " is Tired..");
							sc.nextLine();
						}else {
							newPerson1.working();
							sc.nextLine();
					 
					 
					 break;
					 
					}
					 
				}						
		} while ((menu2 >= 1 || menu <= 4 ) && num2 == 1);
		
		System.out.println("Sept " + newPerson1.getName() + " sweet dreams.." );
	
		break;
	}
				case 4:
					
					AirForce newAirForce = new AirForce(newPerson.getName(), newPerson.getStamina(), newPerson.getIntelligence(), 100,50,100); 
					
					int menu2;
					
					int num2 = 1;
					
					do {
						
						Status(newPerson1);

						System.out.println("1. Eat");
						System.out.println("2. Sleep");
						System.out.println("3. Work");
						System.out.println("4. Train");
						
						System.out.println("Choose Menu : ");
						menu21 = sc.nextInt();
						sc.nextLine();
						
						switch(menu21) {
						case 1:{
							if(newPerson1.getMoney() <= 20) {
								System.out.println(newPerson1.getClass().getSimpleName() + " " + newPerson1.getName() + " Doesn't have money left.....");
								sc.nextLine();
							}else {
								newPerson1.eat();
								sc.nextLine();
							
							break;
							}
						case 2:{
							
							newPerson1.sleep();
							
							num2 = ThreadLocalRandom.current().nextInt(1,3);
							sc.nextLine();
							
							break;
						}
						case 3:{
							
							if(newPerson1.getStamina() <= 20) {
								System.out.println(newPerson1.getClass().getSimpleName() + " " + newPerson1.getName() + " is Tired..");
								sc.nextLine();
							}else {
								newPerson1.working();
								sc.nextLine();
							}
							
							break;
						}
							
						 case 4:{

								if(newPerson1.getStamina() <= 20) {
									System.out.println(newPerson1.getClass().getSimpleName() + " " + newPerson1.getName() + " is Tired..");
									sc.nextLine();
								}else {
									newPerson1.working();
									sc.nextLine();
							 
							 
							 break;
							 
							}
							 
						}						
				} while ((menu2 >= 1 || menu <= 4 ) && num2 == 1);
				
				System.out.println("Sept " + newPerson1.getName() + " sweet dreams.." );
			
				break;
			}
		}
					System.out.println("Press enter to continue...");
					sc.nextLine();
						
			}
		
	public void Status(Person p) {
		
		System.out.println("Class : " + p.getClass().getSimpleName());
		System.out.println("Name : " + p.getName());
		System.out.println("Stamina : " + p.getStamina());
		System.out.println("Intelligence : " + p.getIntelligence());
		
		if(p instanceof Employee ) {
			System.out.println("Money : " + ((Employee) p).getMoney());
		}
		if(p instanceof ProPlayer ) {
			System.out.println("Strategy : " + ((ProPlayer) p).getPowerTeam());
		}
		if(p instanceof IndonesiaNationalArmy ) {
			System.out.println("Money : " + ((IndonesiaNationalArmy) p).getSkill());
		}
	}

	public Main() {
		
		Student s = new Student("Ecot",50,50);
		s.eat();
		s.sleep();
		s.study();
		Status(s);
		System.out.println("");
		
		Employee e = new Employee("Rama", 100, 50, 100);
		e.eat();
		e.sleep();
		e.working();
		Status(e);
		System.out.println("");
		
		ProPlayer p = new ProPlayer("Steven", 200, 50, 30, 100, 100);
		p.eat();
		p.sleep();
		p.working();
		p.GamingHouse();
		Status(p);
		System.out.println("");
		
		Army a = new Army("Teddy", 100, 70, 75, 80, 100);
		a.eat();
		a.sleep();
		a.working();
		a.training();
		Status(a);
		System.out.println("");
		
		AirForce af = new AirForce("Joshua", 80, 120, 90, 85, 100);
		af.eat();
		af.sleep();
		af.working();
		af.training();
		Status(af);
		System.out.println("");
		
		Navy n = new Navy("Arief", 100, 70, 75, 80, 100);
		n.eat();
		n.sleep();
		n.working();
		n.training();
		Status(n);
		System.out.println("");
		
		menu();
		
	}

	public static void main(String[] args) {
		
		new Main();

	}

}
