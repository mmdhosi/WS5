public class Eagle extends Bird implements  Hunter{
    String feature;

    public Eagle(String name, String age, int height, String feature) {
        super(name, age, height);
        this.feature = feature;
    }
    public void show() {
        System.out.println("Name: "+name+"\t"+"Age"+age+"\t"+"Height: "+height+ "\t"+"Feature: " + feature);
    }
}
