package com.app.mvpdemo.presenter;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;

import com.app.mvpdemo.FragmentStack;
import com.app.mvpdemo.view.MainActivity;
import com.app.mvpdemo.R;
import com.app.mvpdemo.view.MainFragment;
import com.app.mvpdemo.view.MainLayout;
import com.app.nucleus.presenter.Presenter;


/**
 * Created by admin on 2018/4/17.
 */

public class MainActivityPresenter extends Presenter<MainActivity> implements View.OnClickListener{

    private FragmentStack mFragmentStack;

    @Override
    protected void onCreate(@Nullable Bundle savedState) {
        super.onCreate(savedState);
        Log.e("nucleus","MainActivityPresenter --> onCreate");
    }


    @Override
    protected void onTakeView(MainActivity mainActivity) {
        super.onTakeView(mainActivity);
        mFragmentStack = new FragmentStack(getView(), getView().getFragmentManager(), R.id.content_panel);
        Log.e("nucleus","MainActivityPresenter --> onTakeView");
        getView().getOpenFragment().setOnClickListener(this);
        getView().getOpenView().setOnClickListener(this);

    }

    private void openFragment() {
        mFragmentStack.push(new MainFragment());
    }

    private void removeFragment() {
        mFragmentStack.remove();
    }

    private void openLayout() {
        ViewGroup.LayoutParams layoutParams = getView().getContent().getLayoutParams();
        layoutParams.width = ViewGroup.LayoutParams.MATCH_PARENT;
        layoutParams.height = ViewGroup.LayoutParams.MATCH_PARENT;
        MainLayout mainLayout = new MainLayout(getView());
        getView().getContent().addView(mainLayout, layoutParams);
    }

    private void removeLayout() {
        getView().getContent().removeAllViews();
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.open_fragment:
                removeLayout();
                openFragment();
                break;
            case R.id.open_view:
                removeFragment();
                openLayout();
                break;
            default:
                break;
        }
    }

    @Override
    protected void onDropView() {
        super.onDropView();
        Log.e("nucleus","MainActivityPresenter --> onDropView");
    }

    @Override
    protected void onSave(Bundle state) {
        super.onSave(state);
        Log.e("nucleus","MainActivityPresenter --> onSave");
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("nucleus","MainActivityPresenter --> onDestroy");
    }
}
