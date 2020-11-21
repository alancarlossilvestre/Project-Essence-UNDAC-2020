package com.example.doblenav.ui.Retos;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import com.example.doblenav.R;

public class RetosFragment extends Fragment {

    private RetosViewModel slideshowViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
            ViewGroup container, Bundle savedInstanceState) {
        getActivity().setTheme(R.style.TemaRetos);
        slideshowViewModel = ViewModelProviders.of(this).get(RetosViewModel.class);
        View root = inflater.inflate(R.layout.fragment_retos, container, false);
        return root;
    }
}