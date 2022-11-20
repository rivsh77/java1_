package lesson6;

public class Cat extends Animal{
    private final int RUN_DISTANCE = 200;
    private final int SWIM_DISTANCE = 0;
    private int runDistance;
    private int swimDistance;

    public Cat(String name) {
        this.name = name;
        this.runDistance = runDistance;
        this.swimDistance = SWIM_DISTANCE;
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
        System.out.println("Кот мяукнул");
    }
    @Override
    public boolean run(int distance) {
         return  (distance < RUN_DISTANCE && distance > 0);
    }
    @Override
    public boolean swim(int distance) {
        return  false;
    }



}
