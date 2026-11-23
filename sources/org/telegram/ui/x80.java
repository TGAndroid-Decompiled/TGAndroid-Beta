package org.telegram.ui;

import android.window.OnBackInvokedCallback;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class x80 implements OnBackInvokedCallback {
    public final LaunchActivity f53788a;

    public x80(LaunchActivity launchActivity) {
        this.f53788a = launchActivity;
    }

    public final void onBackInvoked() {
        if (org.telegram.messenger.g0.Q1()) {
            this.f53788a.onBackPressed();
        } else if (!this.f53788a.d0(true)) {
        } else {
            LaunchActivity launchActivity = this.f53788a;
            ActionBarLayout actionBarLayout = launchActivity.f43139p0;
            if (actionBarLayout != null) {
                if (!actionBarLayout.f28734j1) {
                    actionBarLayout.I();
                    return;
                }
                actionBarLayout.f28734j1 = false;
                actionBarLayout.e(false);
                return;
            }
            launchActivity.onBackPressed();
        }
    }
}
