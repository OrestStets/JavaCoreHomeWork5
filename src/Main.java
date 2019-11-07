import java.util.Random;

public class Main {

    public static void main(String[] args) {

        petSay();

        System.out.println();

        frogMoves();

        System.out.println();

        int orel = 0;
        int reshka = 0;


        for (int i = 0; i < 1; i++){
            Random random = new Random();
            orel = random.nextInt(2);

            if(orel == 1) {
                System.out.println(orel + "Orel");
            } else {
                System.out.println(reshka + "Reshka");
            }
        }

    }

    public static void petSay(){
        Pet dog = new Dog();
        dog.voice();
        Pet cow = new Cow();
        cow.voice();
        Pet cat = new Cat();
        cat.voice();

    }

    public static void frogMoves(){
        Amphibia frog = new Frog();

        frog.eat();
        frog.sleep();
        frog.swim();
        frog.walk();
    }


}