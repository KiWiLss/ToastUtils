package com.magicsoft.mylibrary.toast;

import android.widget.Toast;

import com.magicsoft.mylibrary.Utils;

public class ToastEfficientUtils {//原生的默认位置，高效
      
    /** 之前显示的内容 */  
    private static String oldMsg ;  
    /** Toast对象 */  
    private static Toast toast = null ;
    /** 第一次时间 */  
    private static long oneTime = 0 ;  
    /** 第二次时间 */  
    private static long twoTime = 0 ;  
      
    /** 
     * short显示Toast
     * @param message
     */  
    public static void showToast( String message){
        showToast(message,Toast.LENGTH_SHORT);
    }
    /**
     * 自定义时间显示Toast
     * @param message
     */
    public static void showToast( String message,int duration){
        if(toast == null){
            toast = Toast.makeText(Utils.getContext(), message, duration);
            toast.show() ;
            oneTime = System.currentTimeMillis() ;
        }else{
            twoTime = System.currentTimeMillis() ;
            if(message.equals(oldMsg)){
                if(twoTime - oneTime > Toast.LENGTH_SHORT){
                    toast.show() ;
                }
            }else{
                oldMsg = message ;
                toast.setText(message) ;
                toast.show() ;
            }
        }
        oneTime = twoTime ;
    }


    

}  