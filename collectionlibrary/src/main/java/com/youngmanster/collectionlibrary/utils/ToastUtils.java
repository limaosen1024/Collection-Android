package com.youngmanster.collectionlibrary.utils;

import android.content.Context;
import android.view.Gravity;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Toast提示类
 * Created by yangyan
 * on 2018/5/14.
 */

public class ToastUtils {

	private static Toast mShortToast;
	private static Toast mLongToast;

	public static void showToast(Context context, String message) {
		if (mShortToast == null) {
			mShortToast = Toast.makeText(context.getApplicationContext(), message, Toast.LENGTH_SHORT);
		}
		mShortToast.setText(message);
		mShortToast.show();

	}

	public static void showToast(Context context,int strResId) {
		String text = context.getString(strResId);
		if (mShortToast == null) {
			mShortToast = Toast.makeText(context.getApplicationContext(), text, Toast.LENGTH_SHORT);
		}
		mShortToast.setText(text);
		mShortToast.show();

	}

	public static void showLongToast(Context context, String message) {
		if (mLongToast == null) {
			mLongToast = Toast.makeText(context.getApplicationContext(), message, Toast.LENGTH_LONG);
		}
		mLongToast.setText(message);
		mLongToast.show();
	}

	public static void showLongToast(Context context,int strResId) {
		String text = context.getString(strResId);
		if (mLongToast == null) {
			mLongToast = Toast.makeText(context.getApplicationContext(), text, Toast.LENGTH_LONG);
		}
		mLongToast.setText(text);
		mLongToast.show();
	}



    public static void showToast(Context context, String message,int gravity) {
        if (mShortToast == null) {
            mShortToast = Toast.makeText(context.getApplicationContext(), message, Toast.LENGTH_SHORT);
        }
        setGravity(mShortToast,gravity);
        mShortToast.setText(message);
        mShortToast.show();

    }

    public static void showToast(Context context,int strResId,int gravity) {
        String text = context.getString(strResId);
        if (mShortToast == null) {
            mShortToast = Toast.makeText(context.getApplicationContext(), text, Toast.LENGTH_SHORT);
        }
        setGravity(mShortToast,gravity);
        mShortToast.setText(text);
        mShortToast.show();

    }

    public static void showLongToast(Context context, String message,int gravity) {
        if (mLongToast == null) {
            mLongToast = Toast.makeText(context.getApplicationContext(), message, Toast.LENGTH_LONG);
        }
        setGravity(mLongToast,gravity);
        mLongToast.setText(message);
        mLongToast.show();
    }

    public static void showLongToast(Context context,int strResId,int gravity) {
        String text = context.getString(strResId);
        if (mLongToast == null) {
            mLongToast = Toast.makeText(context.getApplicationContext(), text, Toast.LENGTH_LONG);
        }

        setGravity(mLongToast,gravity);
        mLongToast.setText(text);
        mLongToast.show();
    }


    private static void setGravity(Toast toast,int gravity){
	    toast.setGravity(gravity,0,0);
    }
}
