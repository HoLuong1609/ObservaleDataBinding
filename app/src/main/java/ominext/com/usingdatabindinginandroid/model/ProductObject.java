package ominext.com.usingdatabindinginandroid.model;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.databinding.PropertyChangeRegistry;

import ominext.com.usingdatabindinginandroid.BR;

/**
 * Created by LuongHH on 6/15/2017.
 */

public class ProductObject extends BaseObservable {

    private PropertyChangeRegistry mRegistry = new PropertyChangeRegistry();

    private int image;
    private String name;
    private double price;
    private String description;

    public ProductObject(int image, String name, double price, String description) {
        this.image = image;
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public void setImage(int image) {
        this.image = image;
        notifyPropertyChanged(BR.image);
    }

    public void setName(String name) {
        this.name = name;
        notifyPropertyChanged(BR.name);
    }

    public void setPrice(double price) {
        this.price = price;
        notifyPropertyChanged(BR.price);
    }

    public void setDescription(String description) {
        this.description = description;
        notifyPropertyChanged(BR.description);
    }

    @Bindable
    public int getImage() {
        return image;
    }

    @Bindable
    public String getName() {
        return name;
    }

    @Bindable
    public double getPrice() {
        return price;
    }

    @Bindable
    public String getDescription() {
        return description;
    }

    @Override
    public void addOnPropertyChangedCallback(OnPropertyChangedCallback callback) {
        super.addOnPropertyChangedCallback(callback);
        mRegistry.add(callback);
    }

    @Override
    public void removeOnPropertyChangedCallback(OnPropertyChangedCallback callback) {
        mRegistry.remove(callback);
    }
}
