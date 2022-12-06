import java.util.SortedMap;

public class Animal {

    String animalName;

    public Animal(String animalName) {
        this.animalName = animalName;

    }

    public void animalSound() {
    }

    public void animalSound(String intensity) {

        if (intensity.equals("High")) {
            System.out.println("Rooooaaar!");

        } else if (intensity.equals(("low"))){
            System.out.println("roar!");
        }else {
            System.out.println("?");
        }
    }
}
