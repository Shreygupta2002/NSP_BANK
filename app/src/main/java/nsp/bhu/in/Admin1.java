package nsp.bhu.in;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Admin1 extends AppCompatActivity {
    public void onClick(View view)
    {
        Intent intent = new Intent(this,Admin_funct1.class);
//        intent.putExtra("EMPLOYEE", (Serializable) employees);
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("data", (ArrayList<? extends Parcelable>) employees2);
//        bundle.putParcelableArrayList("data1", (ArrayList<? extends Parcelable>) peoples2);
        intent.putExtras(bundle);
        startActivity(intent);
    }
    public void onClick1(View view)
    {
        Intent intent = new Intent(this,Admin_funct2.class);
//        intent.putExtra("EMPLOYEE", (Serializable) employees);
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("data", (ArrayList<? extends Parcelable>) peoples2);
//        bundle.putParcelableArrayList("data1", (ArrayList<? extends Parcelable>) peoples2);
        intent.putExtras(bundle);
        startActivity(intent);
    }
    List<employee> employees2;
    List<employee> peoples2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin2);
        Intent intent =getIntent();
        Bundle bundle = getIntent().getExtras();
        employees2=bundle.getParcelableArrayList("data");
        peoples2=bundle.getParcelableArrayList("data1");
//        employees= (List<employee>) getIntent().getSerializableExtra("Employee");
    }
}