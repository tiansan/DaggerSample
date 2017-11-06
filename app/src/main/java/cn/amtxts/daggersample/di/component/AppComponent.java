package cn.amtxts.daggersample.di.component;

import javax.inject.Singleton;

import cn.amtxts.daggersample.DaggerApp;
import cn.amtxts.daggersample.di.builder.ActivityBuilder;
import cn.amtxts.daggersample.di.module.AppModule;
import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;

/**
 * Created by geust on 2017/11/3.
 */
@Singleton
@Component(modules = {
        AndroidSupportInjectionModule.class,
        AppModule.class,
        ActivityBuilder.class})
public interface AppComponent extends AndroidInjector<DaggerApp>{

    @Component.Builder
    abstract class Builder extends AndroidInjector.Builder<DaggerApp>{

    }

}
