package main;

import java.util.HashMap;
import java.util.Map;

public class kata2 {

    public static void main(String[] args) {
        int[] data = new int[]{16, 12, 3, 7, 12, 8, 12, 8, 16, 19, 9, 2, 2, 16, 16};
        Map<Integer,Integer> histogram = new HashMap<>();
        
        for (int key : data) {
            histogram.put(key, histogram.containsKey(key) ? histogram.get(key) + 1 : 1);
        }
        /*
        for (int i = 0; i < data.length; i++) {
            if (histogram.containsKey(data[i])) 
                histogram.put(data[i], histogram.get(data[i]) + 1);
            else histogram.put(data[i], 1);
        }*/
        
        for (Map.Entry<Integer,Integer> entry : histogram.entrySet()) {
            System.out.println(entry.getKey() + " ==> " + histogram.get(entry.getKey()));
        }
    }
    
}
