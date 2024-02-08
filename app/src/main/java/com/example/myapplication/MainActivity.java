package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1,button2;

        button1=findViewById(R.id.bt1);
        button2=findViewById(R.id.bt2);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                replacefrg(new frag1());

            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                replacefrg(new frag2());
            }
        });
    }

    private void replacefrg(Fragment frg) {
        FragmentManager fmanager=getSupportFragmentManager();
        FragmentTransaction ftransaction=fmanager.beginTransaction();
        ftransaction.replace(R.id.framelayout,frg);
        ftransaction.commit();
    }
}