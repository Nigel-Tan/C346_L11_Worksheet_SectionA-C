package sg.edu.rp.c346.id21023028.democustomcontactlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvContact;
    ArrayList<Contact> alContactList;
    CustomAdapter caContact;
    ImageView iv; //used to test if loading from internet works

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //link variable to UI
        lvContact = findViewById(R.id.listViewContacts);
        alContactList = new ArrayList<>();
        caContact = new CustomAdapter(this,R.layout.row, alContactList);
        iv = findViewById(R.id.imageView);

        //data setup
        Contact item1 = new Contact("Mary", 65, 65442334, 'F');
        alContactList.add(item1);

        Contact item2 = new Contact("Ken", 65, 97442437, 'M');
        alContactList.add(item2);

        //load image from internet
        String imageUrl = "https://i.imgur.com/tGbaZCY.jpg";
        Picasso.with(this).load(imageUrl).into(iv);




        //bind adapter with listview
        caContact.notifyDataSetChanged();
        lvContact.setAdapter(caContact);
    }
}