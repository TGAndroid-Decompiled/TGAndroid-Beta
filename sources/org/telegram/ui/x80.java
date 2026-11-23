package org.telegram.ui;

import android.window.OnBackInvokedCallback;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class x80 implements OnBackInvokedCallback {
    public final LaunchActivity f53708a;

    public x80(LaunchActivity launchActivity) {
        this.f53708a = launchActivity;
    }

    public final void onBackInvoked() {
        if (org.telegram.messenger.g0.Q1()) {
            this.f53708a.onBackPressed();
        } else if (!this.f53708a.d0(true)) {
        } else {
            LaunchActivity launchActivity = this.f53708a;
            ActionBarLayout actionBarLayout = launchActivity.f43104p0;
            if (actionBarLayout != null) {
                if (!actionBarLayout.f28700j1) {
                    actionBarLayout.I();
                    return;
                }
                actionBarLayout.f28700j1 = false;
                actionBarLayout.e(false);
                return;
            }
            launchActivity.onBackPressed();
        }
    }
}
