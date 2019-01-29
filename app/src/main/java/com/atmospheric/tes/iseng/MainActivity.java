package com.atmospheric.tes.iseng;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {

    FrameLayout f; //Connect ke id frameLayout di activity_main.xml

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        f = findViewById(R.id.frameLayout);

        f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, realtime_2.class));
            }
        });
    }

    public void Realtime(View view) {
        Intent intent = new Intent(MainActivity.this, realtime.class);
        startActivity(intent);
    }

}
