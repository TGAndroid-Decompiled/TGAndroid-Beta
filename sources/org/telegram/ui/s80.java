package org.telegram.ui;

import android.window.OnBackInvokedCallback;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class s80 implements OnBackInvokedCallback {
    public final LaunchActivity f49421a;

    public s80(LaunchActivity launchActivity) {
        this.f49421a = launchActivity;
    }

    public final void onBackInvoked() {
        if (org.telegram.messenger.g0.Q1()) {
            this.f49421a.onBackPressed();
        } else if (!this.f49421a.d0(true)) {
        } else {
            LaunchActivity launchActivity = this.f49421a;
            ActionBarLayout actionBarLayout = launchActivity.f41314r0;
            if (actionBarLayout != null) {
                if (!actionBarLayout.f27300j1) {
                    actionBarLayout.I();
                    return;
                }
                actionBarLayout.f27300j1 = false;
                actionBarLayout.e(false);
                return;
            }
            launchActivity.onBackPressed();
        }
    }
}
