package ke.co.neverest.neverestarchitectureone.di;

import dagger.Module;
import dagger.Provides;
import ke.co.neverest.neverestarchitectureone.data.api.JobServices;
import ke.co.neverest.neverestarchitectureone.data.repositories.JobRepository;
import retrofit2.Retrofit;

@Module
public class ApiModule {

    @Provides
    public JobServices provideJobService(Retrofit retrofit){
        return retrofit.create(JobServices.class);
    }


    /*
    Repositories DI
     */
    @Provides
    public JobRepository provideJobRepository(JobServices jobServices){
        return new JobRepository(jobServices);
    }
}
