package com.app.mvpdemo.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.app.mvpdemo.R;
import com.app.mvpdemo.presenter.MainFragmentPresenter;
import com.app.nucleus.factory.RequiresPresenter;
import com.app.nucleus.view.NucleusFragment;

/**
 * Created by admin on 2018/4/24.
 */

@RequiresPresenter(MainFragmentPresenter.class)
public class MainFragment extends NucleusFragment<MainFragmentPresenter>{

    private TextView mTextView;

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_main, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mTextView = view.findViewById(R.id.text_view);
    }

    public TextView getTextView() {
        return mTextView;
    }

    @Override
    public void onResume() {
        super.onResume();
    }

    @Override
    public void onPause() {
        super.onPause();
    }

    @Override
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }
}
