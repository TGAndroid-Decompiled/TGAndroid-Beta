package org.telegram.ui;

import android.window.OnBackInvokedCallback;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class za0 implements OnBackInvokedCallback {
    public final LaunchActivity f40745a;

    public za0(LaunchActivity launchActivity) {
        this.f40745a = launchActivity;
    }

    public final void onBackInvoked() {
        if (AndroidUtilities.isTablet()) {
            this.f40745a.onBackPressed();
        } else if (!this.f40745a.c0(true)) {
        } else {
            LaunchActivity launchActivity = this.f40745a;
            ActionBarLayout actionBarLayout = launchActivity.f31638n0;
            if (actionBarLayout != null) {
                if (!actionBarLayout.Z0) {
                    actionBarLayout.G();
                    return;
                }
                actionBarLayout.Z0 = false;
                actionBarLayout.e(false);
                return;
            }
            launchActivity.onBackPressed();
        }
    }
}
