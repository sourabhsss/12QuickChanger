package com.techyrh.sourabhupreti.quickchanger;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {
    RadioGroup radioGroup;
    RelativeLayout layout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        radioGroup=findViewById(R.id.radio);
        layout=findViewById(R.id.layout);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int i) {

                switch (i){
                    case R.id.btnb:
                        layout.setBackgroundColor(Color.parseColor("#30336B"));
                        break;
                    case R.id.btng:
                        layout.setBackgroundColor(Color.parseColor("#019031"));
                        break;
                        case R.id.btnr:
                        layout.setBackgroundColor(Color.parseColor("#E8290B"));
                        break;
                }



            }
        });




    }
}
