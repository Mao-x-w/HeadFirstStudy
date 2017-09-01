package com.example.administrator.headfirststudy.tools;

import java.util.concurrent.TimeUnit;

import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Func1;

/**
 * User: Joy
 * Date: 2016/11/1
 * Time: 12:33
 * 时间工具
 */

public class TimeDowner {

	/**
	 * 倒计时
	 * @param time 倒计时长,单位s
	 */
	public static Observable<Integer> countdown(int time) {
		if (time < 0)
			time = 0;
		final int countTime = time;
		return Observable.interval(0, 1, TimeUnit.SECONDS)
				.subscribeOn(AndroidSchedulers.mainThread())
				.observeOn(AndroidSchedulers.mainThread())
				.map(new Func1<Long, Integer>() {
					@Override
					public Integer call(Long aLong) {
						return countTime - aLong.intValue();
					}
				})
				.take(countTime + 1);
	}
}
