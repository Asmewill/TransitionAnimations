package com.individual.wzq.transitionanimations;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Pair;
import android.view.View;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * https://blog.csdn.net/w630886916/article/details/78319502
 * 本文主要实例用语展示，Android 5.0之后的新的转场动画效果
 * 主要展示的是：分解、滑动、浅入浅出、共享元素动画效果
 */
public class MainActivity extends AppCompatActivity {

    @BindView(R.id.explode)
    Button explode;
    @BindView(R.id.slide)
    Button slide;
    @BindView(R.id.fade)
    Button fade;
    @BindView(R.id.sharedElements1)
    Button sharedElements1;
    @BindView(R.id.sharedElements2)
    Button sharedElements2;
    @BindView(R.id.sharedElements4)
    Button sharedElements4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.explode, R.id.slide, R.id.fade, R.id.sharedElements1, R.id.sharedElements2, R.id.sharedElements4})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.explode://分解
                startActivity(new Intent(this, ExplodeActivity.class), ActivityOptions.makeSceneTransitionAnimation(this).toBundle());
                break;
            case R.id.slide://滑动
                startActivity(new Intent(this, SlideActivity.class), ActivityOptions.makeSceneTransitionAnimation(this).toBundle());

                break;
            case R.id.fade://渐入渐出
                startActivity(new Intent(this, FadeActivity.class), ActivityOptions.makeSceneTransitionAnimation(this).toBundle());

                break;
            case R.id.sharedElements1://共享元素 下一个页面的按钮 相互绑定
                startActivity(new Intent(this, SharedElementsActivity.class),
                        ActivityOptions.makeSceneTransitionAnimation
                                (this, view, "myButton1")
                                .toBundle());
            case R.id.sharedElements2://共享元素 多个元素
                startActivity(new Intent(this, SharedElementsActivity.class),
                        ActivityOptions.makeSceneTransitionAnimation
                                (this,
                                        Pair.create(view, "myButton2"),
                                        Pair.create(view, "myButton3"))
                                .toBundle());
                break;
            case R.id.sharedElements4://共享元素 单独设置
                startActivity(new Intent(this, SharedElementsActivity.class),
                        ActivityOptions.makeSceneTransitionAnimation
                                (this, view, "myButton4")
                                .toBundle());
                break;
        }
    }
}
