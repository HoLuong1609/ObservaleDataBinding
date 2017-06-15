package ominext.com.usingdatabindinginandroid.model;

/**
 * Created by LuongHH on 6/15/2017.
 */

import android.databinding.ObservableDouble;
import android.databinding.ObservableField;

public class ProductObservableField {
    public final ObservableField<String> productName = new ObservableField<>();

    public final ObservableField<String> productDescription = new ObservableField<>();

    public final ObservableDouble productPrice = new ObservableDouble();
}
