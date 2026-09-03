package org.telegram.ui;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class za0 implements OnBackAnimationCallback {
    public boolean f43874b;
    public boolean f43876e;
    public final LaunchActivity f43877f;
    public final AnimationNotificationsLocker f43873a = new AnimationNotificationsLocker();
    public boolean f43875c = false;
    public boolean d = false;

    public za0(LaunchActivity launchActivity) {
        this.f43877f = launchActivity;
    }

    public final void onBackCancelled() {
        ActionBarLayout actionBarLayout;
        this.f43875c = false;
        this.d = false;
        if (this.f43874b) {
            this.f43873a.unlock();
            this.f43874b = false;
        }
        if (!AndroidUtilities.isTablet() && (actionBarLayout = this.f43877f.f34160n0) != null && actionBarLayout.Z0) {
            actionBarLayout.Z0 = false;
            actionBarLayout.e(true);
        }
    }

    public final void onBackInvoked() {
        this.d = true;
        if (this.f43874b) {
            this.f43873a.unlock();
            this.f43874b = false;
        }
        if (AndroidUtilities.isTablet()) {
            this.f43877f.onBackPressed();
        } else if (!this.f43877f.c0(true)) {
        } else {
            LaunchActivity launchActivity = this.f43877f;
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
        this.f43875c = true;
        this.d = false;
        this.f43876e = false;
    }
}
