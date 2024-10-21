package com.example.andro;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class TweenAnimationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tween_animation);

        overridePendingTransition(R.anim.fade_in, R.anim.fade_out);

        ImageView imageView = findViewById(R.id.imageViewTweenAnimation);
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.tween_animation);
        imageView.startAnimation(animation);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
    }
}