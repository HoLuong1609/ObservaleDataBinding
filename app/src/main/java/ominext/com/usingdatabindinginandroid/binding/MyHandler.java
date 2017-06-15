package ominext.com.usingdatabindinginandroid.binding;

import android.util.Log;
import android.view.View;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import ominext.com.usingdatabindinginandroid.MainActivity;

/**
 * Created by LuongHH on 6/15/2017.
 */

public class MyHandler {

    private static final String TAG = MyHandler.class.getSimpleName();
    private List<String> randomString = Arrays.asList("King", "Book", "Ice", "Android", "Java");

    public void onClickTextShow(View view) {
        Log.d(TAG, "Click from button");
        String mRandom = getRandomString();
        MainActivity.textObject.setTextFromButton(mRandom);
    }

    private String getRandomString() {
        Collections.shuffle(randomString);
        return randomString.get(0);
    }
}
