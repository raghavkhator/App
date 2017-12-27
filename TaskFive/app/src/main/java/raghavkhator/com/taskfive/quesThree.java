package raghavkhator.com.taskfive;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class quesThree extends AppCompatActivity {

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ques_three);
        final RadioButton rb1 = (RadioButton) findViewById(R.id.radioButton5);
        final RadioButton rb2 = (RadioButton) findViewById(R.id.radioButton6);
        final RadioButton rb3 = (RadioButton) findViewById(R.id.radioButton7);
        final RadioButton rb4 = (RadioButton) findViewById(R.id.radioButton8);

        Intent intent= getIntent();
        final int[] cor=intent.getIntArrayExtra("cor");
        Toast.makeText(getApplicationContext(),"Current Score: "+cor[0],Toast.LENGTH_LONG).show();
        Button buttonFinish= (Button)findViewById(R.id.button4);
        buttonFinish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(rb2.isChecked())
                    cor[0]++;
                Intent intentfinal= new Intent(quesThree.this, ResultAct.class);
                intentfinal.putExtra("finish",cor);
                startActivity(intentfinal);
                finish();

            }
        });
    }
}
