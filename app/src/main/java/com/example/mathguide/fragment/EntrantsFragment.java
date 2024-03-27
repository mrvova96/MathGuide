package com.example.mathguide.fragment;

import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import com.bumptech.glide.Glide;
import com.example.mathguide.R;

public class EntrantsFragment extends Fragment {

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_entrants, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        ImageView imageView = view.findViewById(R.id.image_entrants);
        Glide.with(this).load(R.drawable.entrants).into(imageView);

        ImageView imageView1 = view.findViewById(R.id.image_entrants_about);
        Glide.with(this)
                .load("https://math.uniyar.ac.ru/file/get/432d7f0d-9699-4d44-8c42-e0597d8b359c")
                .override((int) (170 * requireContext().getResources().getDisplayMetrics().density))
                .into(imageView1);


        ImageView imageView2 = view.findViewById(R.id.image_bottom);
        Glide.with(this).load(R.drawable.bottom).into(imageView2);

        TextView textView = view.findViewById(R.id.text_entrants);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            textView.setText(Html.fromHtml(getResources().getString(R.string.text_entrants), Html.FROM_HTML_MODE_LEGACY));
        } else {
            textView.setText(Html.fromHtml(getResources().getString(R.string.text_entrants)));
        }
        textView.setMovementMethod(LinkMovementMethod.getInstance());

        view.findViewById(R.id.button_entrants_to_entry).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(v).navigate(R.id.action_nav_entrants_to_nav_entry);
            }
        });

        view.findViewById(R.id.button_entrants_to_department).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(v).navigate(R.id.action_nav_entrants_to_nav_department);
            }
        });

        view.findViewById(R.id.button_entrants_to_direction).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(v).navigate(R.id.action_nav_entrants_to_nav_direction);
            }
        });

        view.findViewById(R.id.button_entrants_to_contacts).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(v).navigate(R.id.action_nav_entrants_to_nav_contacts);
            }
        });
    }
}
