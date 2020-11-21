package com.example.doblenav.ui.Perfil;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TableLayout;

import com.example.doblenav.R;
import com.example.doblenav.ui.Perfil.Fragmentos_deperfil.Datosp_PerfilFragment;
import com.example.doblenav.ui.Perfil.Fragmentos_deperfil.Publicaciones_PerfilFragment;
import com.example.doblenav.ui.Perfil.Fragmentos_deperfil.ViewPagerAdaptador_perfil;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;


public class PerfilFragment extends Fragment {




    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private TabLayout tabLayout;
    private ViewPager viewPager;

    public PerfilFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment PerfilFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static PerfilFragment newInstance(String param1, String param2) {
        PerfilFragment fragment = new PerfilFragment();
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

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_perfil, container, false);


        tabLayout = view.findViewById(R.id.id_tablayout_perfil);
        viewPager =view.findViewById(R.id.id_viewpager_perfil);

        ViewPagerAdaptador_perfil adaptador_perfil = new ViewPagerAdaptador_perfil(getParentFragmentManager());

        adaptador_perfil.AddFragment( new Publicaciones_PerfilFragment(),"Publicaciones");
        adaptador_perfil.AddFragment( new Datosp_PerfilFragment(),"Mis Datos");

        viewPager.setAdapter(adaptador_perfil);
        tabLayout.setupWithViewPager(viewPager);

return view;
    }
}