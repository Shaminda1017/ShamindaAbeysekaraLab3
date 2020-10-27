package shaminda.abeysekara.s301056885.ui.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HomeViewModel extends ViewModel {


    private MutableLiveData<String> mText;

    public HomeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Shaminda Abeysekara \n 301056885");
    }

    public LiveData<String> getText() {
        return mText;
    }
}