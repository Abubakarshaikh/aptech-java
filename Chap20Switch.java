enum Level {
    LOW,
    MEDIUM,
    HIGH
  }
public class Chap20Switch {
    
    public static void main(String[] args) {
     
        switch (Level.HIGH) {
            case HIGH:
                System.out.println("HIGH");
                break;
            case MEDIUM:
                System.out.println("MEDIUM");
                break;
            case LOW:
                System.out.println("LOW");
                break;
            default:
            System.out.println("FAILURE");
               
        }
    }
}
