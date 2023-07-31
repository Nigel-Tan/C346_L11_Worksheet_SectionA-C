package sg.edu.rp.c346.id21023028.democustomcontactlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvContact;
    ArrayList<Contact> alContactList;
    CustomAdapter caContact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //link variable to UI
        lvContact = findViewById(R.id.listViewContacts);
        alContactList = new ArrayList<>();
        caContact = new CustomAdapter(this,R.layout.row, alContactList);

        //data setup
        Contact item1 = new Contact("Mary", 65, 1234567, 'F');
        Contact item2 = new Contact("Ken", 65, 7654321, 'M');
        alContactList.add(item1);
        alContactList.add(item2);


        //bind adapter with listview
        caContact.notifyDataSetChanged();
        lvContact.setAdapter(caContact);
    }
}