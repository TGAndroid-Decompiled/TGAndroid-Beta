package org.telegram.ui;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class v80 implements OnBackAnimationCallback {
    public boolean f52918b;
    public boolean f52920e;
    public final LaunchActivity f52921f;
    public final h2.f f52917a = new h2.f((int[]) null);
    public boolean f52919c = false;
    public boolean d = false;

    public v80(LaunchActivity launchActivity) {
        this.f52921f = launchActivity;
    }

    public final void onBackCancelled() {
        ActionBarLayout actionBarLayout;
        this.f52919c = false;
        this.d = false;
        if (this.f52918b) {
            this.f52917a.e();
            this.f52918b = false;
        }
        if (!org.telegram.messenger.g0.Q1() && (actionBarLayout = this.f52921f.f43214p0) != null && actionBarLayout.f28792j1) {
            actionBarLayout.f28792j1 = false;
            actionBarLayout.e(true);
        }
    }

    public final void onBackInvoked() {
        this.d = true;
        if (this.f52918b) {
            this.f52917a.e();
            this.f52918b = false;
        }
        if (org.telegram.messenger.g0.Q1()) {
            this.f52921f.onBackPressed();
        } else if (!this.f52921f.d0(true)) {
        } else {
            LaunchActivity launchActivity = this.f52921f;
            ActionBarLayout actionBarLayout = launchActivity.f43214p0;
            if (actionBarLayout != null) {
                if (!actionBarLayout.f28792j1) {
                    actionBarLayout.I();
                    return;
                }
                actionBarLayout.f28792j1 = false;
                actionBarLayout.e(false);
                return;
            }
            launchActivity.onBackPressed();
        }
    }

    public final void onBackProgressed(BackEvent backEvent) {
        ActionBarLayout actionBarLayout;
        ActionBarLayout actionBarLayout2;
        if (!this.f52919c || !this.d) {
            float progress = backEvent.getProgress();
            boolean z10 = false;
            if (!this.f52920e && progress > 0.015f) {
                this.f52920e = true;
                if (!org.telegram.messenger.g0.Q1() && this.f52921f.d0(false) && (actionBarLayout2 = this.f52921f.f43214p0) != null && actionBarLayout2.J(backEvent.getTouchX(), backEvent.getTouchY()) && !this.f52918b) {
                    this.f52917a.d();
                    this.f52918b = true;
                }
            }
            float max = Math.max(0.0f, progress - 0.015f) / 0.985f;
            if (!org.telegram.messenger.g0.Q1() && (actionBarLayout = this.f52921f.f43214p0) != null && actionBarLayout.f28792j1) {
                float interpolation = org.telegram.ui.Components.kr.f36863l.getInterpolation(max) * org.telegram.messenger.g0.L(56.0f);
                if (max > 0.0f) {
                    z10 = true;
                }
                actionBarLayout.l1 = z10;
                actionBarLayout.f28808s.setTranslationX(interpolation);
                actionBarLayout.setInnerTranslationX(interpolation);
            }
        }
    }

    public final void onBackStarted(BackEvent backEvent) {
        this.f52919c = true;
        this.d = false;
        this.f52920e = false;
    }
}
