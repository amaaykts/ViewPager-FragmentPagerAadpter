package tech.sp2.viewpagerfragmentadapter;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.util.List;

/**
 * Created by ARTEM on 19.10.2016.
 */

public class MyFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment, container, false);
        Button button = (Button) view.findViewById(R.id.button);
        Bundle bundle = getArguments();
        button.setText(bundle.getStringArrayList(MyFragmentPagerAdapter.DATA_BUNDLE)
                .get(bundle.getInt(MyFragmentPagerAdapter.POSITION)) + " " + (bundle.getInt(MyFragmentPagerAdapter.POSITION)+1));

        return view;
    }
}
