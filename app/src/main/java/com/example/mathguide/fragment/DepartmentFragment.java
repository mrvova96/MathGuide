package com.example.mathguide.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import com.bumptech.glide.Glide;
import com.example.mathguide.R;

public class DepartmentFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_department, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        final Bundle bundle = new Bundle();

        ImageView imageView = view.findViewById(R.id.image_department);
        Glide.with(this).load(R.drawable.department).into(imageView);

        ImageView imageView1 = view.findViewById(R.id.image_bottom);
        Glide.with(this).load(R.drawable.bottom).into(imageView1);

        view.findViewById(R.id.button_department_to_aml).setOnClickListener(v -> {
            putData(bundle, v, R.drawable.department_aml, R.string.text_department_aml);
        });

        view.findViewById(R.id.button_department_to_du).setOnClickListener(v -> {
            putData(bundle, v, R.drawable.department_du, R.string.text_department_du);
        });

        view.findViewById(R.id.button_department_to_kb).setOnClickListener(v -> {
            putData(bundle, v, R.drawable.department_kb, R.string.text_department_kb);
        });

        view.findViewById(R.id.button_department_to_ma).setOnClickListener(v -> {
            putData(bundle, v, R.drawable.department_ma, R.string.text_department_ma);
        });

        view.findViewById(R.id.button_department_to_mm).setOnClickListener(v -> {
            putData(bundle, v, R.drawable.department_mm, R.string.text_department_mm);
        });

        view.findViewById(R.id.button_department_to_om).setOnClickListener(v -> {
            putData(bundle, v, R.drawable.department_om, R.string.text_department_om);
        });
    }

    private void putData(Bundle bundle, View v, int imageID, int textID) {
        bundle.putInt("image", imageID);
        bundle.putInt("text", textID);
        Navigation.findNavController(v).navigate(R.id.action_nav_department_to_nav_department_info, bundle);
    }
}
