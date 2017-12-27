package raghavkhator.com.taskfive;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button startButton = (Button) findViewById(R.id.button);
        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText et1= (EditText) findViewById(R.id.editText);
                String userName= et1.getText().toString();
                Intent intent1= new Intent(MainActivity.this, quesOne.class), intent2=new Intent(MainActivity.this,ResultAct.class);


                startActivity(intent1);
                finish();
            }
        });
    }


}

