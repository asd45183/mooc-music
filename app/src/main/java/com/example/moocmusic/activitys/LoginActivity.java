package com.example.moocmusic.activitys;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.moocmusic.R;

public class LoginActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        initView();
    }


    /*
    * init view
    * */
    private void initView(){
        initNavBar(false,"登录",false);
    }
}
