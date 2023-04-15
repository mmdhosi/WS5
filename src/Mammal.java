public abstract class Mammal extends Animal{
    int speed;

    public Mammal(String name, String age, int speed) {
        super(name, age);
        this.speed = speed;
    }
}
