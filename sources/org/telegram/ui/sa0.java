package org.telegram.ui;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class sa0 implements OnBackAnimationCallback {
    public boolean f43282b;
    public boolean e;
    public final LaunchActivity f43284f;
    public final AnimationNotificationsLocker f43281a = new AnimationNotificationsLocker();
    public boolean f43283c = false;
    public boolean d = false;

    public sa0(LaunchActivity launchActivity) {
        this.f43284f = launchActivity;
    }

    public final void onBackCancelled() {
        ActionBarLayout actionBarLayout;
        this.f43283c = false;
        this.d = false;
        if (this.f43282b) {
            this.f43281a.unlock();
            this.f43282b = false;
        }
        if (!AndroidUtilities.isTablet() && (actionBarLayout = this.f43284f.f35577q0) != null && actionBarLayout.f22325i1) {
            actionBarLayout.f22325i1 = false;
            actionBarLayout.e(true);
        }
    }

    public final void onBackInvoked() {
        this.d = true;
        if (this.f43282b) {
            this.f43281a.unlock();
            this.f43282b = false;
        }
        if (AndroidUtilities.isTablet()) {
            this.f43284f.onBackPressed();
        } else if (!this.f43284f.e0(true)) {
        } else {
            LaunchActivity launchActivity = this.f43284f;
            ActionBarLayout actionBarLayout = launchActivity.f35577q0;
            if (actionBarLayout != null) {
                if (!actionBarLayout.f22325i1) {
                    actionBarLayout.H();
                    return;
                }
                actionBarLayout.f22325i1 = false;
                actionBarLayout.e(false);
                return;
            }
            launchActivity.onBackPressed();
        }
    }

    public final void onBackProgressed(BackEvent backEvent) {
        ActionBarLayout actionBarLayout;
        ActionBarLayout actionBarLayout2;
        if (!this.f43283c || !this.d) {
            float progress = backEvent.getProgress();
            boolean z10 = false;
            if (!this.e && progress > 0.015f) {
                this.e = true;
                if (!AndroidUtilities.isTablet() && this.f43284f.e0(false) && (actionBarLayout2 = this.f43284f.f35577q0) != null && actionBarLayout2.I(backEvent.getTouchX(), backEvent.getTouchY()) && !this.f43282b) {
                    this.f43281a.lock();
                    this.f43282b = true;
                }
            }
            float max = Math.max(0.0f, progress - 0.015f) / 0.985f;
            if (!AndroidUtilities.isTablet() && (actionBarLayout = this.f43284f.f35577q0) != null && actionBarLayout.f22325i1) {
                float interpolation = org.telegram.ui.Components.ds.f27535l.getInterpolation(max) * AndroidUtilities.dp(56.0f);
                if (max > 0.0f) {
                    z10 = true;
                }
                actionBarLayout.f22329k1 = z10;
                actionBarLayout.f22344s.setTranslationX(interpolation);
                actionBarLayout.setInnerTranslationX(interpolation);
            }
        }
    }

    public final void onBackStarted(BackEvent backEvent) {
        this.f43283c = true;
        this.d = false;
        this.e = false;
    }
}
