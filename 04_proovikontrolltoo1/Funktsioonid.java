import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Funktsioonid {
    public static void main(String[] args) {
        double k = keskmiseLeidur(21,2,3);
        System.out.println(k);
        List<Integer> integerList = new ArrayList<>(Arrays.asList(1, 3, 4));
        Integer[] integers = {1, 2, 4};
        List<Double> double1 = libisevKeskmine(integerList);
        List<Double> double2 = libisevKeskmine(List.of(integers));
        System.out.println(double1);
        System.out.println(double2);
    }
    public static double keskmiseLeidur(int a, int b, int c){
        return (a + b + c) / 3.0;
    }
    public static List<Double> libisevKeskmine(List<Integer> integers){
        List<Double> doubles = new ArrayList<>();
        for (int i = 0; i < integers.size()-2; i++) {
            double uusNumber = (
                    integers.get(i)+
                    integers.get(i+1)+
                    integers.get(i+2)
            )/3.0;
            doubles.add(uusNumber);
        }
        return doubles;

    }
}
