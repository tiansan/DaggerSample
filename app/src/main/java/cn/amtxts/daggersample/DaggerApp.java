package cn.amtxts.daggersample;

import cn.amtxts.daggersample.di.component.DaggerAppComponent;
import dagger.android.AndroidInjector;
import dagger.android.DaggerApplication;

/**
 * Created by geust on 2017/11/3.
 */

public class DaggerApp extends DaggerApplication{


    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Override
    protected AndroidInjector<DaggerApp> applicationInjector() {
        return DaggerAppComponent.builder().create(this);
    }

}
