package asdf.hello.leetcode.problem;

import android.util.Log;

/**
 * Created by wangshiyuan on 2018/1/4.
 *

 Given a string, find the length of the longest substring without repeating characters.

 Examples:

 Given "abcabcbb", the answer is "abc", which the length is 3.

 Given "bbbbb", the answer is "b", with the length of 1.

 Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is a subsequence and not a substring

 */

public class Problem_3 extends BaseProblem {
    @Override
    public void execute() {
        String inputString = "abcabcbb";
        int length = lengthOfLongestSubstring(inputString);
        Log.e(TAG, "input " + inputString + " result = " + length);
    }

    public int lengthOfLongestSubstring(String s) {
        int nResult = 1;
        if (s.length() == 0){
            nResult = 0;
        }

        int nLen = s.length();
        for (int i = 0; i < nLen; i++){
            for (int j = i + 1; j < nLen; j++){
                String tmp = s.substring(i, j);
                if (tmp.contains("" + s.charAt(j))){
//                    Log.e(TAG, "tmp = " + tmp + ", i = " + i + ", j = " + j);
                    break;
                }else {
                    if (j + 1 - i > nResult){
//                        Log.e(TAG, "~~ tmp = " + tmp + ", j = " + j);
//                        Log.e(TAG, "~~ i = " + i + ", j = " + j);
                        nResult = j + 1 - i;
//                        Log.e(TAG, "~~ nResult = " + nResult);
                    }
                }
            }
        }


        return nResult;
    }
}
