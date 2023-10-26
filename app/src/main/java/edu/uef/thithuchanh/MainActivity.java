package edu.uef.thithuchanh;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    package com.example.giuakimobileapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

    public class MainActivity extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
        }
    import android.os.Bundle;
        import android.view.View;
        import android.widget.AdapterView;
        import android.widget.ArrayAdapter;
        import android.widget.ListView;
        import android.widget.TextView;

        import androidx.appcompat.app.AppCompatActivity;

        public class MainActivity extends AppCompatActivity {
            private String[] foodNames = {
                    "Món 1", "Món 2", "Món 3", "Món 4", "Món 5", "Món 6", "Món 7", "Món 8", "Món 9", "Món 10"
            };

            @Override
            protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_main);

                ListView foodListView = findViewById(R.id.danhsachmonan);
                final TextView selectedFoodTextView = findViewById(R.id.selectedFoodTextView);

                ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, foodNames);
                foodListView.setAdapter(adapter);

                foodListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        String selectedFood = foodNames[position];
                        selectedFoodTextView.setText("Thực đơn đã chọn: " + selectedFood);
                    }
                });
            }
        }

    }

}
