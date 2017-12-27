package raghavkhator.com.taskfive;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class quesTwo extends AppCompatActivity {

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ques_two);
        final RadioButton rb1 = (RadioButton) findViewById(R.id.radioButton13);
        final RadioButton rb2 = (RadioButton) findViewById(R.id.radioButton14);
        final RadioButton rb3 = (RadioButton) findViewById(R.id.radioButton15);
        final RadioButton rb4 = (RadioButton) findViewById(R.id.radioButton16);
        Intent intentques2 = getIntent();
        final int[] cor = intentques2.getIntArrayExtra("cor");
        Button buttonNext = (Button) findViewById(R.id.button8);
        buttonNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (rb2.isChecked())
                    cor[0]++;
                Intent intent1 = new Intent(quesTwo.this, quesThree.class);
                intent1.putExtra("cor", cor);
                startActivity(intent1);
                finish();
            }
        });

        Toast.makeText(getApplicationContext(),"Current Score: "+cor[0],Toast.LENGTH_LONG).show();

        Button buttonFinish = (Button) findViewById(R.id.button9);
        buttonFinish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (rb2.isChecked())
                    cor[0]++;
                Intent intentfinish2 = new Intent(quesTwo.this, ResultAct.class);
                intentfinish2.putExtra("finish", cor);
                startActivity(intentfinish2);
                finish();
            }
        });


    }
}

