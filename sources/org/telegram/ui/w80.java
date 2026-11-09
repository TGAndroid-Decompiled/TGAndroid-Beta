package org.telegram.ui;

import android.window.OnBackInvokedCallback;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class w80 implements OnBackInvokedCallback {
    public final LaunchActivity f50974a;

    public w80(LaunchActivity launchActivity) {
        this.f50974a = launchActivity;
    }

    public final void onBackInvoked() {
        if (org.telegram.messenger.g0.Q1()) {
            this.f50974a.onBackPressed();
        } else if (!this.f50974a.d0(true)) {
        } else {
            LaunchActivity launchActivity = this.f50974a;
            ActionBarLayout actionBarLayout = launchActivity.f41286o0;
            if (actionBarLayout != null) {
                if (!actionBarLayout.f27252i1) {
                    actionBarLayout.I();
                    return;
                }
                actionBarLayout.f27252i1 = false;
                actionBarLayout.e(false);
                return;
            }
            launchActivity.onBackPressed();
        }
    }
}
