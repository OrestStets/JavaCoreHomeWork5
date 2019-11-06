import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Pet dog = new Dog();
        Pet cow = new Cow();
        Pet cat = new Cat();

        dog.voice();
        cow.voice();
        cat.voice();

        System.out.println();

        int orel = 0;
        int reshka = 0;


        for (int i = 0; i < 1; i++){
            Random random = new Random();
            orel = random.nextInt(2);

            if(orel == 1) {
                System.out.println(orel + "Orel");
                break;
            } else {
                System.out.println(reshka + "Reshka");
                break;
            }
        }

        System.out.println();

        Amphibia frog = new Frog();

        frog.eat();
        frog.sleep();
        frog.swim();
        frog.walk();


    }
}