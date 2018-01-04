package asdf.hello.leetcode.problem;

import android.util.Log;

/**
 * Created by Administrator on 2018/1/4.
 *
 *
 *

 Given an array of integers, return indices of the two numbers such that they add up to a specific target.

 You may assume that each input would have exactly one solution, and you may not use the same element twice.

 Example:
 Given nums = [2, 7, 11, 15], target = 9,

 Because nums[0] + nums[1] = 2 + 7 = 9,
 return [0, 1].

 */

public class Problem_1 extends BaseProblem {
    @Override
    public void execute() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int [] result = twoSum(nums, target);

        Log.e(TAG, getResultInfo(result));
    }

    private String getResultInfo(int[] result){

        StringBuffer sb = new StringBuffer();
        sb.append("[");
        for (int i = 0; i < result.length; i++){
            sb.append(result[i]);

            if (i != result.length - 1){
                sb.append(", ");
            }
        }

        sb.append("]");
        return sb.toString();
    }

    public int[] twoSum(int[] nums, int target) {
        int[] result = {1, 2};
        return result;
    }
}
