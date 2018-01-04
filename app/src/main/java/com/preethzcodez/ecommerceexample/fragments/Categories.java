package com.preethzcodez.ecommerceexample.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ListView;

import com.preethzcodez.ecommerceexample.R;
import com.preethzcodez.ecommerceexample.adapters.CategoryListAdapter;
import com.preethzcodez.ecommerceexample.adapters.ProductListAdapter;
import com.preethzcodez.ecommerceexample.database.DB_Handler;
import com.preethzcodez.ecommerceexample.pojo.Category;
import com.preethzcodez.ecommerceexample.pojo.Product;

import java.util.List;

/**
 * Created by Preeth on 1/3/2018.
 */

public class Categories extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.categories, container, false);

        // load products
        DB_Handler db_handler = new DB_Handler(getActivity());
        List<Category> categoryList = db_handler.getCategoryList();

        // fill listview with data
        ListView listView=(ListView) view.findViewById(R.id.categories);
        listView.setAdapter(new CategoryListAdapter(getActivity(), categoryList));

        return view;
    }

    /**
     * Load Data
     */
    private void loadData()
    {

    }
}
