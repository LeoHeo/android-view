package kr.co.ideastudy.beastmainproject.activities;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import kr.co.ideastudy.beastmainproject.R;
import kr.co.ideastudy.beastmainproject.views.MainActivityViewPagerAdapter;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.activity_main_viewPager)
    ViewPager mViewPager;

    @BindView(R.id.activity_main_tabLayout)
    TabLayout mTabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        MainActivityViewPagerAdapter adapter = new MainActivityViewPagerAdapter(getSupportFragmentManager());
        mViewPager.setAdapter(adapter);
        mTabLayout.setupWithViewPager(mViewPager);
    }
}
