package com.magicsoft.toastutils;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.magicsoft.mylibrary.Utils;
import com.magicsoft.mylibrary.toast.MT;
import com.magicsoft.mylibrary.toast.ToastCustom;
import com.magicsoft.mylibrary.toast.ToastUtils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Utils.init(this);

    }

    public void one(View view) {
        //ToastUtils.setBgColor(ContextCompat.getColor(this,R.color.colorAccent));
        ToastUtils.showShort("ONEOENEEN");
    }

    public void one2(View view) {
        com.magicsoft.toastutils.utils.ToastUtils.showToast(getApplicationContext(),"TWOTJIT");
    }

    public void custom1(View view) {
        MT.toastCustomDefault(this,"成功",R.drawable.ic_prompt_success);
    }

    public void custom2(View view) {
        MT.toastCustomDefault(this,"警告");
    }

    public void custom3(View view) {
        ToastCustom.getmInstance().toastCustomDefault("失败",R.drawable.ic_prompt_error);
    }
}
