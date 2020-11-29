package shaminda.abeysekara.s301056885.ui.dashboard;
//Shaminda_Abeysekara_301056885
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModel;

import shaminda.abeysekara.s301056885.R;

public class AbeysekaraFragment extends Fragment {

    AnimationDrawable cameraImg;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View v =  inflater.inflate(R.layout.abeysekara_fragment, container, false);

        Button runTime = (Button)v.findViewById(R.id.shamindaRunTimeBtn);

        ImageView imgView = (ImageView)v.findViewById(R.id.shamindaAnimateImg);
        imgView.setBackgroundResource(R.drawable.shaminda_animation);
        cameraImg = (AnimationDrawable) imgView.getBackground();

        return v;

    }

}

