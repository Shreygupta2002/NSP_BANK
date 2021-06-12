package nsp.bhu.in;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.List;

public class Admin_func3 extends AppCompatActivity {
    List<employee> employees4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_func3);
        Bundle bundle = getIntent().getExtras();
        employees4=bundle.getParcelableArrayList("data");

    }
    public void onClick4(View view)
    {
        String name=((EditText)(findViewById(R.id.editTextTextPersonName))).getText().toString();
        String id=((EditText)(findViewById(R.id.editTextTextPersonName2))).getText().toString();
        String desig=((EditText)(findViewById(R.id.editTextTextPersonName3))).getText().toString();
//        int age=Integer.parseInt(((EditText)(findViewById(R.id.editTextNumber))).getText().toString());
        employee temp=new employee(name,id,desig,50);
        employees4.add(temp);
        TextView editText=(TextView)(findViewById(R.id.textView9));
        editText.setText("SUCCESSFULLY ADDED!!!!");
    }
}