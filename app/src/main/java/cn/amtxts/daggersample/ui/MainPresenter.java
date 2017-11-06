package cn.amtxts.daggersample.ui;

import javax.inject.Inject;

/**
 * Created by geust on 2017/11/6.
 */

public class MainPresenter<V extends MainMvpView> implements MainMvpPresenter<V> {

    @Inject
    public MainPresenter(){

    }
}
