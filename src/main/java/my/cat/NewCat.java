package my.cat;

import my.animal.Animal;

public class NewCat extends Animal {
    private String name;
    private String type;

    public NewCat(int age, double weight, boolean sex, String ration, String name, String type) {
        super(age, weight, sex, ration);
        this.name = name;
        this.type = type;
    }

    public NewCat(String name, String type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public String toString() {
        return "NewCat{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                "} " + super.toString();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void getVoice() {
        System.out.println("MEOW");
    }
}
