package shaminda.abeysekara.s301056885.ui.dashboard;
//Shaminda_Abeysekara_301056885
import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;

import android.Manifest;
import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.PackageManager;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import shaminda.abeysekara.s301056885.R;
import shaminda.abeysekara.s301056885.ShamindaActivity;


public class DashboardViewModel extends AppCompatActivity {

    AnimationDrawable cameraImg;

    private int CAMERA_PERMISSION_CODE = 1;


    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.abeysekara_fragment);

        ImageView imgView = (ImageView) findViewById(R.id.shamindaAnimateImg);
        imgView.setBackgroundResource(R.drawable.shaminda_animation);
        cameraImg = (AnimationDrawable) imgView.getBackground();
    }

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        cameraImg.start();
    }
    //    private void requestCameraPermission(){
//        if(ActivityCompat.shouldShowRequestPermissionRationale(this, Manifest.permission.CAMERA)){
//            new AlertDialog.Builder(this)
//                    .setTitle("Permission Needed")
//                    .setMessage("This permission is needed for access camera")
//                    .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
//                        @Override
//                        public void onClick(DialogInterface dialog, int which) {
//                            ActivityCompat.requestPermissions(DashboardViewModel.this, new String[] {Manifest.permission.CAMERA}, CAMERA_PERMISSION_CODE);
//                        }
//                    })
//                    .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
//                        @Override
//                        public void onClick(DialogInterface dialog, int which) {
//                            dialog.dismiss();
//                        }
//                    })
//                    .create().show();
//        }else {
//            ActivityCompat.requestPermissions(this, new String[] {Manifest.permission.CAMERA}, CAMERA_PERMISSION_CODE);
//        }
//    }



//    @Override
//    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
//        if(requestCode == CAMERA_PERMISSION_CODE){
//            if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
//                Toast.makeText(this, "Permission Granted", Toast.LENGTH_SHORT).show();
//            }else {
//                Toast.makeText(this,"Permission Denied", Toast.LENGTH_SHORT).show();
//            }
//        }
     //}
}