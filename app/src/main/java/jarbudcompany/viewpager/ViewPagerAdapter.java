package jarbudcompany.viewpager;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class ViewPagerAdapter extends FragmentStatePagerAdapter {

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        //jika ingin menambah page harus di edit di sini
        if (position == 0){
            return new FragmentOne();
        } else if (position == 1){
            return new FragmentTwo();
        } else if (position == 2){
            return new FragmentThree();
        }

        throw new IllegalStateException("Position not valid");
    }

    @Override
    public int getCount() {
        return 3;//jumlah page
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0){
            return "First";
        } else if (position == 1){
            return "Second";
        } else if (position == 2){
            return "Third";
        }

        throw new IllegalStateException("Position not valid");
    }
}
