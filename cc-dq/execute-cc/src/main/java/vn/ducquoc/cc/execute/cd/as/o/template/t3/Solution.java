package vn.ducquoc.cc.execute.cd.as.o.template.t3;

//import java.util.*;

// T3
@SuppressWarnings({"all"})
class Solution {
    public int solution(int A, int B) {
        return CdT3.solution(A, B);
    }
}

@SuppressWarnings({"unused", "Duplicates", "ALL"})
class CdT3 {
    public static int solution(int A, int B) {
        return solV2(A, B);
    }

    public static int solV2(int A, int B) {
        return solV2io(Math.min(A, B), Math.max(A, B));
    }

    static int solV2io(int a, int b) {
        int rs = 0;
        if (a + b <= 3) return 0; // a <= b
        if (a + b <= 7) return 1;
        if (a == b) return a / 2;
        if (a < b / 4) {
            return b / 4;
        } else if (a >= b / 4 && a < b / 3) {
            return b / 4;
        } else if (a >= b / 3 && a < 2 * b / 3) {
            return b / 3;
        } else if (a >= 2 * b / 3) {
            return a / 2;
        } else {
            return Math.max(a / 2, b / 3);
        }
    }

    public static int solV1(int A, int B) {
        int rs = 0;
        if (A + B <= 3) return 0;
        if (A + B <= 7) return 1;
        if (A < B / 4) {
            return B / 4;
        } else if (A >= B / 3 && A < 2 * B / 3) {
            return B / 3;
        }
        if (B < A / 4) {
            return A / 4;
        } else if (B >= A / 3 && B < 2 * A / 3) {
            return A / 3;
        }

        int left = 0;
        int right = (A + B) / 4;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (canDevideBinarySearch(A, B, mid)) {
                if (left == right && ((A < 2 * mid && B < 3 * mid) || (B < 2 * mid && A < 3 * mid))) {
                    return rs; // break;
                }
                rs = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return rs;
    }

    static boolean canDevideBinarySearch(int A, int B, int squareSide) {
        int minNeeded = 4 * squareSide;
        return (A + B) >= minNeeded && (A >= squareSide && B >= squareSide);
    }

    public static void main(String[] args) throws Exception {
        d(solution(10, 21), 7);
        d(solution(2, 1), 0);
        d(solution(1, 8), 2);
        d(solution(13, 11), 5);

        d(solution(0, 0), 0);
        d(solution(0, 1), 0);
        d(solution(1, 0), 0);
        d(solution(1, 1), 0);

        d(solution(3, 3), 1);
        d(solution(3, 4), 1);
        d(solution(4, 3), 1);

        d(solution(4, 4), 2);
        d(solution(4, 5), 2);
        d(solution(5, 4), 2);

        d(solution(10, 10), 5);
        d(solution(10, 15), 5);
        d(solution(16, 27), 9);
        d(solution(16, 28), 9);

        d(solution(16, 80), 20);
        d(solution(19, 80), 20);
        d(solution(20, 80), 20);
        d(solution(22, 80), 20);
        d(solution(24, 80), 20);
        d(solution(25, 80), 20);

        d(solution(26, 80), 26);
        d(solution(30, 80), 26);
        d(solution(38, 80), 26);
        d(solution(46, 80), 26);

        d(solution(54, 80), 27);
        d(solution(62, 80), 31);
        d(solution(70, 80), 35);
        d(solution(78, 80), 39);

        d(solution(86, 80), 40);
        d(solution(102, 80), 40);
        d(solution(118, 80), 40);
        d(solution(134, 80), 44);
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
