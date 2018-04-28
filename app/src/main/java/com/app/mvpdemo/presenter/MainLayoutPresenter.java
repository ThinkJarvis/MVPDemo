package com.app.mvpdemo.presenter;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.app.mvpdemo.view.MainLayout;
import com.app.nucleus.presenter.Presenter;

/**
 * Created by admin on 2018/4/25.
 */

public class MainLayoutPresenter extends Presenter<MainLayout>{

    @Override
    protected void onCreate(@Nullable Bundle savedState) {
        super.onCreate(savedState);
    }


    @Override
    protected void onTakeView(MainLayout mainLayout) {
        super.onTakeView(mainLayout);
        getView().getTextView().setText("Hello NucleusLayout");
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
