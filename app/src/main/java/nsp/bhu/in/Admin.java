package nsp.bhu.in;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.io.Serializable;
import java.net.PasswordAuthentication;
import java.util.ArrayList;
import java.util.List;

public class Admin extends AppCompatActivity {
    public void onClick(View view)
    {
        String pass="123456789";
        EditText editText=(EditText)(findViewById(R.id.pass));
        String password=editText.getText().toString();
        if(password.equals(pass))
        {
            TextView textView=(TextView)(findViewById(R.id.textView3));
            textView.setText("CORRECT PASSWORD");
            Intent intent = new Intent(this,Admin1.class);
//            intent.putExtra("EMPLOYEE", (Serializable) employees);
            Bundle bundle = new Bundle();
            bundle.putParcelableArrayList("data", (ArrayList<? extends Parcelable>) employees1);
            intent.putExtras(bundle);
            startActivity(intent);
        }
        else
        {
            TextView textView=(TextView)(findViewById(R.id.textView3));
            textView.setText("INVALID PASSWORD");
        }
    }
//    Intent intent =getIntent();
    List <employee> employees1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin);
        Intent intent =getIntent();
        Bundle bundle = getIntent().getExtras();
        employees1=bundle.getParcelableArrayList("data");
//        employees = (List<employee>) getIntent().getSerializableExtra("Employee");
    }
}