package ke.co.neverest.neverestarchitectureone.di;


import dagger.Component;
import ke.co.neverest.neverestarchitectureone.MainActivity;

@Component(modules = {ApplicationModule.class})
public interface ApplicationComponent {


    void inject(MainActivity mainActivity);



}
