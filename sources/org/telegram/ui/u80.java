package org.telegram.ui;

import android.window.OnBackInvokedCallback;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class u80 implements OnBackInvokedCallback {
    public final LaunchActivity f50315a;

    public u80(LaunchActivity launchActivity) {
        this.f50315a = launchActivity;
    }

    public final void onBackInvoked() {
        if (org.telegram.messenger.g0.Q1()) {
            this.f50315a.onBackPressed();
        } else if (!this.f50315a.d0(true)) {
        } else {
            LaunchActivity launchActivity = this.f50315a;
            ActionBarLayout actionBarLayout = launchActivity.f41251o0;
            if (actionBarLayout != null) {
                if (!actionBarLayout.f27248i1) {
                    actionBarLayout.I();
                    return;
                }
                actionBarLayout.f27248i1 = false;
                actionBarLayout.e(false);
                return;
            }
            launchActivity.onBackPressed();
        }
    }
}
