package sh;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.ui.LaunchActivity;
public final class t3 extends org.telegram.ui.ActionBar.p2 {
    @Override
    public final Context getContext() {
        return AndroidUtilities.findActivity(LaunchActivity.D1);
    }

    @Override
    public final int getCurrentAccount() {
        return this.currentAccount;
    }

    @Override
    public final Activity getParentActivity() {
        Activity findActivity = AndroidUtilities.findActivity(ApplicationLoader.applicationContext);
        if (findActivity == null) {
            return LaunchActivity.D1;
        }
        return findActivity;
    }
}
