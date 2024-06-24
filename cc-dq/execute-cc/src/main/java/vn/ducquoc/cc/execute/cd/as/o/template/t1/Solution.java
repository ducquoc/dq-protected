package vn.ducquoc.cc.execute.cd.as.o.template.t1;

//import java.util.*;

// T1
@SuppressWarnings({"all"})
class Solution {
    public int solution(int[] D, int[] C, int P) {
        return CdT1.solution(D, C, P);
    }
}

@SuppressWarnings({"unused", "Duplicates", "ALL"})
class CdT1 {
    public static int solution(int[] D, int[] C, int P) {
        return solV2(D, C, P);
    }

    public static int solV2(int[] D, int[] C, int P) {
        int N = D.length;
        int rs = 0;
        java.util.List<int[]> orderList = new java.util.ArrayList<>();
        for (int i = 0; i < N; i++) {
            orderList.add(new int[]{D[i], C[i]});
        }
        java.util.Collections.sort(orderList,
                (a, b) -> a[0] == b[0] ? Integer.compare(a[1], b[1]) : Integer.compare(a[0], b[0]));
        for (int[] order : orderList) {
            if (P >= order[1]) {
                P = P - order[1];
                rs++;
            } else {
                break;
            }
        }

        return rs;
    }

    public static int solV1(int[] D, int[] C, int P) {
        int N = D.length;
        int rs = 0;
        java.util.List<int[]> orderList = new java.util.ArrayList<>();
        for (int i = 0; i < N; i++) {
            orderList.add(new int[]{D[i], C[i]});
        }
        java.util.Collections.sort(orderList, (a, b) -> Integer.compare(a[0], b[0]));
        for (int[] order : orderList) {
            int distance = order[0];
            int monitorsNeeded = order[1];
            if (P >= monitorsNeeded) {
                P = P - monitorsNeeded;
                rs++;
            } else {
                break;
            }
        }

        return rs;
    }

    public static void main(String[] args) throws Exception {
        d(solution(new int[]{5, 11, 1, 3}, new int[]{6, 1, 3, 2}, 7), 2);
        d(solution(new int[]{10, 15, 1}, new int[]{10, 1, 2}, 3), 1);
        d(solution(new int[]{11, 18, 1}, new int[]{9, 18, 8}, 7), 0);
        d(solution(new int[]{1, 4, 2, 5}, new int[]{4, 9, 2, 3}, 19), 4);

        d(solution(new int[]{1}, new int[]{1}, 0), 0);
        d(solution(new int[]{1}, new int[]{1}, 1), 1);
        d(solution(new int[]{1}, new int[]{1}, 5), 1);

        d(solution(new int[]{1000000000}, new int[]{1000000000}, 1000000000), 1);
        d(solution(new int[]{1000000000}, new int[]{1}, 1000000000), 1);
        d(solution(new int[]{1}, new int[]{1000000000}, 1), 0);
        d(solution(new int[]{1000000000}, new int[]{1}, 1), 1);

        d(solution(new int[]{1000000000, 1000000000}, new int[]{1000000000, 1000000000}, 1000000000), 1);
        d(solution(new int[]{500000000, 500000000}, new int[]{500000000, 500000000}, 1000000000), 2);
        d(solution(new int[]{500000000, 500000000, 500000000}, new int[]{500000000, 500000000, 500000000}, 1000000000), 2);

        d(solution(new int[]{11, 18, 1, 1, 1, 1, 1, 18}, new int[]{14, 2, 3, 8, 4, 4, 4, 15}, 18), 4);
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
