package ominext.com.usingdatabindinginandroid.model;

import android.databinding.ObservableArrayMap;
import android.databinding.ObservableMap;

/**
 * Created by LuongHH on 6/15/2017.
 */

public class ProductObservableMap {

    public ObservableMap<String, String> map;

    public ProductObservableMap() {
        map = new ObservableArrayMap<>();
    }
}
