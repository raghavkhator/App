package raghavkhator.com.tasksix;

import android.app.Activity;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.support.v4.app.FragmentManager;

public class MainActivity extends FragmentActivity {
    public Button button;

   // @Override
    //public FragmentManager getSupportFragmentManager() {
      //  return super.getSupportFragmentManager();
    //}

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=(Button)findViewById(R.id.button);
        FragmentTransaction fragmentTransaction= getSupportFragmentManager().beginTransaction();
        FragmentOne f1= new FragmentOne();
        fragmentTransaction.add(R.id.fragmentConatainer, f1).commit();
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //FragmentManager fragmentManager =getSupportFragmentManager();
                FragmentTransaction fragmentTransaction =getSupportFragmentManager().beginTransaction();
                FragmentTwo f2= new FragmentTwo();
                fragmentTransaction.replace(R.id.fragmentConatainer,f2);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
        }

        });
}
}
