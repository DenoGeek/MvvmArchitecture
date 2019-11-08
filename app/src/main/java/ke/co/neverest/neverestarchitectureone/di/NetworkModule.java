package ke.co.neverest.neverestarchitectureone.di;

import com.google.gson.Gson;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;
import ke.co.neverest.neverestarchitectureone.BuildConfig;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

@Module(includes = ApiModule.class)
public class NetworkModule {

    @Provides
    @Named("base_url")
    String baseUrl(){
        return "https://radah.co.ke/api/";
    }


    @Provides
    Gson gson(){
        return new Gson();
    }

    @Provides
    Retrofit retrofit(Gson gson,@Named("base_url") String base_url,OkHttpClient okHttpClient){
        return new Retrofit.Builder()
                .baseUrl(base_url)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .client(okHttpClient)
                .build();
    }

    @Provides
    OkHttpClient okHttpClient(){
        return new OkHttpClient.Builder().build();
    }



}
