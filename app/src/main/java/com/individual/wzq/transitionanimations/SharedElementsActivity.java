package com.individual.wzq.transitionanimations;

import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * 共享元素 效果
 */
public class SharedElementsActivity extends AppCompatActivity {

    //分享元素1按钮
    @BindView(R.id.button)
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shared_elements);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.button)//分享元素1按钮
    public void onClick() {
//        startActivity(new Intent(this, MainActivity.class),
//                ActivityOptions.makeSceneTransitionAnimation
//                        (this, button, "myButton1")
//                        .toBundle());
        ActivityCompat.finishAfterTransition(this);
    }
}
