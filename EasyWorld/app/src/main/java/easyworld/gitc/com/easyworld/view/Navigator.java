package easyworld.gitc.com.easyworld.view;

import android.content.Intent;

import easyworld.gitc.com.easyworld.view.activities.BaseActivity;
import easyworld.gitc.com.easyworld.view.activities.MenuActivity;

/*
 This class containing navigation logic through activities
 */
public class Navigator {

    /**
     * Navigating to MenuActivity
     * @param activity
     * @param someValue
     */
    public static void navigateToMenuActivity(BaseActivity activity, int someValue) {
        if (activity != null) {
            Intent intent = MenuActivity.getIntent(activity, someValue);
            activity.startActivity(intent);
        }
    }
}
