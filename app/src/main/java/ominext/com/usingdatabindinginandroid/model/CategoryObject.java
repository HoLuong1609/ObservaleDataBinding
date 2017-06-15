package ominext.com.usingdatabindinginandroid.model;

/**
 * Created by LuongHH on 6/15/2017.
 */

public class CategoryObject {

    private String name;
    private int imageUrl;

    public CategoryObject(String name, int imageUrl) {
        this.name = name;
        this.imageUrl = imageUrl;
    }

    public String getName() {
        return name;
    }

    public int getImageUrl() {
        return imageUrl;
    }
}
