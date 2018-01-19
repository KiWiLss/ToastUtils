package com.magicsoft.mylibrary.toast;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.magicsoft.mylibrary.R;

public class MT {

    /**
     * @author zsj
     * @descraption 点击多次如果当前toast已经存在不再弹出。Toast.LENGTH_SHORT=2s,Toast.LENGTH_LONG=3.5s
     * @Date 2016/8/12
     */
    private static Toast mToast;
    private static Toast mImgToast;
    private static ImageView mIvIcon;
    static TextView mTv;



    /**
     * toast通知
     *
     * @param mContext
     * @param str
     */
    @SuppressLint("ShowToast")
    public static void toastCenter(final Context mContext, final String str) {
        if (mToast == null) {
            mToast = Toast.makeText(mContext, str, Toast.LENGTH_SHORT);
        } else {
            mToast.setText(str);
        }
        mToast.setGravity(Gravity.CENTER, 0, 0);
        mToast.show();
    }

    /**
     * toast通知
     *
     * @param mContext
     * @param str
     */
    public static void toastBottom(final Context mContext, final String str) {
        if (mToast == null) {
            mToast = Toast.makeText(mContext, str, Toast.LENGTH_SHORT);
        } else {
            mToast.setText(str);
        }
        mToast.setGravity(Gravity.BOTTOM, 0, 0);
        mToast.show();
    }

    /**
     * toast通知
     *
     * @param mContext
     * @param str
     */
    public static void toastBottomLong(final Context mContext, final String str) {
        if (mToast == null) {
            mToast = Toast.makeText(mContext, str, Toast.LENGTH_LONG);
        } else {
            mToast.setText(str);
        }
        mToast.setGravity(Gravity.BOTTOM, 0, 0);
        mToast.show();
    }

    /**
     * toast通知
     *
     * @param mContext
     * @param str
     */
    public static void toastCenterLong(final Context mContext, final String str) {
        if (mToast == null) {
            mToast = Toast.makeText(mContext, str, Toast.LENGTH_LONG);
        } else {
            mToast.setText(str);
        }
        mToast.setGravity(Gravity.CENTER, 0, 0);
        mToast.show();
    }
    /**
     * @param mContext 上下文
     * @param str      内容
     */
    public static void toastCustomDefault(final Context mContext, final String str) {
        toastCustomDefault(mContext,str,R.drawable.alert);
    }

    static View mView;
    public static void toastCustomDefault(final Context mContext, final String str,int imgRes) {
        if (mImgToast==null){
            mImgToast = new Toast(mContext);
            if (mView==null){
                mView = LayoutInflater.from(mContext).inflate(R.layout.toast_gettrue, null);
            }
            mImgToast.setView(mView);
            mImgToast.setDuration(Toast.LENGTH_SHORT);
        }

        if (mTv==null){
            mTv = (TextView) mView.findViewById(R.id.tv_toast_text);
        }
        if (mIvIcon==null) {
            mIvIcon = mView.findViewById(R.id.iv_toast_icon);
        }
        mTv.setText(str);
        mIvIcon.setImageResource(imgRes);
        mImgToast.setGravity(Gravity.CENTER, 0, 0);
        mImgToast.show();
    }
}