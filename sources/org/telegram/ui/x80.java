package org.telegram.ui;

import android.window.OnBackInvokedCallback;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class x80 implements OnBackInvokedCallback {
    public final LaunchActivity f51631a;

    public x80(LaunchActivity launchActivity) {
        this.f51631a = launchActivity;
    }

    public final void onBackInvoked() {
        if (org.telegram.messenger.g0.Q1()) {
            this.f51631a.onBackPressed();
        } else if (!this.f51631a.d0(true)) {
        } else {
            LaunchActivity launchActivity = this.f51631a;
            ActionBarLayout actionBarLayout = launchActivity.f41277o0;
            if (actionBarLayout != null) {
                if (!actionBarLayout.f27256i1) {
                    actionBarLayout.I();
                    return;
                }
                actionBarLayout.f27256i1 = false;
                actionBarLayout.e(false);
                return;
            }
            launchActivity.onBackPressed();
        }
    }
}
