package asdf.hello.leetcode.problem;

/**
 * Created by Administrator on 2018/1/4.
 */

public class ProblemRunner {
    private static class Holder {
        private static ProblemRunner sInstance = new ProblemRunner();
    }

    private BaseProblem mProblem;
    private ProblemRunner() {
        init();
    }

    private void init() {
        mProblem = new Problem_1();
    }

    public static ProblemRunner getInstance() {
        return Holder.sInstance;
    }

    public void runProblem(){
        mProblem.execute();
    }
}
