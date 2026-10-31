package org.telegram.ui;

import android.window.OnBackInvokedCallback;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class z90 implements OnBackInvokedCallback {
    public final LaunchActivity f44054a;

    public z90(LaunchActivity launchActivity) {
        this.f44054a = launchActivity;
    }

    public final void onBackInvoked() {
        if (org.telegram.messenger.i0.Q1()) {
            this.f44054a.onBackPressed();
        } else if (!this.f44054a.d0(true)) {
        } else {
            LaunchActivity launchActivity = this.f44054a;
            ActionBarLayout actionBarLayout = launchActivity.f33377q0;
            if (actionBarLayout != null) {
                if (!actionBarLayout.f20090i1) {
                    actionBarLayout.H();
                    return;
                }
                actionBarLayout.f20090i1 = false;
                actionBarLayout.e(false);
                return;
            }
            launchActivity.onBackPressed();
        }
    }
}
