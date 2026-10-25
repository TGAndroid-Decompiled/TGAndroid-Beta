package org.telegram.ui;

import android.window.OnBackInvokedCallback;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class ra0 implements OnBackInvokedCallback {
    public final LaunchActivity f43083a;

    public ra0(LaunchActivity launchActivity) {
        this.f43083a = launchActivity;
    }

    public final void onBackInvoked() {
        if (AndroidUtilities.isTablet()) {
            this.f43083a.onBackPressed();
        } else if (!this.f43083a.e0(true)) {
        } else {
            LaunchActivity launchActivity = this.f43083a;
            ActionBarLayout actionBarLayout = launchActivity.f35550q0;
            if (actionBarLayout != null) {
                if (!actionBarLayout.f22322i1) {
                    actionBarLayout.H();
                    return;
                }
                actionBarLayout.f22322i1 = false;
                actionBarLayout.e(false);
                return;
            }
            launchActivity.onBackPressed();
        }
    }
}
