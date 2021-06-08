package nsp.bhu.in;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    public void onClick1(View view)
    {
        Intent intent = new Intent(this,Admin.class);
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("data", (ArrayList<? extends Parcelable>) employees);
//        intent.putExtra("EMPLOYEE", (Serializable) employees);
        intent.putExtras(bundle);
        startActivity(intent);
    }
    List<employee> employees = new ArrayList<employee>();
    List<people> peoples = new ArrayList<people>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        List<employee> employees = new ArrayList<employee>();
        employee e1 = new employee("XYZ", "1", "Receptionist", 23);
        employee e2 = new employee("ABC", "2", "Manager", 30);
        employee e3 = new employee("SHREY", "3", "CEO", 18);
        employee e4 = new employee("PARAS", "4", "DIRECTOR", 18);
        employee e5 = new employee("NIKHIL", "5", "CTO", 18);
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);
        employees.add(e5);
        // people peoples[] = new people[100];
//        List<people> peoples = new ArrayList<people>();
        people p1 = new people("ANSHUL", 1000.0);
        people p2 = new people("NIKHIL GARG", 100.0);
        people p3 = new people("RITESH", 15000);
        people p4 = new people("SHRADDHA", 13499.29);
        people p5 = new people("PARAS", 12356.43);
        peoples.add(p1);
        peoples.add(p2);
        peoples.add(p3);
        peoples.add(p4);
        peoples.add(p5);
    }
}