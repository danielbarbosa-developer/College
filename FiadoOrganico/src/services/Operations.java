package services;

public class Operations {
    public static int SumWithWhile(int[] values){
        int i = 0;
        int total = 0;
        while(i < values.length ){
            total += values[i];
        }
        return total;
    }
    public static int SumWithFor(int[] values){
        int total = 0;
        for(int i = 0; i < values.length; i++){
            total += values[i];
        }
        return total;
    }
    public static int SumWithForeach(int[] values){
        int total = 0;
        for(int value : values){
            total += value;
        }
        return total;
    }
}
