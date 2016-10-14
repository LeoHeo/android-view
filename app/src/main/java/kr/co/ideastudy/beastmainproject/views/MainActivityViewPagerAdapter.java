package kr.co.ideastudy.beastmainproject.views;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import kr.co.ideastudy.beastmainproject.fragments.AboutUsFragment;
import kr.co.ideastudy.beastmainproject.fragments.MeetABroFragment;
import kr.co.ideastudy.beastmainproject.fragments.RushFragment;


public class MainActivityViewPagerAdapter extends FragmentStatePagerAdapter {

    public MainActivityViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment returnFragment;
        switch (position) {
            case 0:
                returnFragment = AboutUsFragment.newInstance();
                break;
            case 1:
                returnFragment = MeetABroFragment.newInstance();
                break;
            case 2:
                returnFragment = RushFragment.newInstance();
                break;
            default:
                return null;
        }

        return returnFragment;
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        CharSequence title;
        switch (position) {
            case 0:
                title = "About US";
                break;
            case 1:
                title = "Meet A Bro";
                break;
            case 2:
                title = "Rush";
                break;
            default:
                return null;
        }

        return title;
    }
}
