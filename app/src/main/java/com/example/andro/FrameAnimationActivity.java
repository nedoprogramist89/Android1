package com.example.andro;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class FrameAnimationActivity extends AppCompatActivity {

    private AnimationDrawable frameAnimation;
    private ImageView imageView;
    private Button buttonStart, buttonStop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame_animation);

        overridePendingTransition(R.anim.fade_in, R.anim.fade_out);

        imageView = findViewById(R.id.imageViewFrameAnimation);
        buttonStart = findViewById(R.id.buttonStart);
        buttonStop = findViewById(R.id.buttonStop);


        imageView.setBackgroundResource(R.drawable.frame_animation);
        frameAnimation = (AnimationDrawable) imageView.getBackground();

        buttonStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                imageView.setBackgroundResource(R.drawable.frame_animation);
                frameAnimation = (AnimationDrawable) imageView.getBackground();
                frameAnimation.start();
            }
        });


        buttonStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                frameAnimation.stop();

            }
        });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
    }
}
