public class JaegerTest {
    public static void main(String[] args) {
        Jaeger jaeger1 = new Jaeger();
        jaeger1.setModelName("Bracer Phoenix");
        System.out.println("The Jaeger model name: " + jaeger1.getModelName());
        jaeger1.setArmor(8);
        jaeger1.useVortexCannon();
        System.out.println("********************************************");
        
        Jaeger jaeger2 = new Jaeger("Gipsy Danger");
        System.out.println("The Jaeger model name: " + jaeger2.getModelName());
        jaeger2.setArmor(6);
        jaeger2.useVortexCannon();
        jaeger2.move();
    }
}