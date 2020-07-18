package com.example.administrator.headfirststudy.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.example.administrator.headfirststudy.R;
import com.example.administrator.headfirststudy.data.decorate_mode.MongoMilkTea;
import com.example.administrator.headfirststudy.data.decorate_mode.PearlMilkTea;
import com.example.administrator.headfirststudy.data.decorate_mode.MilkDecorator;
import com.example.administrator.headfirststudy.data.decorate_mode.SugarDecorator;
import com.example.administrator.headfirststudy.data.decorate_mode.base.Beverage;
import com.example.administrator.headfirststudy.tools.ToastUtils;

/**
 * User: laomao
 * Date: 2017-04-27
 * Time: 10-20
 */

public class DecorateModeActivity extends AppCompatActivity{

    protected RadioButton mRbEspresso;
    protected RadioButton mRbHouseblend;
    protected RadioGroup mRgCoffee;
    protected CheckBox mCbMocha;
    protected CheckBox mCbSugar;
    protected Button mBtnPay;
    protected TextView mTvResult;

    private Beverage beverage;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setContentView(R.layout.activity_decorate_mode);
        initView();
        initData();
    }

    private void initView() {
        mRbEspresso = (RadioButton) findViewById(R.id.rb_espresso);
        mRbHouseblend = (RadioButton) findViewById(R.id.rb_houseblend);
        mRgCoffee = (RadioGroup) findViewById(R.id.rg_coffee);
        mCbMocha = (CheckBox) findViewById(R.id.cb_mocha);
        mCbSugar = (CheckBox) findViewById(R.id.cb_sugar);
        mBtnPay = (Button) findViewById(R.id.btn_pay);
        mTvResult = (TextView) findViewById(R.id.tv_result);
    }

    private void initData() {

        mBtnPay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mRgCoffee.getCheckedRadioButtonId()==R.id.rb_espresso){
                    beverage=new PearlMilkTea();
                }else if (mRgCoffee.getCheckedRadioButtonId()==R.id.rb_houseblend){
                    beverage=new MongoMilkTea();
                }else {
                    ToastUtils.showShortToast("请选择要购买的咖啡");
                    return;
                }

                if (mCbMocha.isChecked()){
                    beverage=new MilkDecorator(beverage);
                }

                if (mCbSugar.isChecked()){
                    beverage=new SugarDecorator(beverage);
                }

                mTvResult.setText("您点了："+beverage.getDesc()+"  总消费："+beverage.cost()+"$");
            }
        });

    }
}
