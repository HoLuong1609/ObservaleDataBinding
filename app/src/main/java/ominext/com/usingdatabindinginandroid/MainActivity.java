package ominext.com.usingdatabindinginandroid;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

import ominext.com.usingdatabindinginandroid.adapter.CategoryAdapter;
import ominext.com.usingdatabindinginandroid.binding.MyHandler;
import ominext.com.usingdatabindinginandroid.binding.TextObject;
import ominext.com.usingdatabindinginandroid.databinding.ActivityMainBinding;
import ominext.com.usingdatabindinginandroid.databinding.ActivityMainEventHandlerBinding;
import ominext.com.usingdatabindinginandroid.databinding.ActivityMainObservableArrayMapBinding;
import ominext.com.usingdatabindinginandroid.model.CategoryObject;
import ominext.com.usingdatabindinginandroid.model.ProductObject;
import ominext.com.usingdatabindinginandroid.model.ProductObservableMap;

public class MainActivity extends AppCompatActivity {

    public static TextObject textObject;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);

//        objectBinding();
//        observableField();
//        observableMap();
//        eventHandler();
        recyclerviewBinding();
    }

    private void objectBinding() {
        ActivityMainBinding bindings = DataBindingUtil.setContentView(this, R.layout.activity_main);
        ProductObject mProduct = new ProductObject(R.drawable.sandals, "Navy blue sandals", 34.50, "Beautiful fitted sandals for work");
        bindings.setProduct(mProduct);
    }

    private void observableField() {
        ProductObservableMap product = new ProductObservableMap();
        ActivityMainObservableArrayMapBinding bindings = DataBindingUtil.setContentView(this, R.layout.activity_main_observable_array_map);
        bindings.setProduct(product);
        product.map.put("name", "Sleek Navy Blue Sandals");
        product.map.put("description", "Beautiful sleek sandals for your casual and cocktail dinner. Comes in different color");
    }

    private void observableMap() {
        ProductObservableMap product = new ProductObservableMap();
        ActivityMainObservableArrayMapBinding bindings = DataBindingUtil.setContentView(this, R.layout.activity_main_observable_array_map);
        bindings.setProduct(product);
        product.map.put("name", "Sleek Navy Blue Sandals");
        product.map.put("description", "Beautiful sleek sandals for your casual and cocktail dinner. Comes in different color");
    }

    private void eventHandler() {
        ActivityMainEventHandlerBinding bindings = DataBindingUtil.setContentView(this, R.layout.activity_main_event_handler);
        textObject = new TextObject("Welcome");
        bindings.setMHandler(new MyHandler());
        bindings.setMObject(textObject);
    }

    private void recyclerviewBinding() {
        setContentView(R.layout.activity_main_recyclerview);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.food_category);
        GridLayoutManager mGrid = new GridLayoutManager(this, 2);
        recyclerView.setLayoutManager(mGrid);
        recyclerView.setHasFixedSize(true);
        CategoryAdapter mAdapter = new CategoryAdapter(this, testData());
        recyclerView.setAdapter(mAdapter);
    }

    private List<CategoryObject> testData() {
        List<CategoryObject> categoryList = new ArrayList<>();
        categoryList.add(new CategoryObject("Pizza", R.drawable.food));
        categoryList.add(new CategoryObject("Bulgar", R.drawable.bulgar));
        categoryList.add(new CategoryObject("Baked Potato", R.drawable.potato));
        categoryList.add(new CategoryObject("Soup", R.drawable.soup));
        return categoryList;
    }
}
