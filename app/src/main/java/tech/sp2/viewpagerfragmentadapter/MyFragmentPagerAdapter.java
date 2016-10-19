package tech.sp2.viewpagerfragmentadapter;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ARTEM on 19.10.2016.
 */

public class MyFragmentPagerAdapter extends FragmentPagerAdapter {
    private List<String> data;
    public static String DATA_BUNDLE = "LIST";
    public static String POSITION = "POSITION";

    public MyFragmentPagerAdapter(FragmentManager fm, List<String> data) {
        super(fm);
        this.data = data;
    }

    @Override
    public Fragment getItem(int position) {
        Bundle bundle = new Bundle();
        bundle.putStringArrayList(DATA_BUNDLE, (ArrayList<String>)data);
        bundle.putInt(POSITION, position);
        MyFragment fragment = new MyFragment();
        fragment.setArguments(bundle);

        return fragment;
    }

    @Override
    public int getCount() {
        return data.size();
    }
}
