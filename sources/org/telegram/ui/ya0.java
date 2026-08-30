package org.telegram.ui;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class ya0 implements OnBackAnimationCallback {
    public boolean f40460b;
    public boolean e;
    public final LaunchActivity f40462f;
    public final AnimationNotificationsLocker f40459a = new AnimationNotificationsLocker();
    public boolean f40461c = false;
    public boolean d = false;

    public ya0(LaunchActivity launchActivity) {
        this.f40462f = launchActivity;
    }

    public final void onBackCancelled() {
        ActionBarLayout actionBarLayout;
        this.f40461c = false;
        this.d = false;
        if (this.f40460b) {
            this.f40459a.unlock();
            this.f40460b = false;
        }
        if (!AndroidUtilities.isTablet() && (actionBarLayout = this.f40462f.f31638n0) != null && actionBarLayout.Z0) {
            actionBarLayout.Z0 = false;
            actionBarLayout.e(true);
        }
    }

    public final void onBackInvoked() {
        this.d = true;
        if (this.f40460b) {
            this.f40459a.unlock();
            this.f40460b = false;
        }
        if (AndroidUtilities.isTablet()) {
            this.f40462f.onBackPressed();
        } else if (!this.f40462f.c0(true)) {
        } else {
            LaunchActivity launchActivity = this.f40462f;
            ActionBarLayout actionBarLayout = launchActivity.f31638n0;
            if (actionBarLayout != null) {
                if (!actionBarLayout.Z0) {
                    actionBarLayout.G();
                    return;
                }
                actionBarLayout.Z0 = false;
                actionBarLayout.e(false);
                return;
            }
            launchActivity.onBackPressed();
        }
    }

    public final void onBackProgressed(android.window.BackEvent r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ya0.onBackProgressed(android.window.BackEvent):void");
    }

    public final void onBackStarted(BackEvent backEvent) {
        this.f40461c = true;
        this.d = false;
        this.e = false;
    }
}
