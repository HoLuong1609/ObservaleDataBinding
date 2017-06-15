package ominext.com.usingdatabindinginandroid.binding;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import ominext.com.usingdatabindinginandroid.BR;

/**
 * Created by LuongHH on 6/15/2017.
 */

public class TextObject extends BaseObservable {

    private String textFromButton;

    public TextObject(String textFromButton) {
        this.textFromButton = textFromButton;
    }

    @Bindable
    public String getTextFromButton() {
        return textFromButton;
    }

    public void setTextFromButton(String textFromButton) {
        this.textFromButton = textFromButton;
        notifyPropertyChanged(BR.textFromButton);
    }
}
