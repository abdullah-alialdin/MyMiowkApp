package abdullah.alialdin.miwok;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class CategoryAdapter extends FragmentPagerAdapter {
    private Context mContext;

    CategoryAdapter(Context context, @NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
        mContext = context;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        if (position == 0){
            return new NumbersFragment();
        }else if (position == 1){
            return new ColorFragment();
        }else if (position == 2){
            return new FamilyFragment();
        }else {
            return new PhrasesFragment();
        }
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0){
            return mContext.getString(R.string.numbers);
        }else if (position == 1){
            return mContext.getString(R.string.colors);
        }else if (position == 2){
            return mContext.getString(R.string.family);
        }else{
            return mContext.getString(R.string.phrases);
        }
    }

    @Override
    public int getCount() {
        return 4;
    }
}
