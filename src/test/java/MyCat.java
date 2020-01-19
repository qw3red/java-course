import my.cat.Cat;

public class MyCat {
    public static void main(String[] args) {
        Cat cat = new Cat();

        cat.setColor("Brown");
        cat.setName("Barsik");
        cat.setSleeping(true);
        cat.setWeight(123);
        System.out.println(cat);

        Cat cat1 = new Cat();
        cat1.setName("Tuzik");
        cat1.setWeight(12);
        cat1.setSleeping(false);
        cat1.setColor("black");
        System.out.println(cat1);
    }
}
