package OOP.Lesson2Step1;

import java.util.Random;

public class WeightArrays {
    private final int[] valuesByWeightArray;
    public WeightArrays(int[] valuesArray, int[] weightsArray){
        int valuesByWeightArrayLength = 0;
        for (int weight: weightsArray){
            valuesByWeightArrayLength += weight;
        }
        this.valuesByWeightArray = new int[valuesByWeightArrayLength];
        for (int i = 0; i < weightsArray.length; i++) {
            for (int j = 0; j < weightsArray[i]; j++){
                this.valuesByWeightArray[--valuesByWeightArrayLength] = valuesArray[i];
            }
        }
    }
    public int returnRandomValue(){
        return valuesByWeightArray[new Random().nextInt(this.valuesByWeightArray.length)];
    }
}
