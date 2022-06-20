// class Chap64Inheritance {
//     protected String brand = "Ford";
//     public void honk() {
//       System.out.println("Tuut, tuut!");
//     }
//   }
  
//   class Car extends Chap64Inheritance {
//     private String modelName = "Mustang";
//     public static void main(String[] args) {
//       Car myFastCar = new Car();
//       myFastCar.honk();
//       System.out.println(myFastCar.brand + " " + myFastCar.modelName);
//     }
//   }
  


class Chap64Inheritance {

    void sleep() {
        System.out.println("Sleeping ..");
    }
    void eat() {
        System.out.println("Eating ..");
    }
    void play() {
        System.out.println("Playing ..");
    }


}

class Car extends Chap64Inheritance {

    public static void main(String[] args) {
        Car obj = new Car();
        obj.eat();
    }
}