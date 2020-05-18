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

public class ContactsFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_contacts, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        final Bundle bundle = new Bundle();

        ImageView imageView = view.findViewById(R.id.image_contacts);
        Glide.with(this).load(R.drawable.contacts_department).into(imageView);

        ImageView imageView2 = view.findViewById(R.id.image_bottom);
        Glide.with(this).load(R.drawable.bottom).into(imageView2);

        view.findViewById(R.id.button_contacts_to_departmant).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bundle.putInt("image", R.drawable.contacts_department);
                bundle.putInt("text", R.string.text_contacts_department);
                Navigation.findNavController(v).navigate(R.id.action_nav_contacts_to_nav_contacts_info, bundle);
            }
        });

        view.findViewById(R.id.button_contacts_to_reception).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bundle.putInt("image", R.drawable.contacts_reception);
                bundle.putInt("text", R.string.text_contacts_reception);
                Navigation.findNavController(v).navigate(R.id.action_nav_contacts_to_nav_contacts_info, bundle);
            }
        });
    }
}
