package ke.co.neverest.neverestarchitectureone.ui.job;

import android.app.Application;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.List;

import javax.inject.Inject;

import io.reactivex.Scheduler;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import ke.co.neverest.neverestarchitectureone.data.repositories.JobRepository;
import ke.co.neverest.neverestarchitectureone.models.Job;

public class JobsActivityViewModel  extends ViewModel {

    @Inject
    JobRepository jobRepository;

    CompositeDisposable compositeDisposable=new CompositeDisposable();


    /*
    Live data to support the user interface data provision
     */
    public MutableLiveData<List<Job>> jobs;

    /*
    TODO read about this later ***********
     */
    @Inject
    JobsActivityViewModel(){
        jobs = new MutableLiveData<>();
    }

    public MutableLiveData<List<Job>> getJobs(){

       Disposable disposable= jobRepository.getJobsOnline()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(results-> jobs.postValue(results),
                        error->{
                           /*
                           TODO Handle the error live data
                            */
                           Log.e("Error",error.getMessage());
                        }
                );

       compositeDisposable.add(disposable);

        return jobs;
    }









}
