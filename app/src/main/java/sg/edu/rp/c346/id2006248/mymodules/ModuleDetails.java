package sg.edu.rp.c346.id2006248.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ModuleDetails extends AppCompatActivity {

    TextView mCode, mName, year, semester, mCredit, venue;
    Button btnReturn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_details);

        mCode = findViewById(R.id.textView);
        mName = findViewById(R.id.textView2);
        year = findViewById(R.id.textView3);
        semester = findViewById(R.id.textView4);
        mCredit = findViewById(R.id.textView5);
        venue = findViewById(R.id.textView6);
        btnReturn = findViewById(R.id.buttonBack);

        Intent intentReceived = getIntent();
        String moduleNum = intentReceived.getStringExtra("Module");

        if(moduleNum.equals("C346")) {
            mCode.setText("Module Code: " + moduleNum);
            mName.setText("Module Name: Android Programming");
            year.setText("Year: 2020");
            semester.setText("Semester: 1");
            mCredit.setText("Module Credit: 4");
            venue.setText("Venue: E62E");
        }
        else if(moduleNum.equals("C328")){
            mCode.setText("Module Code: " + moduleNum);
            mName.setText("Module Name: Intelligent Networks");
            year.setText("Year: 2020");
            semester.setText("Semester: 1");
            mCredit.setText("Module Credit: 4");
            venue.setText("Venue: E62C");
        }
        else if(moduleNum.equals("C203")){
            mCode.setText("Module Code: " + moduleNum);
            mName.setText("Module Name: Web Development");
            year.setText("Year: 2020");
            semester.setText("Semester: 1");
            mCredit.setText("Module Credit: 4");
            venue.setText("Venue: W67L");
        }
        else if(moduleNum.equals("C228")){
            mCode.setText("Module Code: " + moduleNum);
            mName.setText("Module Name: Operating System Security");
            year.setText("Year: 2020");
            semester.setText("Semester: 1");
            mCredit.setText("Module Credit: 4");
            venue.setText("Venue: E62L");
        }
        else if(moduleNum.equals("C331")){
            mCode.setText("Module Code: " + moduleNum);
            mName.setText("Module Name: Digital Security and Forensics");
            year.setText("Year: 2020");
            semester.setText("Semester: 1");
            mCredit.setText("Module Credit: 4");
            venue.setText("Venue: E61J");
        }

        btnReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ModuleDetails.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}