package raghavkhator.com.taskfive;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class quesOne extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ques_one);
        final RadioButton rb1= (RadioButton) findViewById(R.id.radioButton);
        final RadioButton rb2= (RadioButton) findViewById(R.id.radioButton2);
        final RadioButton rb3= (RadioButton) findViewById(R.id.radioButton3);
        final RadioButton rb4= (RadioButton) findViewById(R.id.radioButton4);


        Button nextButton=(Button)findViewById(R.id.button2), finishButton=(Button)findViewById(R.id.button3);
        final int[] ques1 = {0};
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(rb3.isChecked())
                    ques1[0] =1;
                Intent intentq1= new Intent(quesOne.this, quesTwo.class);
                intentq1.putExtra("cor", ques1);
                startActivity(intentq1);
                finish();
            }
        });
        finishButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(rb3.isChecked())
                    ques1[0]++;
                Intent intentfinish1= new Intent(getApplicationContext(), ResultAct.class);
                intentfinish1.putExtra("finish", ques1);
                startActivity(intentfinish1);
                finish();
            }
        });



    }


}
