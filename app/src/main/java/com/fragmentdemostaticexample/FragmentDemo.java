package com.fragmentdemostaticexample;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by shkumari on 8/5/18.
 */

public class FragmentDemo extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Log.e("FragmentDemo","onCreateView");
        return inflater.inflate(R.layout.fragment_demo,container,false);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.e("FragmentDemo","onAttach");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e("FragmentDemo","onCreate");
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.e("FragmentDemo","onActivityCreated");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.e("FragmentDemo","onStart");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.e("FragmentDemo","onResume");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.e("FragmentDemo","onPause");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.e("FragmentDemo","onStop");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.e("FragmentDemo","onDestroyview");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.e("FragmentDemo","onDestroy");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.e("FragmentDemo","onDetach");
    }
}
