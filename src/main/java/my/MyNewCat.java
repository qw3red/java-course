package my;

import my.animal.Animal;
import my.cat.NewCat;

public class MyNewCat {
    public static void main(String[] args) {
        NewCat newCat = new NewCat(6, 8, true, "Milk", "Vaska", "Home cat");
        System.out.println(newCat.toString());
        System.out.println(newCat.getAge());
        System.out.println(newCat.hashCode());
        newCat.getVoice();

        Animal animal = newCat;
        animal.getVoice();
    }
}
