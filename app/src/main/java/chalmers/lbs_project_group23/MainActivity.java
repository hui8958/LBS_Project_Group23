package chalmers.lbs_project_group23;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button b1,b2,b3,b4,b5;
    private TextView t1,t2;
    private EditText c1,c2;
    public float result=0;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = (Button)findViewById(R.id.b1);
        b2 = (Button)findViewById(R.id.b2);
        b3 = (Button)findViewById(R.id.b3);
        b4 = (Button)findViewById(R.id.b4);
        b5 = (Button)findViewById(R.id.b5);

        c1 = (EditText)findViewById(R.id.c2);
        c2 = (EditText)findViewById(R.id.c1);
        t1 = (TextView)findViewById(R.id.t1);
        t2 = (TextView)findViewById(R.id.t2);

        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);

    }
    public void onClick(View v){
        if(c1.getText().toString().equals("")||c1.getText().toString()==null
                ||c2.getText().toString().equals("")||c2.getText().toString()==null){
            Toast.makeText(this,"Please fill in a number first!",Toast.LENGTH_SHORT).show();

        }else {
            switch (v.getId()) {
                case R.id.b1:
                    t1.setText("+");
                    result = Float.parseFloat(c1.getText().toString()) + Float.parseFloat(c2.getText().toString());
                    break;
                case R.id.b2:
                    t1.setText("-");
                    result = Float.parseFloat(c1.getText().toString()) - Float.parseFloat(c2.getText().toString());
                    break;
                case R.id.b3:
                    t1.setText("*");
                    result = Float.parseFloat(c1.getText().toString()) * Float.parseFloat(c2.getText().toString());
                    break;
                case R.id.b4:
                    t1.setText("/");
                    result = Float.parseFloat(c1.getText().toString()) / Float.parseFloat(c2.getText().toString());
                    break;
                case R.id.b5:
                    t2.setText(Float.toString(result));
                    break;
            }
        }
    }
}
