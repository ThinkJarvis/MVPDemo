package com.app.nucleus.factory;


import com.app.nucleus.presenter.Presenter;

public interface PresenterFactory<P extends Presenter> {
    P createPresenter();
}
