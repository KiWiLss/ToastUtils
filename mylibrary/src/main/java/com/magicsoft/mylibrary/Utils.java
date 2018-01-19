package com.magicsoft.mylibrary;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.annotation.NonNull;

/**
 * <pre>
 *     author : Lss winding
 *     e-mail : kiwilss@163.com
 *     time   : 2018/1/10
 *     desc   : ${DESCRIPTION}
 *     version: ${VERSION}
 * </pre>
 */


public class Utils {
    static {
        Utils.context=MyApp.getContext().getApplicationContext();
    }
    @SuppressLint("StaticFieldLeak")
    private static Context context;
    public static Context getContext(){
        //Utils.context=MyApp.getContext();
        if (context != null) return context;
        throw new NullPointerException("u should init first");
    }

    public static void init(@NonNull final Context context){
        Utils.context=context.getApplicationContext();
    }
}
