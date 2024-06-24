package vn.ducquoc.cc.execute.lc.as.o.template;

//import java.util.*;

// Template1
@SuppressWarnings({"unused", "all", "Duplicates"}) //noinspection Duplicates
class Solution {
    public int[] twoSum(int[] nums, int target) {
        return LcP1Template.twoSum(nums, target);
    }
}

class LcP1Template {
    public static int[] twoSum(int[] nums, int target) {
        int N = nums.length; // [2..10^4]
        java.util.Map<Integer, Integer> seen = new java.util.HashMap<>();
        for (int i = 0; i < N; i++) {
            Integer complementIdx = seen.get(target - nums[i]);
            if (complementIdx != null && complementIdx != i) {
                return new int[]{complementIdx, i};
            }
            seen.put(nums[i], i);
        }
        return N >= 2 ? new int[]{0, 1} : new int[]{};
    }

    public static void main(String[] args) throws Exception {
        d(twoSum(new int[]{3, 2, 4}, 6), new int[]{1, 2});
        d(twoSum(new int[]{3, 3}, 6), new int[]{0, 1});
    }

    public static void d(Object obj, Object... ex) {
        pl("[DEBUG] " + arrToString(obj) + (ex == null || ex.length == 0 ? "" : " Expected: " + arrToString(ex)));
    }

    public static void pl(Object obj) { // info print line
        System.out.println(obj);
    }

    public static String arrToString(Object arr) {
        return (arr instanceof int[]) ? java.util.Arrays.toString((int[]) arr)
                : (arr instanceof long[]) ? java.util.Arrays.toString((long[]) arr)
                : (arr instanceof Object[]) ? java.util.Arrays.deepToString((Object[]) arr)
                : String.valueOf(arr);
    }
}
