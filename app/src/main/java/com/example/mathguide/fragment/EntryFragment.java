package com.example.mathguide.fragment;

import android.os.Build;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.mathguide.R;

public class EntryFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_entry, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        ImageView imageView = view.findViewById(R.id.image_entry);
        Glide.with(this).load(R.drawable.entry).into(imageView);

        ImageView imageView1 = view.findViewById(R.id.image_entry_about);
        Glide.with(this)
                .load("https://math.uniyar.ac.ru/file/get/cd32a264-9da1-4b2c-9d4b-0beb1fc5f3c4")
                .override((int) (193 * requireContext().getResources().getDisplayMetrics().density), (int) (155 * requireContext().getResources().getDisplayMetrics().density))
                .into(imageView1);

        ImageView imageView2 = view.findViewById(R.id.image_bottom);
        Glide.with(this).load(R.drawable.bottom).into(imageView2);

        TextView textView = view.findViewById(R.id.text_entry);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            textView.setText(Html.fromHtml(getResources().getString(R.string.text_entry), Html.FROM_HTML_MODE_LEGACY));
        } else {
            textView.setText(Html.fromHtml(getResources().getString(R.string.text_entry)));
        }
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }
}
