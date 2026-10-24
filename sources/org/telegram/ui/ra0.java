package org.telegram.ui;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class ra0 implements OnBackAnimationCallback {
    public boolean f41077b;
    public boolean e;
    public final LaunchActivity f41079f;
    public final AnimationNotificationsLocker f41076a = new AnimationNotificationsLocker();
    public boolean f41078c = false;
    public boolean d = false;

    public ra0(LaunchActivity launchActivity) {
        this.f41079f = launchActivity;
    }

    public final void onBackCancelled() {
        ActionBarLayout actionBarLayout;
        this.f41078c = false;
        this.d = false;
        if (this.f41077b) {
            this.f41076a.unlock();
            this.f41077b = false;
        }
        if (!AndroidUtilities.isTablet() && (actionBarLayout = this.f41079f.f33489q0) != null && actionBarLayout.f20635i1) {
            actionBarLayout.f20635i1 = false;
            actionBarLayout.e(true);
        }
    }

    public final void onBackInvoked() {
        this.d = true;
        if (this.f41077b) {
            this.f41076a.unlock();
            this.f41077b = false;
        }
        if (AndroidUtilities.isTablet()) {
            this.f41079f.onBackPressed();
        } else if (!this.f41079f.e0(true)) {
        } else {
            LaunchActivity launchActivity = this.f41079f;
            ActionBarLayout actionBarLayout = launchActivity.f33489q0;
            if (actionBarLayout != null) {
                if (!actionBarLayout.f20635i1) {
                    actionBarLayout.H();
                    return;
                }
                actionBarLayout.f20635i1 = false;
                actionBarLayout.e(false);
                return;
            }
            launchActivity.onBackPressed();
        }
    }

    public final void onBackProgressed(android.window.BackEvent r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ra0.onBackProgressed(android.window.BackEvent):void");
    }

    public final void onBackStarted(BackEvent backEvent) {
        this.f41078c = true;
        this.d = false;
        this.e = false;
    }
}
