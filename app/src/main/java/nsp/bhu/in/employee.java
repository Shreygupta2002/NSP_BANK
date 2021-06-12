package nsp.bhu.in;

import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class employee implements Parcelable {
    private String name;
    private String id;
    private String designation;
    private int age;

    public employee(String name, String id, String designation, int age) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        this.age = age;
    }

    protected employee(Parcel in) {
        name = in.readString();
        id = in.readString();
        designation = in.readString();
        age = in.readInt();
    }

    public static final Creator<employee> CREATOR = new Creator<employee>() {
        @Override
        public employee createFromParcel(Parcel in) {
            return new employee(in);
        }

        @Override
        public employee[] newArray(int size) {
            return new employee[size];
        }
    };

    public String display_details() {
        String ans="NAME : " + String.valueOf(this.name)+"\n"+"ID : " +String.valueOf(this.id)+"\n"
                +"DESIGNATION : " +String.valueOf(this.designation)+"\n" +"AGE : " +String.valueOf(this.age)+"\n";
//        System.out.println("NAME : " + this.name);
//        System.out.println("ID : " + this.id);
//        System.out.println("DESIGNATION : " + this.designation);
//        System.out.println("AGE : " + this.age);
//        System.out.println("");
        return ans;
    }



    public String getEmployeeId() {
        return this.id;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(id);
        dest.writeString(designation);
        dest.writeInt(age);
    }
}
