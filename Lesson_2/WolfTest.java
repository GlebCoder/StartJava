public class WolfTest {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.name = "Alone";
        wolf.color = "grey";
        wolf.age = 7;
        wolf.weight = 19.2;
        wolf.sex = 'M';
        
        System.out.println("Wolf's name: " + wolf.name 
                            + "\nColor: " + wolf.color
                            + "\nAge: " + wolf.age
                            + "\nWeight: " + wolf.weight
                            + "\nSex: " + wolf.sex);
        
        wolf.run();
        wolf.howl();
        wolf.walk();
        wolf.hunt();
        wolf.sit();
    }
}