import java.util.*;

class Student {
    int values;
    int weights;

    Student(int x, int y) {
        this.values = x;
        this.weights = y;
    }
}

class MyCom implements Comparator<Student> {
    @Override
    public int compare(Student x, Student y) {
        double r1 = (double) x.values / x.weights;
        double r2 = (double) y.values / y.weights;
        if (r2 > r1) return 1;
        else if (r2 < r1) return -1;
        else return 0;
    }
}

class Solution {
    double fractionalKnapsack(int[] values, int[] weights, int W) {
        ArrayList<Student> arr = new ArrayList<>();
        for (int i = 0; i < values.length; i++) {
            arr.add(new Student(values[i], weights[i]));
        }

        Collections.sort(arr, new MyCom());

        double maxval = 0.0;
        int maxSize = 0;

        for (int i = 0; i < arr.size(); i++) {
            if (maxSize + arr.get(i).weights <= W) {
                maxSize += arr.get(i).weights;
                maxval += arr.get(i).values;
            } else {
                int remain = W - maxSize;
                maxval += ((double) arr.get(i).values / arr.get(i).weights) * remain;
                break;
            }
        }

        return maxval;
    }
}
