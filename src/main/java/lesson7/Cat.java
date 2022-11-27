package lesson7;

import org.jetbrains.annotations.NotNull;

public class Cat {
    private String name;
    private int appetit;
    private boolean satiety;

    public Cat(String name, int appetit) {
        this.name = name;
        this.appetit = appetit;
        this.satiety = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAppetit() {
        return appetit;
    }

    public void setAppetit(int appetit) {
        this.appetit = appetit;
    }
    public void eat(@NotNull Plate p){
        p.decreaseFood(appetit);
        satiety = true;

    }
}
