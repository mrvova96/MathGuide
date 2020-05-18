package com.example.mathguide.fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.mathguide.R;

public class DirectionFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_direction, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        final Bundle bundle = new Bundle();

        ImageView imageView = view.findViewById(R.id.image_direction);
        Glide.with(this).load(R.drawable.direction).into(imageView);

        ImageView imageView1 = view.findViewById(R.id.image_bottom);
        Glide.with(this).load(R.drawable.bottom).into(imageView1);

        view.findViewById(R.id.button_direction_to_ib).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bundle.putInt("image", R.drawable.direction_ib);
                bundle.putString("image1", "https://math.uniyar.ac.ru/file/get/ac965c84-2fb9-4d06-a19b-0dc329741637");
                bundle.putInt("text", R.string.text_direction_ib);
                Navigation.findNavController(v).navigate(R.id.action_nav_direction_to_nav_direction_info, bundle);
            }
        });

        view.findViewById(R.id.button_direction_to_pmi).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bundle.putInt("image", R.drawable.direction_pmi);
                bundle.putString("image1", "https://math.uniyar.ac.ru/file/get/cfc2ef8f-272b-4e7e-9a92-638abc0c3e41");
                bundle.putInt("text", R.string.text_direction_pmi);
                Navigation.findNavController(v).navigate(R.id.action_nav_direction_to_nav_direction_info, bundle);
            }
        });

        view.findViewById(R.id.button_direction_to_mkn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bundle.putInt("image", R.drawable.direction_mkn);
                bundle.putString("image1", "https://math.uniyar.ac.ru/file/get/cffd4ae8-c992-4282-bc6a-77ff02ad04c7");
                bundle.putInt("text", R.string.text_direction_mkn);
                Navigation.findNavController(v).navigate(R.id.action_nav_direction_to_nav_direction_info, bundle);
            }
        });

        view.findViewById(R.id.button_direction_to_kb).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bundle.putInt("image", R.drawable.direction_kb);
                bundle.putString("image1", "https://math.uniyar.ac.ru/file/get/4b9423b4-4706-4684-8176-7ad79d69b0f5");
                bundle.putInt("text", R.string.text_direction_kb);
                Navigation.findNavController(v).navigate(R.id.action_nav_direction_to_nav_direction_info, bundle);
            }
        });
    }
}
