package com.example.administrator.headfirststudy.tools;

import android.widget.Toast;

import com.example.administrator.headfirststudy.CustomApplication;

import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;

/**
 * User: laomao
 * Date: 2017-04-19
 * Time: 16-29
 */

public class ToastUtils {

    private static Toast toast;

    public static void showShortToast(String msg) {
        showToast(msg, Toast.LENGTH_SHORT);
    }

    public static void showLongToast(String msg) {
        showToast(msg, Toast.LENGTH_LONG);
    }

    private static void showToast(String msg, int length) {
        if (toast != null) {
            toast.cancel();
            toast.setText(msg);
            toast.setDuration(length);
        } else {
            toast = Toast.makeText(CustomApplication.getInstance().getGloableContext(), msg, length);
        }

        Observable.just("").observeOn(AndroidSchedulers.mainThread()).subscribe(new Action1<String>() {
            @Override
            public void call(String s) {
                toast.show();
            }
        });
    }

    public void cancleCurrentToast() {
        if (toast != null)
            toast.cancel();
    }

}
