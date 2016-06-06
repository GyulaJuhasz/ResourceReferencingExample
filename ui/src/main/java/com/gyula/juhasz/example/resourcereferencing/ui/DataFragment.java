package com.gyula.juhasz.example.resourcereferencing.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class DataFragment extends Fragment {

    public static DataFragment newInstance() {
        return new DataFragment();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
            @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.data_screen, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        TextView stringDataText = (TextView) view.findViewById(R.id.string_data);
        TextView integerDataText = (TextView) view.findViewById(R.id.integer_data);

        stringDataText.setText(getString(R.string.string_data));
        integerDataText.setText(String.valueOf(getActivity().getResources().getInteger(R.integer.integer_data)));
    }
}
