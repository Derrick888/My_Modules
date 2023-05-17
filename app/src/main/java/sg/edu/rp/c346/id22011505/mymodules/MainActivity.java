package sg.edu.rp.c346.id22011505.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tvPassModule1;
    TextView tvPassModule2;
    TextView tvPassModule3;
    TextView tvPassModule4;
    TextView tvPassModule5;
    TextView tvPassModule6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvPassModule1 = findViewById(R.id.textViewModule1);
        tvPassModule2 = findViewById(R.id.textViewModule2);
        tvPassModule3 = findViewById(R.id.textViewModule3);
        tvPassModule4 = findViewById(R.id.textViewModule4);
        tvPassModule5 = findViewById(R.id.textViewModule5);
        tvPassModule6 = findViewById(R.id.textViewModule6);

        tvPassModule1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("ModuleCode", "C346");
                startActivity(intent);

            }
        });

        tvPassModule2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("ModuleCode", "C206");
                startActivity(intent);
            }
        });

        tvPassModule3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("ModuleCode", "C203");
                startActivity(intent);
            }
        });

        tvPassModule4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("ModuleCode", "C218");
                startActivity(intent);
            }
        });

        tvPassModule5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("ModuleCode", "C110");
                startActivity(intent);
            }
        });

        tvPassModule6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("ModuleCode", "G953");
                startActivity(intent);
            }
        });
    }
}