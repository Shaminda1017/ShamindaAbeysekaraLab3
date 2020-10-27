package shaminda.abeysekara.s301056885;
//Shaminda_Abeysekara_301056885
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import shaminda.abeysekara.s301056885.ui.dashboard.AbeysekaraFragment;
import shaminda.abeysekara.s301056885.ui.home.ShamindaFragment;
import shaminda.abeysekara.s301056885.ui.notifications.S301056885Fragment;

public class ShamindaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView bottomNav = findViewById(R.id.shamindaBottomNav);
        bottomNav.setItemIconTintList(null);
        bottomNav.setItemTextColor(null);
        //BottomNavigationView bottomNav = findViewById(R.id.shamindaBottomNav);
        bottomNav.setOnNavigationItemSelectedListener(navListener);

        getSupportFragmentManager().beginTransaction().replace(R.id.shamindaFragmentContainer,
                new ShamindaFragment()).commit();
    }

    private BottomNavigationView.OnNavigationItemSelectedListener navListener =
            new BottomNavigationView.OnNavigationItemSelectedListener(){
                @Override
                public boolean onNavigationItemSelected(MenuItem item){
                    Fragment selectedFragment = null;

                    switch (item.getItemId()){
                        case  R.id.shaminda_navigation_home:
                            selectedFragment = new ShamindaFragment();
                            break;
                        case  R.id.shaminda_navigation_dashboard:
                            selectedFragment = new AbeysekaraFragment();
                            break;
                        case  R.id.shaminda_navigation_notifications:
                            selectedFragment = new S301056885Fragment();
                            break;
                    }
                    getSupportFragmentManager().beginTransaction().replace(R.id.shamindaFragmentContainer,selectedFragment).commit();
                    return true;
                }
            };

}