package ke.co.neverest.neverestarchitectureone.data.api;

import java.util.List;

import io.reactivex.Single;
import ke.co.neverest.neverestarchitectureone.data.JobApiResponse;
import ke.co.neverest.neverestarchitectureone.models.Job;
import retrofit2.Call;
import retrofit2.http.GET;

public interface JobServices
{

    @GET("jobs")
    Single<List<JobApiResponse>> getAllJobs();
}
