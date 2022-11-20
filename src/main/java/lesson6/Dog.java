package lesson6;

public class Dog extends Animal{
    private final int RUN_DISTANCE = 500;
    private final int SWIM_DISTANCE = 10;
    private int runDistance;
    private int swimDistance;

    public Dog(String name) {
        this.name = name;
        this.runDistance = runDistance;
        this.swimDistance = swimDistance;
    }
    public int getRunDistance(){
        return runDistance;
    }
    public void setRunDistance(int runDistance){
        this.runDistance = runDistance;
    }

    public int getSwimDistance() {
        return swimDistance;
    }

    @Override
    public void voice() {
        System.out.println("Пёс гавкнул");
    }
    @Override
    public boolean run(int distance) {
        return  (distance < RUN_DISTANCE && distance > 0);
    }
    @Override
    public boolean swim(int distance) {
        return  (distance < SWIM_DISTANCE && distance > 0);
    }
}
