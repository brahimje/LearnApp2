package com.example.learnapp;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.Toast;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class ModulesActivity extends AppCompatActivity {

    private GridView gridView;
    private FloatingActionButton fab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modules);

        gridView = findViewById(R.id.gridView);
        fab = findViewById(R.id.fab);

        // Sample data for modules
        String[] modules = {"Module 1", "Module 2", "Module 3", "Module 4", "Module 5"};

        // Adapter for the GridView
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.module_item
                ,R.id.moduleNameTextView, modules);
        gridView.setAdapter(adapter);

        // Sample data for modules
       /* List<Module> modules = new ArrayList<>();
        modules.add(new Module(1, "M1", "Module 1", "Description 1", 3));
        modules.add(new Module(2, "M2", "Module 2", "Description 2", 4));
        modules.add(new Module(3, "M3", "Module 3", "Description 3", 2));
        // Create ModuleAdapter
        ModuleAdapter adapter2 = new ModuleAdapter(this, modules);
        // Set the adapter to the ListView
        gridView.setAdapter(adapter2);*/

        // Set item click listener
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String moduleName = (String) parent.getItemAtPosition(position);
                showToast("Module selected: " + moduleName);
            }
        });

        // Set click listener for FloatingActionButton
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Implement logic to update the list of modules
                // For now, let's just show a toast indicating that the list is updated.
                showToast("Liste des modules mise à jour");
            }
        });
    }

    private void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}
