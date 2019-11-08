package ke.co.neverest.neverestarchitectureone.di;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

@Module(includes=NetworkModule.class)
public class ApplicationModule {

    @Provides
    @Named("alias")
    String applicationAlias(){
        return "Samle Dagger application";
    }
}
