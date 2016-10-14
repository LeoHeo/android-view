package kr.co.ideastudy.beastmainproject.views.MeetABroViews;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;

import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;

import butterknife.BindView;
import butterknife.ButterKnife;
import kr.co.ideastudy.beastmainproject.R;
import kr.co.ideastudy.beastmainproject.enties.Brother;

public class MeetABroViewHolder extends RecyclerView.ViewHolder{
    private final String LOG_TAG = MeetABroViewHolder.class.getSimpleName();

    @BindView(R.id.list_meet_a_bro_imageView)
    ImageView brotherPic;

    @BindView(R.id.list_meet_a_bro_progressbar)
    ProgressBar brotherProgressBar;

    public MeetABroViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
    }

    public void populate(Context context, Brother brother) {
        itemView.setTag(brother);
        Picasso.with(context).load(brother.getBrotherPicture())
                .fit()
                .centerCrop()
                .into(brotherPic, new Callback() {
                    @Override
                    public void onSuccess() {
                        brotherProgressBar.setVisibility(View.GONE);
                    }

                    @Override
                    public void onError() {

                    }
                });
    }
}
