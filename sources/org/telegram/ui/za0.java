package org.telegram.ui;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class za0 implements OnBackAnimationCallback {
    public boolean f43877b;
    public boolean f43879e;
    public final LaunchActivity f43880f;
    public final AnimationNotificationsLocker f43876a = new AnimationNotificationsLocker();
    public boolean f43878c = false;
    public boolean d = false;

    public za0(LaunchActivity launchActivity) {
        this.f43880f = launchActivity;
    }

    public final void onBackCancelled() {
        ActionBarLayout actionBarLayout;
        this.f43878c = false;
        this.d = false;
        if (this.f43877b) {
            this.f43876a.unlock();
            this.f43877b = false;
        }
        if (!AndroidUtilities.isTablet() && (actionBarLayout = this.f43880f.f34160n0) != null && actionBarLayout.Z0) {
            actionBarLayout.Z0 = false;
            actionBarLayout.e(true);
        }
    }

    public final void onBackInvoked() {
        this.d = true;
        if (this.f43877b) {
            this.f43876a.unlock();
            this.f43877b = false;
        }
        if (AndroidUtilities.isTablet()) {
            this.f43880f.onBackPressed();
        } else if (!this.f43880f.c0(true)) {
        } else {
            LaunchActivity launchActivity = this.f43880f;
            ActionBarLayout actionBarLayout = launchActivity.f34160n0;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.za0.onBackProgressed(android.window.BackEvent):void");
    }

    public final void onBackStarted(BackEvent backEvent) {
        this.f43878c = true;
        this.d = false;
        this.f43879e = false;
    }
}
