package raghavkhator.com.taskfive;

import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static java.lang.System.exit;

public class ResultAct extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        Intent intent=getIntent();

        TextView tv1=(TextView)findViewById(R.id.textView5);
        tv1.setText("Congratulations ");

        int[] score= intent.getIntArrayExtra("finish");
        Toast.makeText(getApplicationContext(),"Current Score: "+score[0],Toast.LENGTH_LONG).show();
        TextView tv2=(TextView) findViewById(R.id.textView6);
        tv2.setText("Your final Score is "+score[0]);
        if(score[0]!=3)
            Snackbar.make(findViewById(R.id.layOut),"Better Luck Next Time",Snackbar.LENGTH_SHORT).show();
        else
            Snackbar.make(findViewById(R.id.layOut),"You have a Perfect Score", Snackbar.LENGTH_LONG).show();

        Button b1=(Button)findViewById(R.id.button5), b2=(Button)findViewById(R.id.button6);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentRe= new Intent(ResultAct.this,MainActivity.class);
                startActivity(intentRe);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.exit(0);
            }
        });


    }
}
