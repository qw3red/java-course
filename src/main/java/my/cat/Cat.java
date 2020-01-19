package my.cat;

public class Cat {
    private String name;
    private String color;
    private long weight;
    private boolean isSleeping;

    public Cat() {
    }

    public Cat(String name, String color, long weight, boolean isSleeping) {
        this.name = name;
        this.color = color;
        this.weight = weight;
        this.isSleeping = isSleeping;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public long getWeight() {
        return weight;
    }

    public void setWeight(long weight) {
        this.weight = weight;
    }

    public boolean isSleeping() {
        return isSleeping;
    }

    public void setSleeping(boolean sleeping) {
        isSleeping = sleeping;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", weight=" + weight +
                ", isSleeping=" + isSleeping +
                '}';
    }
}
