package shaminda.abeysekara.s301056885.ui.home;
//Shaminda_Abeysekara_301056885
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import shaminda.abeysekara.s301056885.R;

public class ShamindaFragment extends Fragment {
    private HomeViewModel homeViewModel;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
       View v =  inflater.inflate(R.layout.shaminda_fragment, container, false);

       return  v;

    }
}