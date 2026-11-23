package org.telegram.ui;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class w80 implements OnBackAnimationCallback {
    public boolean f53019b;
    public boolean f53021e;
    public final LaunchActivity f53022f;
    public final h2.f f53018a = new h2.f((int[]) null);
    public boolean f53020c = false;
    public boolean d = false;

    public w80(LaunchActivity launchActivity) {
        this.f53022f = launchActivity;
    }

    public final void onBackCancelled() {
        ActionBarLayout actionBarLayout;
        this.f53020c = false;
        this.d = false;
        if (this.f53019b) {
            this.f53018a.e();
            this.f53019b = false;
        }
        if (!org.telegram.messenger.g0.Q1() && (actionBarLayout = this.f53022f.f43139p0) != null && actionBarLayout.f28734j1) {
            actionBarLayout.f28734j1 = false;
            actionBarLayout.e(true);
        }
    }

    public final void onBackInvoked() {
        this.d = true;
        if (this.f53019b) {
            this.f53018a.e();
            this.f53019b = false;
        }
        if (org.telegram.messenger.g0.Q1()) {
            this.f53022f.onBackPressed();
        } else if (!this.f53022f.d0(true)) {
        } else {
            LaunchActivity launchActivity = this.f53022f;
            ActionBarLayout actionBarLayout = launchActivity.f43139p0;
            if (actionBarLayout != null) {
                if (!actionBarLayout.f28734j1) {
                    actionBarLayout.I();
                    return;
                }
                actionBarLayout.f28734j1 = false;
                actionBarLayout.e(false);
                return;
            }
            launchActivity.onBackPressed();
        }
    }

    public final void onBackProgressed(BackEvent backEvent) {
        ActionBarLayout actionBarLayout;
        ActionBarLayout actionBarLayout2;
        if (!this.f53020c || !this.d) {
            float progress = backEvent.getProgress();
            boolean z10 = false;
            if (!this.f53021e && progress > 0.015f) {
                this.f53021e = true;
                if (!org.telegram.messenger.g0.Q1() && this.f53022f.d0(false) && (actionBarLayout2 = this.f53022f.f43139p0) != null && actionBarLayout2.J(backEvent.getTouchX(), backEvent.getTouchY()) && !this.f53019b) {
                    this.f53018a.d();
                    this.f53019b = true;
                }
            }
            float max = Math.max(0.0f, progress - 0.015f) / 0.985f;
            if (!org.telegram.messenger.g0.Q1() && (actionBarLayout = this.f53022f.f43139p0) != null && actionBarLayout.f28734j1) {
                float interpolation = org.telegram.ui.Components.nr.f37966l.getInterpolation(max) * org.telegram.messenger.g0.L(56.0f);
                if (max > 0.0f) {
                    z10 = true;
                }
                actionBarLayout.l1 = z10;
                actionBarLayout.f28750s.setTranslationX(interpolation);
                actionBarLayout.setInnerTranslationX(interpolation);
            }
        }
    }

    public final void onBackStarted(BackEvent backEvent) {
        this.f53020c = true;
        this.d = false;
        this.f53021e = false;
    }
}
