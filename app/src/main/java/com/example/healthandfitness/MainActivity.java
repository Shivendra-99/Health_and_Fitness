package com.example.healthandfitness;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Animation buttom;
    TextView t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        buttom= AnimationUtils.loadAnimation(this,R.anim.downtoup);
        t1=(TextView)findViewById(R.id.final1);
        t1.setAnimation(buttom);
       /* Intent n=new Intent(this,MainActivity2.class);
        startActivity(n);
        finish();*/
    }
}