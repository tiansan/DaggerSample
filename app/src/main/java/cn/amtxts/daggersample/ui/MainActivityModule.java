package cn.amtxts.daggersample.ui;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

/**
 * Created by geust on 2017/11/3.
 */
@Module
public abstract class MainActivityModule {

    @Binds
    abstract MainMvpView mainView(MainActivity act);

    @Provides
    MainMvpPresenter<MainMvpView> providesMainMvpPresenter(MainPresenter<MainMvpView> presenter){
        return presenter;
    }

}
