package com.example.administrator.headfirststudy.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.administrator.headfirststudy.R;
import com.example.administrator.headfirststudy.data.strategy_mode.MallardDuck;
import com.example.administrator.headfirststudy.data.strategy_mode.RedHeadDuck;
import com.example.administrator.headfirststudy.data.strategy_mode.base.Duck;

/**
 * User: laomao
 * Date: 2017-04-21
 * Time: 12-30
 */

public class StrategyModeActivity extends AppCompatActivity{

    private Duck mDuck;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_strategy_mode);
    }

    public void onclick(View view){
        mDuck=new MallardDuck();
        mDuck.flyDisplay();
    }

    public void onclick1(View view){
        mDuck=new RedHeadDuck();
        mDuck.flyDisplay();
    }
}
