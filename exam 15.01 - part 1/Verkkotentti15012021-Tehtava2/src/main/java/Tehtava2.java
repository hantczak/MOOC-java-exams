import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Tehtava2 {
    public static void main(String[] args) {
        int[] t1 = {1, 2, 3, 4};
        int[] t2 = {2, 3, 5, 6};
        int[] summedArrays = sumArrays(t1, t2);
        System.out.println(Arrays.toString(summedArrays));

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(6);

        List<Integer> newList1 = divisible(list,1);
        List<Integer> newList2 = divisible(list,2);
        List<Integer> newList3 = divisible(list,3);

        System.out.println(newList1);
        System.out.println(newList2);
        System.out.println(newList3);
    }

    public static int[] sumArrays(int[] array1, int[] array2) {
        int[] summedArray = new int[array1.length];
        for (int i = 0; i < summedArray.length; i++) {
            summedArray[i] = array1[i] + array2[i];
        }
        return summedArray;
    }

    public static List<Integer> divisible(List<Integer> list, int divider) {
        List<Integer> newList;
        newList = list.stream().filter(number -> number % divider == 0)
                .collect(Collectors.toCollection(ArrayList::new));
        return newList;
    }


}
