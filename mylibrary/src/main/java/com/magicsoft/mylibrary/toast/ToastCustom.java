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
import com.magicsoft.mylibrary.Utils;

/**
 * <pre>
 *     author : Lss winding
 *     e-mail : kiwilss@163.com
 *     time   : 2018/1/19
 *     desc   : ${DESCRIPTION}
 *     version: ${VERSION}
 * </pre>
 */


public class ToastCustom {



    private Toast mImgToast;

    private ImageView mIvIcon;

    private TextView mTv;



    private ToastCustom(){}

    private static class ToastCustomSigle{
        @SuppressLint("StaticFieldLeak")
        private static final ToastCustom MINSTANCE=new ToastCustom();
    }

    public static ToastCustom getmInstance(){
        return ToastCustomSigle.MINSTANCE;
    }

    /**
     * @param str      内容
     */
    public void toastCustomDefault(final String str) {
        toastCustomDefault(Utils.getContext(),str, R.drawable.alert);
    }


    private View mView;
    public void toastCustomDefault(final Context mContext, final String str, int imgRes) {
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

    public void toastCustomDefault( final String str, int imgRes) {
        if (mImgToast==null){
            mImgToast = new Toast(Utils.getContext());
            if (mView==null){
                mView = LayoutInflater.from(Utils.getContext()).inflate(R.layout.toast_gettrue, null);
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
