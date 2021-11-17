public class Wolf {
    private char sex;
    private String name;
    private double weight;
    private int age;
    private String color;

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 8) {
            System.out.println("Incorrect age");
        } else {
            this.age = age;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void walk() {
        System.out.println("Walking...");
    }

    public void sit() {
        System.out.println("Sitting...");
    }

    public void run() {
        System.out.println("Running...");
    }

    public void hunt() {
        System.out.println("Hunting...");
    }

    public void howl() {
        System.out.println("Howling...");
    }
}