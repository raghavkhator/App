package raghavkhator.com.taskfour;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b1= (Button) findViewById(R.id.button1);
        Button b2=(Button) findViewById(R.id.button2);
        final EditText et1= (EditText) findViewById(R.id.editText1);
        final EditText et2= (EditText) findViewById(R.id.editText2);
        b1.setOnClickListener(this);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                et1.setText(null);
                et2.setText(null);

            }
        });

    }

    @Override
    public void onClick(View v) {
        EditText et1= (EditText) findViewById(R.id.editText1);
        EditText et2= (EditText) findViewById(R.id.editText2);
        String MovieName=et1.getText().toString(), Genre=et2.getText().toString();
        Intent intent1= new Intent(MainActivity.this, SecondActivity.class);
        intent1.putExtra("MovieName",MovieName);
        intent1.putExtra("Genre",Genre);
        if(!MovieName.isEmpty()||!Genre.isEmpty())
        {startActivity(intent1);}
        else
        {
            Toast.makeText(getApplicationContext(),"Enter a Valid Input",Toast.LENGTH_SHORT).show();
        }

        /*switch(v.getId()){
            case R.id.button1:
                break;
            case R.id.button2:
        }*/
    }

}
