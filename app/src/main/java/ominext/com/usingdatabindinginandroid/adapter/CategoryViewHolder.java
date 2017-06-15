package ominext.com.usingdatabindinginandroid.adapter;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * Created by LuongHH on 6/15/2017.
 */

public class CategoryViewHolder extends RecyclerView.ViewHolder {
    private ViewDataBinding bindings;

    public CategoryViewHolder(View itemView) {
        super(itemView);
        bindings = DataBindingUtil.bind(itemView);
    }

    public ViewDataBinding getBindings() {
        return bindings;
    }
}
