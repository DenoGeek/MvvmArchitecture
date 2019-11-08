package ke.co.neverest.neverestarchitectureone.data.mappers;

import ke.co.neverest.neverestarchitectureone.data.JobApiResponse;
import ke.co.neverest.neverestarchitectureone.models.Job;

public class JobsMapper {

    public static Job transform(JobApiResponse response){
        return Job.newBuilder()
                .withDescription(response.getDescription())
                .withId(response.getId())
                .withLocation(response.getLocation())
                .withTitle(response.getTitle())
                .build();
    }
}
