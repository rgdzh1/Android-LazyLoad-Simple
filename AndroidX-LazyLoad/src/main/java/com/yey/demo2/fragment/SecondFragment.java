package com.yey.demo2.fragment;

import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class SecondFragment extends Fragment {
    private static final String TAG = SecondFragment.class.getName();
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "onCreate: 第2个Fragment");
    }
    @Override
    public void onStart() {
        super.onStart();
        Log.d(TAG, "onStart: 第2个Fragment");
    }
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        TextView textView = new TextView(container.getContext());
        textView.setText("第二个Fragment");
        Log.d(TAG, "onCreateView: 第2个Fragment");
        textView.setGravity(Gravity.CENTER);
        ViewGroup.LayoutParams layoutParams = container.getLayoutParams();
        layoutParams.height = ViewGroup.LayoutParams.MATCH_PARENT;
        layoutParams.width = ViewGroup.LayoutParams.MATCH_PARENT;
        textView.setLayoutParams(layoutParams);
        return textView;
    }


    boolean isFirstLoad = true;

    @Override
    public void onResume() {
        super.onResume();
        Log.d(TAG, "onResume: 第2个Fragment");
        if (isFirstLoad){
            isFirstLoad = !isFirstLoad;
            Log.d(TAG, "第2个Fragment懒加载");
        }
    }
    @Override
    public void onPause() {
        super.onPause();
        Log.d(TAG, "onPause: 第2个Fragment");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d(TAG, "onStop: 第2个Fragment");
    }
}
