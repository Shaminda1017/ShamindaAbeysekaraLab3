package shaminda.abeysekara.s301056885.ui.dashboard;
//Shaminda_Abeysekara_301056885
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import android.Manifest;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;
import java.util.List;

import pub.devrel.easypermissions.AfterPermissionGranted;
import pub.devrel.easypermissions.AppSettingsDialog;
import pub.devrel.easypermissions.EasyPermissions;
import shaminda.abeysekara.s301056885.R;
import shaminda.abeysekara.s301056885.ShamindaActivity;


public class DashboardViewModel extends AppCompatActivity implements EasyPermissions.PermissionCallbacks {

    private MutableLiveData<CharSequence> text = new MutableLiveData<>();

    public void setText(CharSequence input) {
        text.setValue(input);
    }
    public LiveData<CharSequence> getText(){
        return text;
    }

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.abeysekara_fragment);


    }

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        //cameraImg.start();

        Button runTime = findViewById(R.id.shamindaRunTimeBtn);
        runTime.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                openCamera();
            }
        });
    }

    @AfterPermissionGranted(123)
    private void openCamera() {
        String[] perms = {Manifest.permission.CAMERA, Manifest.permission.READ_EXTERNAL_STORAGE};
        if(EasyPermissions.hasPermissions(this, perms)){
            Toast.makeText(this, "Opening Camera", Toast.LENGTH_SHORT).show();
        }else {
            EasyPermissions.requestPermissions(this,"Need Your permission to access",
                    123, perms);
        }
    }


    private void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults, DashboardViewModel dashboardViewModel) {
        EasyPermissions.onRequestPermissionsResult(requestCode, permissions, grantResults, this);
    }

    @Override
    public void onPermissionsGranted(int requestCode, @NonNull List<String> perms) {

    }

    @Override
    public void onPermissionsDenied(int requestCode, @NonNull List<String> perms) {
        if(EasyPermissions.somePermissionPermanentlyDenied(this, perms)){
            new AppSettingsDialog.Builder(this).build().show();
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode == AppSettingsDialog.DEFAULT_SETTINGS_REQ_CODE){

        }
    }
}