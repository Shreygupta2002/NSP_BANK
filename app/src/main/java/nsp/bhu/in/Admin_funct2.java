package nsp.bhu.in;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.List;

public class Admin_funct2 extends AppCompatActivity {
    List<people> peoples3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_funct2);
        Bundle bundle = getIntent().getExtras();
        peoples3=bundle.getParcelableArrayList("data");
//        employees = (List<employee>) getIntent().getSerializableExtra("Employee");
        TextView textView=(TextView)(findViewById(R.id.textView5));
        String s="DETAILS OF ALL ACCOUNTS"+"\n"+"\n";
        for (int i = 0; i < peoples3.size(); i++) {
            s=s.concat(peoples3.get(i).view_details());
            s=s.concat("----- \n");
            s=s.concat("----- \n");
        }
        textView.setText(s);
    }
}