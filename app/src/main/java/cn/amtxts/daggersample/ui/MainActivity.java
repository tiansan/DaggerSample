package cn.amtxts.daggersample.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import javax.inject.Inject;

import cn.amtxts.daggersample.R;
import dagger.android.AndroidInjection;

public class MainActivity extends AppCompatActivity implements MainMvpView{

    @Inject
    MainMvpPresenter<MainMvpView> mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AndroidInjection.inject(this);
        setContentView(R.layout.activity_main);
    }

}
