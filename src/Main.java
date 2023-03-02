public class Main {

    public static void main(String[] args) {
	Animal[] animal = new Animal[10];
    animal[0] = new HomeCat("barsik", "10");
    animal[1] = new Dog("barbos", "1");
    animal[2] = new Tiger("leo", "2");
    animal[3] = new HomeCat("barsik", "10");


    System.out.println("Count cat = " + HomeCat.count);
    System.out.println("Count dog = " + Dog.count);
    System.out.println("Count tiger = " + Tiger.count);
    System.out.println("Count all animals = " + Animal.countAnimal);
    }
}
