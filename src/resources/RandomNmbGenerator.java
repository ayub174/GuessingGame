package resources;

import java.util.Random;

public class RandomNmbGenerator {

    Random r = new Random();

    public RandomNmbGenerator(Random r)
    {
        this.r = r;
    }

    public Random getR() {
        return r;
    }

    public void setR(Random r) {
        this.r = r;
    }
}