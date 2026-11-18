package org.telegram.ui;

import android.window.OnBackInvokedCallback;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class w80 implements OnBackInvokedCallback {
    public final LaunchActivity f53008a;

    public w80(LaunchActivity launchActivity) {
        this.f53008a = launchActivity;
    }

    public final void onBackInvoked() {
        if (org.telegram.messenger.g0.Q1()) {
            this.f53008a.onBackPressed();
        } else if (!this.f53008a.d0(true)) {
        } else {
            LaunchActivity launchActivity = this.f53008a;
            ActionBarLayout actionBarLayout = launchActivity.f43094p0;
            if (actionBarLayout != null) {
                if (!actionBarLayout.f28703j1) {
                    actionBarLayout.I();
                    return;
                }
                actionBarLayout.f28703j1 = false;
                actionBarLayout.e(false);
                return;
            }
            launchActivity.onBackPressed();
        }
    }
}
