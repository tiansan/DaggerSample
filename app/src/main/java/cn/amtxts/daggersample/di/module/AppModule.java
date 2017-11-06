package cn.amtxts.daggersample.di.module;

import android.app.Application;
import android.content.Context;

import javax.inject.Singleton;

import cn.amtxts.daggersample.di.PreferenceInfo;
import cn.amtxts.daggersample.utils.AppConstants;
import dagger.Module;
import dagger.Provides;

/**
 * Created by geust on 2017/11/3.
 */
@Module
public class AppModule {

    @Provides
    @Singleton
    Context provideContext(Application application){
        return application;
    }

    @Provides
    @PreferenceInfo
    String providePreferenceName(){
        return AppConstants.PREF_NAME;
    }

}
