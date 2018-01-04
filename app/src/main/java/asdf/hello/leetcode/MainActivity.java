package asdf.hello.leetcode;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import asdf.hello.leetcode.problem.ProblemRunner;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.click).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        doTest();
    }

    private void doTest(){
        new Thread(new Runnable() {
            @Override
            public void run() {
                ProblemRunner.getInstance().runProblem();
            }
        }).start();
    }
}
