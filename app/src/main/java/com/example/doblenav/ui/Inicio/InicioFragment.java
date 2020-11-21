package com.example.doblenav.ui.Inicio;

import android.content.Context;
import android.content.pm.PackageManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.VideoView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import com.example.doblenav.R;

import java.net.URI;

public class InicioFragment extends Fragment {

    private InicioViewModel homeViewModel;

   private VideoView  videoView;
    private VideoView  videoView2;
    private VideoView  videoView3;
    private VideoView  videoView4;


    MediaController mediaController;


    public View onCreateView(@NonNull LayoutInflater inflater,
            ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                ViewModelProviders.of(this).get(InicioViewModel.class);
        View root = inflater.inflate(R.layout.fragment_inicio, container, false);

        videoView= root.findViewById(R.id.videoView_1);
        videoView.setVideoPath("android.resource://" + getContext().getPackageName()+"/"+R.raw.video_pintura);
        mediaController = new MediaController(getContext());
        mediaController.setAnchorView(videoView);
        videoView.setMediaController(mediaController);


        videoView2= root.findViewById(R.id.videoView_2);
        videoView2.setVideoPath("android.resource://" + getContext().getPackageName()+"/"+R.raw.video_instrumental);
        mediaController = new MediaController(getContext());
        mediaController.setAnchorView(videoView2);
        videoView2.setMediaController(mediaController);

        videoView3= root.findViewById(R.id.videoView_3);
        videoView3.setVideoPath("android.resource://" + getContext().getPackageName()+"/"+R.raw.video_danzacultural);
        mediaController = new MediaController(getContext());
        mediaController.setAnchorView(videoView3);
        videoView3.setMediaController(mediaController);

        videoView4= root.findViewById(R.id.videoView_4);
        videoView4.setVideoPath("android.resource://" + getContext().getPackageName()+"/"+R.raw.video_fotografia);
        mediaController = new MediaController(getContext());
        mediaController.setAnchorView(videoView4);
        videoView4.setMediaController(mediaController);






        return root;
    }



}