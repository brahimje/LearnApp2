package com.example.learnapp;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.List;

public class ModuleAdapter extends ArrayAdapter<Module> {

    private List<Module> modules;

    public ModuleAdapter(Context context, List<Module> modules) {
        super(context, 0, modules);
        this.modules = modules;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, @NonNull ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.module_list_item, parent, false);
        }

        Module module = getItem(position);

        if (module != null) {
            TextView acronymTextView = convertView.findViewById(R.id.acronymTextView);
            TextView nameTextView = convertView.findViewById(R.id.nameTextView);
            TextView descriptionTextView = convertView.findViewById(R.id.descriptionTextView);
            TextView creditTextView = convertView.findViewById(R.id.creditTextView);

            if (acronymTextView != null) {
                acronymTextView.setText(module.getAcronym());
            }

            if (nameTextView != null) {
                nameTextView.setText(module.getName());
            }

            if (descriptionTextView != null) {
                descriptionTextView.setText(module.getDescription());
            }

            if (creditTextView != null) {
                creditTextView.setText(String.valueOf(module.getCredit()));
            }
        }

        return convertView;
    }
}
