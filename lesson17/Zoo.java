package lesson17;

public class Zoo {

	public void feedAnimals(Animal[] animals) {
		
		for (Animal animal: animals) {
			animal.eat(); //will be abstract
			animal.age(); //will be explicit
		}
	}
}
