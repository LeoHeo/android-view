package kr.co.ideastudy.beastmainproject.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import kr.co.ideastudy.beastmainproject.R;
import kr.co.ideastudy.beastmainproject.enties.Brother;
import kr.co.ideastudy.beastmainproject.views.MeetABroViews.MeetABroAdapter;


public class MeetABroFragment extends Fragment implements MeetABroAdapter.OnBrotherClicked {
    private final String LOG_TAG = MeetABroFragment.class.getSimpleName();
    private MeetABroAdapter aBroAdapter;
    private RecyclerView mRecyclerView;
    private ArrayList<Brother> brothers;

    public static MeetABroFragment newInstance() {
        return new MeetABroFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_meet_a_bro, container, false);
        aBroAdapter = new MeetABroAdapter(this, (AppCompatActivity) getActivity());
        brothers = aBroAdapter.getBrothers();
        mRecyclerView = (RecyclerView) rootView.findViewById(R.id.fragment_meet_a_bro_recylerView);
        mRecyclerView.setLayoutManager(new GridLayoutManager(getActivity(), 4));
        setUpAdapter();
        getBrothers(brothers);
        return rootView;
    }

    private void setUpAdapter() {
        if(isAdded()) {
            mRecyclerView.setAdapter(aBroAdapter);
        }
    }

    @Override
    public void OnCBrotherClicked(Brother brother) {
        Log.i(LOG_TAG, brother.getBrotherName() + " was clicked!");
    }

    private ArrayList<Brother> getBrothers(ArrayList<Brother> brothers) {
        for(int i=0; i<32; i++) {
            brothers.add(new Brother(
                    i,
                    "Brother " + i,
                    "Brother " + i + "joined for this reason",
                    "http://www.gravatar.com/avatar/" + i + "?d=identicon",
                    "Computer Engineering",
                    "Spring 2013",
                    "I love coding"
            ));
        }

        return brothers;
    }
}
