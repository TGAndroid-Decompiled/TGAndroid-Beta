package org.telegram.ui;

import android.window.OnBackInvokedCallback;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class ra0 implements OnBackInvokedCallback {
    public final LaunchActivity f42020a;

    public ra0(LaunchActivity launchActivity) {
        this.f42020a = launchActivity;
    }

    public final void onBackInvoked() {
        if (AndroidUtilities.isTablet()) {
            this.f42020a.onBackPressed();
        } else if (!this.f42020a.c0(true)) {
        } else {
            LaunchActivity launchActivity = this.f42020a;
            ActionBarLayout actionBarLayout = launchActivity.m0;
            if (actionBarLayout != null) {
                if (!actionBarLayout.Y0) {
                    actionBarLayout.G();
                    return;
                }
                actionBarLayout.Y0 = false;
                actionBarLayout.e(false);
                return;
            }
            launchActivity.onBackPressed();
        }
    }
}
