public class Girafe extends Mammal implements Prey{
    String feature;

    public Girafe(String name, String age, int speed, String feature) {
        super(name, age, speed);
        this.feature = feature;
    }
    public void show() {
        System.out.println("Name: "+name+"\t"+"Age"+age+"\t"+"Speed: "+speed+ "\t"+"Feature: " + feature);
    }
}
