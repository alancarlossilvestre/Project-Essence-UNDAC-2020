package com.example.doblenav.ui.Perfil.Fragmentos_deperfil;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.MediaController;
import android.widget.VideoView;

import com.example.doblenav.R;
import com.example.doblenav.ui.Inicio.InicioViewModel;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Publicaciones_PerfilFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Publicaciones_PerfilFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Publicaciones_PerfilFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Publicaciones_PerfilFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static Publicaciones_PerfilFragment newInstance(String param1, String param2) {
        Publicaciones_PerfilFragment fragment = new Publicaciones_PerfilFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }
    private InicioViewModel homeViewModel;

    private VideoView videoView;
    private VideoView  videoView2;
    private VideoView  videoView3;
    private VideoView  videoView4;

    MediaController mediaController;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_publicaciones__perfil, container, false);

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