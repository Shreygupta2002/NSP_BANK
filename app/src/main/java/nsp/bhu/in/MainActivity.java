package nsp.bhu.in;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
public class MainActivity extends AppCompatActivity {

    public void onClick1(View view)
    {
        setContentView(R.layout.admin);
    }
    public void onClick2(View view)
    {
        String pass="123456789";
        EditText editText=(EditText)(findViewById(R.id.pass));
        String password=editText.getText().toString();
        TextView textView=(TextView)(findViewById(R.id.textView3));
        if(password.equals(pass))
        {
            textView.setText("CORRECT PASSWORD");
//            Intent intent = new Intent(this,Admin1.class);
////            intent.putExtra("EMPLOYEE", (Serializable) employees);
//            Bundle bundle = new Bundle();
//            bundle.putParcelableArrayList("data", (ArrayList<? extends Parcelable>) employees1);
//            bundle.putParcelableArrayList("data1", (ArrayList<? extends Parcelable>) peoples1);
//            intent.putExtras(bundle);
//            startActivity(intent);
            setContentView(R.layout.admin_1);
        }
        else
        {
            textView.setText("INVALID PASSWORD");
        }
    }
    public void onClick3(View view)
    {
        setContentView(R.layout.admin_2);
        TextView textView=(TextView)(findViewById(R.id.text1));
        String s="DETAILS OF EMPLOYEES"+"\n"+"\n";
        for (int i = 0; i < employees.size(); i++) {
            s=s.concat(employees.get(i).display_details());
            s=s.concat("----- \n");
            s=s.concat("----- \n");
        }
        textView.setText(s);
    }
    public void onClick4(View view)
    {
        setContentView(R.layout.admin_1);
    }
    public void onClick5(View view)
    {
        setContentView(R.layout.admin_3);
        TextView textView=(TextView)(findViewById(R.id.textView5));
        String s="DETAILS OF ALL ACCOUNTS"+"\n"+"\n";
        for (int i = 0; i < peoples.size(); i++) {
            s=s.concat(peoples.get(i).view_details());
            s=s.concat("----- \n");
            s=s.concat("----- \n");
        }
        textView.setText(s);
    }
    public void onClick6(View view)
    {
        setContentView(R.layout.admin_4);
    }
    public void onClick7(View view)
    {
        String name=((EditText)(findViewById(R.id.editTextTextPersonName))).getText().toString();
        String id=((EditText)(findViewById(R.id.editTextTextPersonName2))).getText().toString();
        String desig=((EditText)(findViewById(R.id.editTextTextPersonName3))).getText().toString();
        int age=Integer.parseInt(((EditText)(findViewById(R.id.editTextNumber))).getText().toString());
        employee temp=new employee(name,id,desig,age);
        employees.add(temp);
        TextView editText=(TextView)(findViewById(R.id.textView9));
        editText.setText("SUCCESSFULLY ADDED!!!!");
//        setContentView(R.layout.admin_1);
    }
    public void onClick8(View view)
    {
        setContentView(R.layout.activity_main);
    }
    public void onClick9(View view)
    {
        EditText editText=(EditText)(findViewById(R.id.enter_id));
        String Temp=editText.getText().toString();
        int pos=-1;
        for (int i = 0; i < employees.size(); i++) {
            if ((employees.get(i).getEmployeeId()).equals(Temp)) {
                pos = i;
                break;
            }
        }
        TextView textView=(TextView) (findViewById(R.id.textView11));
        if(pos==-1)
        {
            textView.setText("INVALID ID");
        }
        else
        {
            emppos=pos;
            textView.setText("ID FOUND!!!");
            setContentView(R.layout.employee2);

        }
    }
    public void onClick10(View view)
    {
        setContentView(R.layout.employee1);
    }
    public void onClick11(View view)
    {
        setContentView(R.layout.employee4);
    }
    public void onClick12(View view)
    {
        String name=((EditText)(findViewById(R.id.editTextTextPersonName4))).getText().toString();
        double balance=Double.parseDouble(((EditText)(findViewById(R.id.editTextTextPersonName5))).getText().toString());
        people p=new people(name,balance);
        peoples.add(p);
        TextView editText=(TextView)(findViewById(R.id.textView15));
        editText.setText("SUCCESSFULLY ADDED!!!!");
    }
    public void onClick13(View view)
    {
        setContentView(R.layout.employee2);
    }

    public void onClick14(View view) {
        setContentView(R.layout.employee3);
        TextView textView=(TextView) (findViewById(R.id.textView14));
        textView.setText(employees.get(emppos).display_details());
    }

    public void onClick15(View view) {
        setContentView(R.layout.employee2);
    }

    List<employee> employees = new ArrayList<employee>();
    List<people> peoples = new ArrayList<people>();


    int emppos;
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