package nsp.bhu.in;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.util.List;

public class Admin_funct1 extends AppCompatActivity {
    List<employee> employees3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_funct1);
//        Intent intent=getIntent();
        Bundle bundle = getIntent().getExtras();
        employees3=bundle.getParcelableArrayList("data");
//        employees = (List<employee>) getIntent().getSerializableExtra("Employee");
        TextView textView=(TextView)(findViewById(R.id.text1));
        String s="DETAILS OF EMPLOYEES"+"\n"+"\n";
        for (int i = 0; i < employees3.size(); i++) {
            s=s.concat(employees3.get(i).display_details());
            s=s.concat("----- \n");
            s=s.concat("----- \n");
        }
        textView.setText(s);
    }
}