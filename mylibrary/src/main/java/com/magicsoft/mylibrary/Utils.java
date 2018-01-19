package com.magicsoft.mylibrary;

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
    private static Context context;
    public static Context getContext(){
        Utils.context=MyApp.getContext();
        if (context != null) return context;
        throw new NullPointerException("u should init first");
    }
    public static void init(@NonNull final Context context){
        Utils.context=context.getApplicationContext();
    }
//    public static Context getContext(){
//        return MyApp.getContext();
////        if (context != null) return context;
////        throw new NullPointerException("u should init first");
//    }
}
