package ke.co.neverest.neverestarchitectureone.data.repositories;

import android.telecom.Call;

import java.util.List;

import io.reactivex.Flowable;
import io.reactivex.Single;
import ke.co.neverest.neverestarchitectureone.data.api.JobServices;
import ke.co.neverest.neverestarchitectureone.data.mappers.JobsMapper;
import ke.co.neverest.neverestarchitectureone.models.Job;

public class JobRepository {


    private JobServices jobServices;

    public JobRepository(JobServices jobServices) {
        this.jobServices = jobServices;
    }

    public Single<List<Job>> getJobsOnline(){

        return jobServices.getAllJobs()
                .flatMapPublisher(Flowable::fromIterable)
                .map(JobsMapper::transform)
                .toList();


    }
}
