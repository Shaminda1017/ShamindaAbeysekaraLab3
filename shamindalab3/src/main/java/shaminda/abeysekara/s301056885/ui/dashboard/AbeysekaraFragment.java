package shaminda.abeysekara.s301056885.ui.dashboard;
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

public class AbeysekaraFragment extends Fragment {


    //private int CAMERA_PERMISSION_CODE = 1;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        return  inflater.inflate(R.layout.abeysekara_fragment, container, false);

        //Button buttonRequest = findViewById(R.id.shamindaRunTimeBtn);
//        buttonRequest.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//            }
//        });

    }
}