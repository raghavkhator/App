package raghavkhator.com.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void task1(View view1){
        TextView tv= (TextView) findViewById(R.id.textview1);
        String tv1=tv.getText().toString();
       String s="Hello World" ;
       if(tv1.equals(s)){
           tv.setText(R.string.app_name2);
       }
       else
           tv.setText(R.string.app_name);
    }
}

