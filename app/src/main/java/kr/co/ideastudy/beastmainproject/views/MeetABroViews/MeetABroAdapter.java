package kr.co.ideastudy.beastmainproject.views.MeetABroViews;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import kr.co.ideastudy.beastmainproject.R;
import kr.co.ideastudy.beastmainproject.enties.Brother;

public class MeetABroAdapter extends RecyclerView.Adapter<MeetABroViewHolder> implements View.OnClickListener {
    private LayoutInflater mLayoutInflater;
    private AppCompatActivity activity;
    private OnBrotherClicked listner;
    private ArrayList<Brother> brothers;


    public MeetABroAdapter(OnBrotherClicked listner, AppCompatActivity activity) {
        this.listner = listner;
        this.activity = activity;
        mLayoutInflater = activity.getLayoutInflater();
        brothers = new ArrayList<>();
    }

    public ArrayList<Brother> getBrothers() {
        return brothers;
    }

    @Override
    public MeetABroViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View listView = mLayoutInflater.inflate(R.layout.list_meet_a_bro, parent, false);
        listView.setOnClickListener(this);
        return new MeetABroViewHolder(listView);
    }

    @Override
    public void onBindViewHolder(MeetABroViewHolder holder, int position) {
        holder.populate(activity, brothers.get(position));
    }

    @Override
    public int getItemCount() {
        return brothers.size();
    }

    @Override
    public void onClick(View view) {
        if(view.getTag() instanceof Brother) {
            Brother brother = (Brother) view.getTag();
            listner.OnCBrotherClicked(brother);
        }

    }

    public interface OnBrotherClicked {
        void OnCBrotherClicked(Brother brother);
    }
}
