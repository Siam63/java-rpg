package com.company;
import java.util.*;

public class RandGenerator {
    int upperBound, lowerBound;

    public RandGenerator(int upperBound, int lowerBound){
        this.upperBound = upperBound;
        this.lowerBound = lowerBound;
    }

    public int generateRandomNum(){
        int upper = this.upperBound;
        int lower = this.lowerBound;

        return new Random().nextInt(upper - lower + 1) + lower;
    }
}
