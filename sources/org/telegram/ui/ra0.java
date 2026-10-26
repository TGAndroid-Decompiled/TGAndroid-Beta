package org.telegram.ui;

import android.window.OnBackInvokedCallback;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class ra0 implements OnBackInvokedCallback {
    public final LaunchActivity f43086a;

    public ra0(LaunchActivity launchActivity) {
        this.f43086a = launchActivity;
    }

    public final void onBackInvoked() {
        if (AndroidUtilities.isTablet()) {
            this.f43086a.onBackPressed();
        } else if (!this.f43086a.e0(true)) {
        } else {
            LaunchActivity launchActivity = this.f43086a;
            ActionBarLayout actionBarLayout = launchActivity.f35553q0;
            if (actionBarLayout != null) {
                if (!actionBarLayout.f22324i1) {
                    actionBarLayout.H();
                    return;
                }
                actionBarLayout.f22324i1 = false;
                actionBarLayout.e(false);
                return;
            }
            launchActivity.onBackPressed();
        }
    }
}
