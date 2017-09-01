package com.example.administrator.headfirststudy.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.administrator.headfirststudy.R;
import com.example.administrator.headfirststudy.data.strategy_mode.base.Duck;

public class MainActivity extends AppCompatActivity {

    private Duck mDuck;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onclick(View view){
        startActivity(new Intent(this,StrategyModeActivity.class));
    }

    public void onclick1(View view){
        startActivity(new Intent(this,ObserverModeActivity.class));
    }

    public void onclick2(View view){
        startActivity(new Intent(this,DecorateModeActivity.class));
    }
}
