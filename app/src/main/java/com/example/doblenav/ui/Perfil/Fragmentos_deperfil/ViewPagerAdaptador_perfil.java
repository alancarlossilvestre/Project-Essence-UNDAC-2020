package com.example.doblenav.ui.Perfil.Fragmentos_deperfil;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class ViewPagerAdaptador_perfil extends FragmentPagerAdapter {

    private final List<Fragment> fragmentList= new ArrayList<>();
    private final List<String> Fragmentlistatitulos= new ArrayList<>();

    public ViewPagerAdaptador_perfil(@NonNull FragmentManager fm) {
        super(fm);
    }


    @NonNull
    @Override
    public Fragment getItem(int position) {
        return fragmentList.get(position);
    }

    @Override
    public int getCount() {
        return Fragmentlistatitulos.size();
    }

    @Override
    public CharSequence getPageTitle(int position){
        return Fragmentlistatitulos.get(position);
    }


    public void AddFragment(Fragment fragment, String titulo){
        fragmentList.add(fragment);
        Fragmentlistatitulos.add(titulo);
    }
}
