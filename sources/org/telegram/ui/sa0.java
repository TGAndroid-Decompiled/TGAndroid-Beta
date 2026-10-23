package org.telegram.ui;

import android.window.OnBackInvokedCallback;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class sa0 implements OnBackInvokedCallback {
    public final LaunchActivity f41341a;

    public sa0(LaunchActivity launchActivity) {
        this.f41341a = launchActivity;
    }

    public final void onBackInvoked() {
        if (AndroidUtilities.isTablet()) {
            this.f41341a.onBackPressed();
        } else if (!this.f41341a.e0(true)) {
        } else {
            LaunchActivity launchActivity = this.f41341a;
            ActionBarLayout actionBarLayout = launchActivity.f33487q0;
            if (actionBarLayout != null) {
                if (!actionBarLayout.f20634i1) {
                    actionBarLayout.H();
                    return;
                }
                actionBarLayout.f20634i1 = false;
                actionBarLayout.e(false);
                return;
            }
            launchActivity.onBackPressed();
        }
    }
}
