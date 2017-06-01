package easyworld.gitc.com.easyworld.view.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import easyworld.gitc.com.easyworld.view.fragments.registrationfragments.CompleteRegistrationFragment;
import easyworld.gitc.com.easyworld.view.fragments.registrationfragments.PhoneConfirmationFragment;
import easyworld.gitc.com.easyworld.view.fragments.registrationfragments.PhoneNumberFragment;
import easyworld.gitc.com.easyworld.view.fragments.registrationfragments.RegistrationFragment;


/**
 * Created by ners on 05/31/2017.
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter {

    public SectionsPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        // getItem is called to instantiate the fragment for the given page.
        // Return a PlaceholderFragment (defined as a static inner class below).
        if (position == 0) {
            return new RegistrationFragment();
        }
        if (position == 1) {
            return new PhoneNumberFragment();
        }
        if (position == 2) {
            return new PhoneConfirmationFragment();
        }
        if (position == 3) {
            return new CompleteRegistrationFragment();
        }

        return new RegistrationFragment();
    }

    @Override
    public int getCount() {
        // Show 3 total pages.
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return null;
    }
}

