package com.mooc.moocmusic.activitys;

import android.content.Intent;
import android.os.Bundle;

import com.mooc.moocmusic.R;

import java.util.Timer;
import java.util.TimerTask;

public class WelcomeActivity extends BaseActivity {
    // 1. timout 3S
// 2. jump main page
    private Timer mTimer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        init();
    }

    /*
     * 初始化
     * */
    private void init() {
        mTimer = new Timer();
        mTimer.schedule(new TimerTask() {
            @Override
            public void run() {
//                Log.e("WelcomeActivity", "当前的线程为　：" + Thread.currentThread());
                toMain();
                tologin();
            }
        }, 3 * 1000);
    }

    /*跳转到MainActivity*/
    private void toMain() {

        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }

    /*跳转到LoginActivity*/
    private void tologin() {

        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
        finish();
    }
}