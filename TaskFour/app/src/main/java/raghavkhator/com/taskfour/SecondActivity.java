package raghavkhator.com.taskfour;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent intent = getIntent();
        String MovieName = intent.getStringExtra("MovieName"), Genre = intent.getStringExtra("Genre");
        TextView tv1 = (TextView) findViewById(R.id.textView2);
        //if(!MovieName.isEmpty() || !Genre.isEmpty())
        //{

            tv1.setText("Name of the Movie is " + MovieName + ",\nwhich has a Genre- " + Genre);

        //}
        /*else
        {
            tv1.setTextColor(getResources().getColor(R.color.Red));
            tv1.setText("PLEASE ENTER A VALID INPUT");
        }*/
    }
}
