package com.donjacoboapp;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

public class SplashScreen extends AppCompatActivity {

    private ImageView img;
    AnimationDrawable frameanimation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        img = (ImageView) findViewById(R.id.LoadingView);
        img.setBackgroundResource(R.drawable.loading);
        frameanimation=(AnimationDrawable) img . getBackground();

        Thread tiempo =new Thread(){
            public void run (){
                try{
                    sleep(2000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }finally {
                    Intent intento = new Intent(SplashScreen.this, MainActivity.class);
                    startActivity(intento);
                }
            }
        };
        frameanimation.start();
        tiempo.start();
    }
    @Override
    protected void  onPause (){
        super.onPause();
        frameanimation.stop();
        finish();
    }
}
