package ch06;

import java.util.ArrayList;

class Animal{
	
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}

class Human extends Animal {

	public void move() {
		System.out.println("사람이 두 발로 걷습니다.");
	}
	
	public void readBook() {
		System.out.println("사람이 책을 읽습니다.");
	}
	
}

class Tiger extends Animal {

	public void move() {
		System.out.println("사자가 네 발로 걷습니다.");
	}
	
	public void hunting() {
		System.out.println("사자가 사냥을 합니다.");
	}
}

class Eagle extends Animal {

	public void move() {
		System.out.println("독수리가 하늘을 날고 있습니다.");
	}
	
	public void flying() {
		System.out.println("독수리가 양날개를 펴고 날아다닙니다.");
	}
}

public class AnimalTest {

	public static void main(String[] args) {
		
		Animal hAnimal = new Human();
		Animal tAnimal = new Tiger();
		Animal eAnimal = new Eagle();
		
		AnimalTest test = new AnimalTest();
		test.moveAnimal(hAnimal);
		test.moveAnimal(tAnimal);
		test.moveAnimal(eAnimal);
		
		ArrayList<Animal> list = new ArrayList<Animal>();
		
		test.testDownCasting(list);
		
		list.add(eAnimal);
		list.add(tAnimal);
		list.add(hAnimal);
		
//		for(Animal animal : list) {
//			animal.move();
//		}
//		
//		for (int i =0; i < list.size(); i++) {
//			Animal animal = list.get(i);
//			animal.move();
//		}
		
		
		AnimalTest test1 = new AnimalTest();
		test1.testDownCasting(list);
	}
	
	public void testDownCasting(ArrayList<Animal> list) {
		
		for (int i =0; i < list.size(); i++) {
			Animal animal = list.get(i);
			
			if (animal instanceof Human) {
				Human human = (Human)animal;
				human.readBook();
			} else if (animal instanceof Tiger) {
				Tiger tiger = (Tiger)animal;
				tiger.hunting();
			}else if (animal instanceof Eagle) {
				Eagle eagle = (Eagle)animal;
				eagle.flying();
			} else {
				System.out.println("그 외 동물은 없습니다.");
			}
		}
		
		
	}
	
	public void moveAnimal(Animal animal) {
		animal.move();
	}
}
