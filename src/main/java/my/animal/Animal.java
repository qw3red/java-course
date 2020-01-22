package my.animal;

public class Animal {
    private int age;
    private double weight;
    private boolean sex;
    private String ration;

    public Animal(int age, double weight, boolean sex, String ration) {
        super();
        this.age = age;
        this.weight = weight;
        this.sex = sex;
        this.ration = ration;
    }

    public Animal() {
        super();
    }

    public void getVoice() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public String getRation() {
        return ration;
    }

    public void setRation(String ration) {
        this.ration = ration;
    }

    public String toString() {
        return " age=" + age + ", weigt=" + weight + ", sex=" + sex + ", ration=" + ration + "]";
    }
}
