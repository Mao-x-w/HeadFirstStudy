package com.example.administrator.headfirststudy.data.strategy_mode;

import com.example.administrator.headfirststudy.data.strategy_mode.base.FlyBehavior;
import com.example.administrator.headfirststudy.tools.ToastUtils;

/**
 * User: laomao
 * Date: 2017-04-20
 * Time: 15-35
 */

public class FlyNoWayBehavior implements FlyBehavior{
    @Override
    public void fly() {
        ToastUtils.showShortToast("FlyNoWayBehavior");
    }
}
