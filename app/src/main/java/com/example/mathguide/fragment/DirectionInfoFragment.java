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

import com.bumptech.glide.Glide;
import com.example.mathguide.R;

public class DirectionInfoFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_direction_info, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        int imageValue = requireArguments().getInt("image");
        String imageValue1 = requireArguments().getString("image1");
        int textValue = requireArguments().getInt("text");

        ImageView imageView = view.findViewById(R.id.image_direction_info);
        Glide.with(this).load(imageValue).into(imageView);

        ImageView imageView1 = view.findViewById(R.id.image_direction_about);
        Glide.with(this)
                .load(imageValue1)
                .override((int) (250 * requireContext().getResources().getDisplayMetrics().density))
                .into(imageView1);

        TextView textView = view.findViewById(R.id.text_direction_info);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            textView.setText(Html.fromHtml(getResources().getString(textValue), Html.FROM_HTML_MODE_LEGACY));
        } else {
            textView.setText(Html.fromHtml(getResources().getString(textValue)));
        }
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }
}

