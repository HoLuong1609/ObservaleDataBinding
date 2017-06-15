package ominext.com.usingdatabindinginandroid.binding;

import android.databinding.BindingAdapter;
import android.widget.ImageView;

/**
 * Created by LuongHH on 6/15/2017.
 */

public class ImageBinding {

    @BindingAdapter("android:src")
    public static void setImageResource(ImageView imageView, int resource) {
        imageView.setImageResource(resource);
    }
}
