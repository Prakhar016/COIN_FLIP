package com.example.dmv.coinflip;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.RotateAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
ImageView iv_flip;
Button b_coin;
    Random r;
    int coinside;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iv_flip = (ImageView)findViewById(R.id.iv_coin);
        b_coin = (Button)findViewById(R.id.b_flip);
        r=new Random();

        b_coin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                coinside=r.nextInt(2);
                if(coinside==0){
                    iv_flip.setImageResource(R.drawable.h);
                    Toast.makeText(MainActivity.this,"HEAD",Toast.LENGTH_SHORT).show();
                }else if(coinside==1){
                    iv_flip.setImageResource(R.drawable.t);
                Toast.makeText(MainActivity.this,"TAIL",Toast.LENGTH_SHORT).show();}
                RotateAnimation ro = new RotateAnimation(0,360,
                        RotateAnimation.RELATIVE_TO_SELF , 0.5f ,
                        RotateAnimation.RELATIVE_TO_SELF,0.5f);
                ro.setDuration(1000);
                iv_flip.startAnimation(ro);
            }
        });
    }
}
