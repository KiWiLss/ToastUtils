package com.magicsoft.toastutils;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.magicsoft.mylibrary.toast.ToastUtils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void one(View view) {
        //ToastUtils.setBgColor(ContextCompat.getColor(this,R.color.colorAccent));
        ToastUtils.showShort("ONEOENEEN");
    }

    public void one2(View view) {

        ToastUtils.showShort("TWOTJWOTJWOTJO");
    }
}
