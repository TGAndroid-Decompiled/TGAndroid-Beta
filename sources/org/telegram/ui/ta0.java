package org.telegram.ui;

import android.window.OnBackInvokedCallback;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class ta0 implements OnBackInvokedCallback {
    public final LaunchActivity f43586a;

    public ta0(LaunchActivity launchActivity) {
        this.f43586a = launchActivity;
    }

    public final void onBackInvoked() {
        if (AndroidUtilities.isTablet()) {
            this.f43586a.onBackPressed();
        } else if (!this.f43586a.e0(true)) {
        } else {
            LaunchActivity launchActivity = this.f43586a;
            ActionBarLayout actionBarLayout = launchActivity.f35577q0;
            if (actionBarLayout != null) {
                if (!actionBarLayout.f22325i1) {
                    actionBarLayout.H();
                    return;
                }
                actionBarLayout.f22325i1 = false;
                actionBarLayout.e(false);
                return;
            }
            launchActivity.onBackPressed();
        }
    }
}
