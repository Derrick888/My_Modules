package sg.edu.rp.c346.id22011505.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ModuleDetailActivity extends AppCompatActivity {
    TextView tvModuleCode;
    TextView tvModuleName;
    TextView tvYear;
    TextView tvSemester;
    TextView tvCredit;
    TextView tvVenue;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_detail);

        tvModuleCode = findViewById(R.id.moduleCode);
        tvModuleName = findViewById(R.id.moduleName);
        tvYear =  findViewById(R.id.academicYear);
        tvSemester = findViewById(R.id.semester);
        tvCredit = findViewById(R.id.moduleCredit);
        tvVenue = findViewById(R.id.venue);

        Intent intentReceived = getIntent();
        String moduleCode = intentReceived.getStringExtra("ModuleCode");

        if (moduleCode.equals("C346") ) {
            tvModuleCode.setText(String.format("Module Code: %s", moduleCode));
            tvModuleName.setText("Module Name: Android Programming");
            tvYear.setText("Academic Year: 2023");
            tvSemester.setText("Semester: 1");
            tvCredit.setText("Module Credit: 4");
            tvVenue.setText("Venue: E63A");
        } else if (moduleCode.equals("C206")) {
            tvModuleCode.setText(String.format("Module Code: %s", moduleCode));
            tvModuleName.setText("Module Name: Software Development Process");
            tvYear.setText("Academic Year: 2023");
            tvSemester.setText("Semester: 1");
            tvCredit.setText("Module Credit: 4");
            tvVenue.setText("Venue: W65C");
        } else if(moduleCode.equals("C203")) {
            tvModuleCode.setText(String.format("Module Code: %s", moduleCode));
            tvModuleName.setText("Module Name: Web Appln Development in php");
            tvYear.setText("Academic Year: 2023");
            tvSemester.setText("Semester: 1");
            tvCredit.setText("Module Credit: 4");
            tvVenue.setText("Venue: W65P");
        } else if (moduleCode.equals("C218")) {
            tvModuleCode.setText(String.format("Module Code: %s", moduleCode));
            tvModuleName.setText("Module Name: UI/UX Design for Apps");
            tvYear.setText("Academic Year: 2023");
            tvSemester.setText("Semester: 1");
            tvCredit.setText("Module Credit: 4");
            tvVenue.setText("Venue: W65C");
        } else if (moduleCode.equals("C110")) {
            tvModuleCode.setText(String.format("Module Code: %s", moduleCode));
            tvModuleName.setText("Module Name: Programming Fundamentals I");
            tvYear.setText("Academic Year: 2023");
            tvSemester.setText("Semester: 1");
            tvCredit.setText("Module Credit: 4");
            tvVenue.setText("Venue: W55M");
        }
        else {
            tvModuleCode.setText(String.format("Module Code: %s", moduleCode));
            tvModuleName.setText("Module Name: Life Skills III");
            tvYear.setText("Academic Year: 2023");
            tvSemester.setText("Semester: 1");
            tvCredit.setText("Module Credit: 1");
            tvVenue.setText("Venue: HB02");
        }

    }
}