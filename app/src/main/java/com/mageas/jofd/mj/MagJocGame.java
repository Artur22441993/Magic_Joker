package com.mageas.jofd.mj;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.os.Handler;
import android.view.Display;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MagJocGame extends AppCompatActivity {

    ImageView img1;
    ConstraintLayout constraintLayout;
    private Handler mHandler = new Handler();
    Display display;
    ImageView imageView;
    int width;
    int height;
    int a;
    int c =0;

    private List<ImageView> allDrops;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img1 = findViewById(R.id.imageView);
        constraintLayout = findViewById(R.id.constrainLayout);


        display = getWindowManager().getDefaultDisplay();
        width = display.getWidth();
        height = display.getHeight();
        allDrops = new ArrayList<ImageView>();



        mHandler.post(runnableCloud);
        mHandler.post(runnableDropsCreation);
        mHandler.post(runnableDropsRun);




    }

    private Runnable runnableCloud = new Runnable() {
        @Override
        public void run() {
            float x = img1.getX();
            img1.setX(x - 5);
             a = img1.getWidth();
            if (img1.getX() < 0 - a){
               img1.setX(width + a);
            }

            mHandler.postDelayed(this::run,10);

        }
    };

    private Runnable runnableDropsCreation = new Runnable() {
        @Override
        public void run() {



            imageView = new ImageView(MagJocGame.this);
            Random random = new Random();
            int x = random.nextInt(4);
            switch (x){
                case 1:imageView.setImageResource(R.drawable.ic_slot_2);
                break;
                case 2:imageView.setImageResource(R.drawable.ic_slot_3);
                    break;
                case 3:imageView.setImageResource(R.drawable.ic_slot_4);
                    break;
            }
            ConstraintLayout.LayoutParams imageViewLayoutParams =
                    new ConstraintLayout.LayoutParams(width/5,width/5);
            imageView.setLayoutParams(imageViewLayoutParams);
            constraintLayout.addView(imageView);
            imageView.setX(img1.getX() + img1.getWidth()/2);
            imageView.setY(img1.getY() + img1.getHeight());
            allDrops.add(imageView);
            mHandler.postDelayed(this::run,500);
        }
    };

    private Runnable runnableDropsRun = new Runnable() {
        @Override
        public void run() {
            for (int i =0; i < allDrops.size(); i++){
                ImageView imageView = allDrops.get(i);
                imageView.setY(imageView.getY() + 5);
//                int b = imageView.getHeight();
//                if(imageView.getY()<  height){
//                    allDrops.remove(imageView);
//                    constraintLayout.removeView(imageView);
//                }
                imageView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        allDrops.remove(imageView);
                        constraintLayout.removeView(imageView);
                        c++;
                        getSupportActionBar().setTitle(""+c);;
                    }
                });
            }

            mHandler.postDelayed(this::run,10);
        }
    };
}