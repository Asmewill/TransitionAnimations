package com.individual.wzq.transitionanimations;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.transition.Fade;
/**
 * 浅入浅出 效果
 */
public class FadeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desalting);
        //进入退出效果 注意这里 创建的效果对象是 Fade()
        getWindow().setEnterTransition(new Fade().setDuration(2000));
        getWindow().setExitTransition(new Fade().setDuration(2000));
    }
}
