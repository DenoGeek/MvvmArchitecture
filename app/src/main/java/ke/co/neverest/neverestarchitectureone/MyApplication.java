package ke.co.neverest.neverestarchitectureone;

import android.app.Application;

import ke.co.neverest.neverestarchitectureone.di.ApplicationComponent;
import ke.co.neverest.neverestarchitectureone.di.ApplicationModule;
import ke.co.neverest.neverestarchitectureone.di.DaggerApplicationComponent;

public class MyApplication extends Application {

    ApplicationComponent applicationComponent;


    @Override
    public void onCreate() {
        super.onCreate();

        applicationComponent = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule())
                .build();


    }

    public ApplicationComponent getApplicationComponent(){
        return applicationComponent;
    }
}
