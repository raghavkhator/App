package raghavkhator.com.taskthree;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 =  (Button) findViewById(R.id.button2);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1= new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent1);

            }
        });


        Toast toast1=Toast.makeText(getApplicationContext(),"Application Started", Toast.LENGTH_SHORT);//.show();
       // toast1.setGravity(0,0,0);
         toast1.show();



    }




}
