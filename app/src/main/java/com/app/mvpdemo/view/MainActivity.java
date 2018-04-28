package com.app.mvpdemo.view;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.text.Layout;
import android.util.Log;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;

import com.app.mvpdemo.R;
import com.app.mvpdemo.presenter.MainActivityPresenter;
import com.app.nucleus.factory.RequiresPresenter;
import com.app.nucleus.view.NucleusActivity;


@RequiresPresenter(MainActivityPresenter.class)
public class MainActivity extends NucleusActivity<MainActivityPresenter> {

    private Button mOpenFragment;
    private Button mOpenView;
    private FrameLayout mContent;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.e("nucleus","MainActivity --> onCreate");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }

    private void initViews() {
        mOpenFragment = findViewById(R.id.open_fragment);
        mOpenView = findViewById(R.id.open_view);
        mContent = findViewById(R.id.content_panel);
    }

    public Button getOpenFragment() {
        return mOpenFragment;
    }

    public Button getOpenView() {
        return mOpenView;
    }

    public FrameLayout getContent() {
        return mContent;
    }




    @Override
    protected void onResume() {
        Log.e("nucleus","MainActivity --> onResume");
        super.onResume();
    }

    @Override
    protected void onPause() {
        Log.e("nucleus","MainActivity --> onPause");
        super.onPause();
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        Log.e("nucleus","MainActivity --> onSaveInstanceState");
        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onDestroy() {
        Log.e("nucleus","MainActivity --> onDestroy");
        super.onDestroy();
    }
}
