package com.example.moocmusic.activitys;

import android.app.Activity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.IdRes;

import com.example.moocmusic.R;


// 描述所有Activity,作为入口
public class BaseActivity extends Activity {
    // control nav_bar to display
    private ImageView mIvBack, mIvMe;
    private TextView mTvtitle;

    /*
    * findVIEWByid
    * */
    protected <T extends View> T fd (@IdRes int id){

        return findViewById(id);
    }
    /*
    * init nav_bar
    * */
    protected void initNavBar(boolean isShowBack, String title, boolean isShowMe){

        mIvBack = fd(R.id.iv_back);
        mTvtitle = fd(R.id.tv_title);
        mIvMe = fd(R.id.iv_me);

        mIvBack.setVisibility( isShowBack ? View.VISIBLE : View.GONE);
        mIvMe.setVisibility(isShowMe ? View.VISIBLE :View.GONE);
        mTvtitle.setText(title);

        mIvBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });


    }
}
