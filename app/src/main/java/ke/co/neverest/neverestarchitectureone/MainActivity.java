package ke.co.neverest.neverestarchitectureone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import javax.inject.Inject;
import javax.inject.Named;

import ke.co.neverest.neverestarchitectureone.ui.job.JobsActivityViewModel;

public class MainActivity extends AppCompatActivity {

    @Inject
    @Named("base_url") String alias;

    @Inject
    JobsActivityViewModel jobsActivityViewModel;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ((MyApplication)getApplicationContext()).getApplicationComponent().inject(this);
        Toast.makeText(this,alias,Toast.LENGTH_SHORT).show();

        jobsActivityViewModel.getJobs().observe(this,jobs->{
            Toast.makeText(getApplicationContext(),""+jobs.size(),Toast.LENGTH_SHORT).show();
        });
    }
}
