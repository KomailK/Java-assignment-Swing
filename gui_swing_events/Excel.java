package gui_swing_events;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Excel {

    private static ArrayList<Double> field ;

    public Excel() {
        field = new ArrayList<>(); // pas utile
    }

    public Excel(String input) {
        field = new ArrayList<>();
        String[] strNumArray = input.split(" ");
        List<String> strNumList = Arrays.asList(strNumArray);
        List<String> strNumArrayList = new ArrayList<>(strNumList);

        strNumArrayList.forEach(strNum -> {
                double item = Double.parseDouble(strNum);
                field.add(item);
        });
    }

   public double findTotal() {
       double total = 0;
        for (int i = 0; i < field.size(); i++) {
            total += field.get(i);
        }
        return total;
    }

    public double findAvg() {
        double avg = 0;
        avg = findTotal() / field.size();

        if(Double.isNaN(avg)){
            return 0.0;
        }else{
            return avg;
        }
    }

    public double findMax() {
        double max = 0;
        for (int i = 0; i < field.size(); i++) {
            if (field.get(i) > max) {
                max = field.get(i);
            }
        }
        return max;
    }

    public double findMin() {

        double min = field.get(0);
        for (int i = 0; i < field.size(); i++) {
            if (field.get(i) < min) {
                min = field.get(i);
            }
        }
        return min;
    }
}
