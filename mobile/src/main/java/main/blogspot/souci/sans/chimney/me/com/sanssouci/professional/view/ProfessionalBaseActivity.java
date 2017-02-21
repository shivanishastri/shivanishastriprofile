package main.blogspot.souci.sans.chimney.me.com.sanssouci.professional.view;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;
import java.util.List;

import main.blogspot.souci.sans.chimney.me.com.sanssouci.R;

/**
 * Created by Shivani Shastri on 2/4/17.
 * <p>
 * This is the Base Activity for Professional Section of the profile. This section has a "Teal" theme of Material Design Palatte
 * and follows Data Binding as a principle (MVVM Design Pattern). This has 3 tabs : Playstore Projects , Projects Completed and Technical Skills
 */

public class ProfessionalBaseActivity extends AppCompatActivity {

    // Action Bar for the app. TODO: decide weather or not to inherit this from BaseActivity, if any.
    private Toolbar mToolBar;
    //Tab Layout to inflate different professional sections in terms of 3 diffrent fragments.
    private TabLayout mTabLayout;
    //View pager to facilitate seamless transition between screens.
    private ViewPager mViewPager;

    @Override
    public void onCreate(@Nullable final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_professional);

        initializeViews();
    }

    private void initializeViews() {
        mToolBar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(mToolBar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //Intialize View Pager and add fragments therein.
        mViewPager = (ViewPager) findViewById(R.id.viewpager);
        setUpViewPager(mViewPager);

        //Initialize Tab Layout and add view pager therein.
        mTabLayout = (TabLayout) findViewById(R.id.tabs);
        mTabLayout.setupWithViewPager(mViewPager);
    }

    private void setUpViewPager(ViewPager viewPager) {
        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());
        viewPagerAdapter.addFragment(new ProjectsCompletedFragment(), getResources().getString(R.string.projects_completed));
        viewPagerAdapter.addFragment(new TechnicalSkillsFragment(), getResources().getString(R.string.technical_skills));
        viewPagerAdapter.addFragment(new PlaystoreProjectsLinksFragment(), getResources().getString(R.string.playstore_links));
        viewPager.setAdapter(viewPagerAdapter);
    }


    /**
     * View pager adapter to fill in screens/fragments to facilitate seamless transition between screens.
     */
    class ViewPagerAdapter extends FragmentPagerAdapter {
        private final List<Fragment> mFragmentList = new ArrayList<>();
        private final List<String> mFragmentTitleList = new ArrayList<>();

        public ViewPagerAdapter(FragmentManager manager) {
            super(manager);
        }

        @Override
        public Fragment getItem(int position) {
            return mFragmentList.get(position);
        }

        @Override
        public int getCount() {
            return mFragmentList.size();
        }

        public void addFragment(Fragment fragment, String title) {
            mFragmentList.add(fragment);
            mFragmentTitleList.add(title);
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return mFragmentTitleList.get(position);
        }
    }

}
