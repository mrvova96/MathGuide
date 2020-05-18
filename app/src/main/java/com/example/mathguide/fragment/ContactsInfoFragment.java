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

public class ContactsInfoFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_contacts_info, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        int textValue = requireArguments().getInt("text");
        int imageValue = requireArguments().getInt("image");

        ImageView imageView = view.findViewById(R.id.image_contacts);
        Glide.with(this).load(imageValue).into(imageView);

        ImageView imageView1 = view.findViewById(R.id.image_contacts_about);
        Glide.with(this).load("https://math.uniyar.ac.ru/file/get/eb2b4c88-2ae7-4a50-9858-f7816f6e15b5").into(imageView1);

        ImageView imageView2 = view.findViewById(R.id.image_bottom);
        Glide.with(this).load(R.drawable.bottom).into(imageView2);

        TextView textView = view.findViewById(R.id.text_contacts);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            textView.setText(Html.fromHtml(getResources().getString(textValue), Html.FROM_HTML_MODE_LEGACY));
            textView.setMovementMethod(LinkMovementMethod.getInstance());
        } else {
            textView.setText(Html.fromHtml(getResources().getString(textValue)));
            textView.setMovementMethod(LinkMovementMethod.getInstance());
        }
    }
}
