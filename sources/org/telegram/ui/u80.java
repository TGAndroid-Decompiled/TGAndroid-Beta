package org.telegram.ui;

import android.window.OnBackInvokedCallback;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class u80 implements OnBackInvokedCallback {
    public final LaunchActivity f50337a;

    public u80(LaunchActivity launchActivity) {
        this.f50337a = launchActivity;
    }

    public final void onBackInvoked() {
        if (org.telegram.messenger.g0.Q1()) {
            this.f50337a.onBackPressed();
        } else if (!this.f50337a.d0(true)) {
        } else {
            LaunchActivity launchActivity = this.f50337a;
            ActionBarLayout actionBarLayout = launchActivity.f41276o0;
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
