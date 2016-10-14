package kr.co.ideastudy.beastmainproject.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import kr.co.ideastudy.beastmainproject.R;

public class AboutUsFragment extends Fragment {
    public static AboutUsFragment newInstance() {
        return new AboutUsFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.framgment_about_us, container, false);
    }
}
