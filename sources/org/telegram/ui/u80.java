package org.telegram.ui;

import android.window.OnBackInvokedCallback;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class u80 implements OnBackInvokedCallback {
    public final LaunchActivity f51826a;

    public u80(LaunchActivity launchActivity) {
        this.f51826a = launchActivity;
    }

    public final void onBackInvoked() {
        if (org.telegram.messenger.g0.Q1()) {
            this.f51826a.onBackPressed();
        } else if (!this.f51826a.d0(true)) {
        } else {
            LaunchActivity launchActivity = this.f51826a;
            ActionBarLayout actionBarLayout = launchActivity.f42649p0;
            if (actionBarLayout != null) {
                if (!actionBarLayout.f28349j1) {
                    actionBarLayout.I();
                    return;
                }
                actionBarLayout.f28349j1 = false;
                actionBarLayout.e(false);
                return;
            }
            launchActivity.onBackPressed();
        }
    }
}
