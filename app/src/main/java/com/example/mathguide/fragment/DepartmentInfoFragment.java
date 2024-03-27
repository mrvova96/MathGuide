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

public class DepartmentInfoFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_department_info, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        int imageValue = requireArguments().getInt("image");
        int textValue = requireArguments().getInt("text");

        ImageView imageView = view.findViewById(R.id.image_department_info);
        Glide.with(this).load(imageValue).into(imageView);

        TextView textView = view.findViewById(R.id.text_department_info);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            textView.setText(Html.fromHtml(getResources().getString(textValue), Html.FROM_HTML_MODE_LEGACY));
        } else {
            textView.setText(Html.fromHtml(getResources().getString(textValue)));
        }
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }
}
