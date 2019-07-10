package com.mooc.moocmusic.activitys;

import android.os.Bundle;

import com.mooc.moocmusic.R;
import com.mooc.moocmusic.views.InputView;

public class LoginActivity extends BaseActivity {
    private InputView mInputPhone, mInputPassowrd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        initView();
    }


    /*
     * init view
     * */
    private void initView() {
        initNavBar(false, "登录", false);

    }
}
