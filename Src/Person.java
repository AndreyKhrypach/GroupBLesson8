public class Person {
    public String name;
    public String colorEyes;
    public boolean sex;
    public String scars;

    public Person(String name, String colorEyes, boolean sex, String scars) {
        this.name = name;
        this.colorEyes = colorEyes;
        this.sex = sex;
        this.scars = scars;
    }


    public Person() {
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", colorEyes='" + colorEyes + '\'' +
                ", sex=" + (sex ? "male" : "female") +
                ", scars='" + scars + '\'' +
                '}';
    }
}
