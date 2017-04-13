package com.example.biz.listview;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.widget.ArrayAdapter;

/**
 * Created by IO-PC on 12/04/2017.
 */

public class xElementiListView extends ArrayAdapter {

    public xElementiListView(@NonNull Context context, @LayoutRes int resource) {
        super(context, resource);
    }
}
