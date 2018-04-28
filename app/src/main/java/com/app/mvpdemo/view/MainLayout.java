package com.app.mvpdemo.view;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import com.app.mvpdemo.R;
import com.app.mvpdemo.presenter.MainLayoutPresenter;
import com.app.nucleus.factory.RequiresPresenter;
import com.app.nucleus.view.NucleusLayout;

/**
 * Created by admin on 2018/4/25.
 */

@RequiresPresenter(MainLayoutPresenter.class)
public class MainLayout extends NucleusLayout<MainLayoutPresenter>{

    private TextView mTextView;

    public MainLayout(Context context) {
        this(context, null);
    }

    public MainLayout(Context context, AttributeSet attrs) {
        this(context, attrs, -1);
    }

    public MainLayout(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    protected void onAttachedToWindow() {
        View rootView = LayoutInflater.from(getContext()).inflate(R.layout.layout_item,this,false);
        addView(rootView);
        initViews(rootView);
        super.onAttachedToWindow();
    }

    public TextView getTextView() {
        return mTextView;
    }

    private void initViews(View rootView) {
        mTextView = rootView.findViewById(R.id.text_view);
    }
}
