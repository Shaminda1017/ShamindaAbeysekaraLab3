package shaminda.abeysekara.s301056885.ui.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HomeViewModel extends ViewModel {


    private MutableLiveData<CharSequence> text = new MutableLiveData<>();

    public void setText(CharSequence input) {
        text.setValue(input);
    }
    public  LiveData<CharSequence>getText(){
        return text;
    }
}