package org.telegram.ui;

import android.window.OnBackInvokedCallback;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class sa0 implements OnBackInvokedCallback {
    public final LaunchActivity f41336a;

    public sa0(LaunchActivity launchActivity) {
        this.f41336a = launchActivity;
    }

    public final void onBackInvoked() {
        if (AndroidUtilities.isTablet()) {
            this.f41336a.onBackPressed();
        } else if (!this.f41336a.e0(true)) {
        } else {
            LaunchActivity launchActivity = this.f41336a;
            ActionBarLayout actionBarLayout = launchActivity.f33489q0;
            if (actionBarLayout != null) {
                if (!actionBarLayout.f20635i1) {
                    actionBarLayout.H();
                    return;
                }
                actionBarLayout.f20635i1 = false;
                actionBarLayout.e(false);
                return;
            }
            launchActivity.onBackPressed();
        }
    }
}
