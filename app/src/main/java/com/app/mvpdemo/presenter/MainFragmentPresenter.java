package com.app.mvpdemo.presenter;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.app.mvpdemo.view.MainFragment;
import com.app.nucleus.presenter.Presenter;

/**
 * Created by admin on 2018/4/24.
 */

public class MainFragmentPresenter extends Presenter<MainFragment>{

    @Override
    protected void onCreate(@Nullable Bundle savedState) {
        super.onCreate(savedState);
    }

    @Override
    protected void onTakeView(MainFragment mainFragment) {
        super.onTakeView(mainFragment);
        getView().getTextView().setText("Hello NucleusFragment");
    }

    @Override
    protected void onDropView() {
        super.onDropView();
    }

    @Override
    protected void onSave(Bundle state) {
        super.onSave(state);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
