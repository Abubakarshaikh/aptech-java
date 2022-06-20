class Chap65Polymorphism {
  public void animalSound() {
    System.out.println("The animal makes a sound");
  }
}

class Pig extends Chap65Polymorphism {
  public void animalSound() {
    System.out.println("The pig says: wee wee");
  }
}

class Dog extends Chap65Polymorphism {
  public void animalSound() {
    System.out.println("The dog says: bow wow");
  }
}

class Main {
  public static void main(String[] args) {
    Chap65Polymorphism myAnimal = new Chap65Polymorphism();
    Chap65Polymorphism myPig = new Pig();
    Chap65Polymorphism myDog = new Dog();
        
    myAnimal.animalSound();
    myPig.animalSound();
    myDog.animalSound();
  }
}