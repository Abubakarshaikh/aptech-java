// public class Chap41OwnMethods {
//     public static void main(String[] args) {
//         Car obj = new Car();
//         obj.carSound();
//     }
// }


// class Car {
//     void carSound(){
//         System.out.println("Marcedes sound -- Ho ho");
//     }
// }




package Chap41OwnMethods;

/**
 * Chap41OwnMethods
 */
public class Chap41OwnMethods {

    public static void main(String[] args) {
        
    }
}


class Electricity {
    int id;
    String name;
    int units;

    
    static int perUnitTillThreeHundred = 12;
    static int perUnitAfterThreeHundred = 16;

    
   public Electricity(int id, String name, int units) {
        this.id = id;
        this.name = name;
        this.units = units;
    }

   int  bill() {
       return perUnitTillThreeHundred * units;
   }

   
}