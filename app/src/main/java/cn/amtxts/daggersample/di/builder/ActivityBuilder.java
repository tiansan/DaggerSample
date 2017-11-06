package cn.amtxts.daggersample.di.builder;

import cn.amtxts.daggersample.ui.MainActivity;
import cn.amtxts.daggersample.ui.MainActivityModule;
import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * Created by geust on 2017/11/3.
 */
@Module
public abstract class ActivityBuilder {

    @ContributesAndroidInjector(modules = {MainActivityModule.class})
    abstract MainActivity bindMainActivity();
}
