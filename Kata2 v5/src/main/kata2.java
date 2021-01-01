package main;

import java.util.HashMap;
import java.util.Map;

public class kata2 {

    public static void main(String[] args) {
        //Integer[] data = new Integer[]{16, 12, 3, 7, 12, 8, 12, 8, 16, 19, 9, 2, 2, 16, 16};
        String[] data = new String[]{"Ramón", "Pedro", "Pepe", "Ramón", "María", "Pepe", "Pepe", "María", "Pepe", "Pepe", "Pedro", "María", "Ramón"};
        Histogram histo = new Histogram(data);
        Map<String,Integer> histogr = histo.getHistogram();
        
        for (Map.Entry<String,Integer> entry : histogr.entrySet()) {
            System.out.println(entry.getKey() + " ==> " + histogr.get(entry.getKey()));
        }
    }
    
}