package org.telegram.ui;

import android.window.OnBackInvokedCallback;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarLayout;

public final class sa0 implements OnBackInvokedCallback {

    public final LaunchActivity f42563a;

    public sa0(LaunchActivity launchActivity) {
        this.f42563a = launchActivity;
    }

    @Override
    public final void onBackInvoked() {
        if (AndroidUtilities.isTablet()) {
            this.f42563a.onBackPressed();
            return;
        }
        if (this.f42563a.c0(true)) {
            LaunchActivity launchActivity = this.f42563a;
            ActionBarLayout actionBarLayout = launchActivity.m0;
            if (actionBarLayout == null) {
                launchActivity.onBackPressed();
            } else if (!actionBarLayout.Y0) {
                actionBarLayout.G();
            } else {
                actionBarLayout.Y0 = false;
                actionBarLayout.e(false);
            }
        }
    }
}
