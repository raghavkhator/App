package raghavkhator.com.taskthree;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SecondActivity extends AppCompatActivity{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Snackbar snackbar = Snackbar
                .make(findViewById(R.id.itsConsLayout), "Second Activity", Snackbar.LENGTH_LONG);

        snackbar.show();

    }


}
