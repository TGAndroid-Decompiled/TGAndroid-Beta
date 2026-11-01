package org.telegram.ui;

import android.window.OnBackInvokedCallback;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class y90 implements OnBackInvokedCallback {
    public final LaunchActivity f43609a;

    public y90(LaunchActivity launchActivity) {
        this.f43609a = launchActivity;
    }

    public final void onBackInvoked() {
        if (org.telegram.messenger.i0.Q1()) {
            this.f43609a.onBackPressed();
        } else if (!this.f43609a.d0(true)) {
        } else {
            LaunchActivity launchActivity = this.f43609a;
            ActionBarLayout actionBarLayout = launchActivity.f33384q0;
            if (actionBarLayout != null) {
                if (!actionBarLayout.f20091i1) {
                    actionBarLayout.H();
                    return;
                }
                actionBarLayout.f20091i1 = false;
                actionBarLayout.e(false);
                return;
            }
            launchActivity.onBackPressed();
        }
    }
}
