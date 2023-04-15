public class Parrot extends Bird implements  Prey{
    String feature;

    public Parrot(String name, String age, int height, String feature) {
        super(name, age, height);
        this.feature = feature;
    }

    @Override
    public void show() {
        System.out.println("Name: "+name+"\t"+"Age"+age+"\t"+"Height: "+height+ "\t"+"Feature: " + feature);
    }
}
