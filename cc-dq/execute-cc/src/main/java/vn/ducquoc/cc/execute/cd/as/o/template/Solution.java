package vn.ducquoc.cc.execute.cd.as.o.template;

//import java.util.*;

// TemplateCd
@SuppressWarnings({"all"})
class Solution {
    public int solution(int[] A) {
        return CdTemplate.solution(A);
    }
}

@SuppressWarnings({"unused", "Duplicates", "ALL"})
class CdTemplate {
    public static int solution(int[] A) {
        return solV1(A);
    }

    public static int solV1(int[] A) {
        int N = A.length;
        java.util.Map<Integer, Integer> seen = new java.util.HashMap<>();
        for (int i = 0; i < N; i++) {
            seen.put(A[i], seen.getOrDefault(A[i], 0) + 1);
        }
        for (int i = 1; i <= N; i++) {
            if (seen.get(i) == null) {
                return i;
            }
        }
        return N + 1;
    }

    public static void main(String[] args) throws Exception {
        int[] in1 = {1, 3, 6, 4, 1, 2};
        d(solV1(in1), 5);
        d(solV1(new int[]{1, 2, 3}), 4);
        d(solV1(new int[]{-1, -3}), 1);
    }

    public static void d(Object obj, Object... ex) {
        pl("[DEBUG] " + arrToString(obj) + (ex == null || ex.length == 0 ? "" : " Expected: " + arrToString(ex)));
    }

    public static void pl(Object obj) {
        System.out.println(obj);
    }

    public static String arrToString(Object arr) {
        return (arr instanceof int[]) ? java.util.Arrays.toString((int[]) arr)
                : (arr instanceof long[]) ? java.util.Arrays.toString((long[]) arr)
                : (arr instanceof Object[]) ? java.util.Arrays.deepToString((Object[]) arr)
                : String.valueOf(arr);
    }
}
