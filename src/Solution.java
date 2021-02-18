import java.util.*;
import java.util.stream.Stream;

public class Solution {
    public static void main(String[] args) {
        var solution = new Solution();
        int[] abc = {2, 3, 1, 5};
        int[] a = {1, 2};
        int[] b = {2, 3};
        System.out.println("Wynik: " + solution.solution(abc));
    }

    public int solution(int[] A) {
        if (A.length == 0)
            return 1;
        Arrays.sort(A);
        int index = 1;
        for (int i : A) {
            if (i != index)
                return index;
            index++;
        }
        return A[A.length-1]+1;
    }
}
