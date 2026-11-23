package org.telegram.ui;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class w80 implements OnBackAnimationCallback {
    public boolean f52982b;
    public boolean f52984e;
    public final LaunchActivity f52985f;
    public final h2.f f52981a = new h2.f((int[]) null);
    public boolean f52983c = false;
    public boolean d = false;

    public w80(LaunchActivity launchActivity) {
        this.f52985f = launchActivity;
    }

    public final void onBackCancelled() {
        ActionBarLayout actionBarLayout;
        this.f52983c = false;
        this.d = false;
        if (this.f52982b) {
            this.f52981a.e();
            this.f52982b = false;
        }
        if (!org.telegram.messenger.g0.Q1() && (actionBarLayout = this.f52985f.f43104p0) != null && actionBarLayout.f28700j1) {
            actionBarLayout.f28700j1 = false;
            actionBarLayout.e(true);
        }
    }

    public final void onBackInvoked() {
        this.d = true;
        if (this.f52982b) {
            this.f52981a.e();
            this.f52982b = false;
        }
        if (org.telegram.messenger.g0.Q1()) {
            this.f52985f.onBackPressed();
        } else if (!this.f52985f.d0(true)) {
        } else {
            LaunchActivity launchActivity = this.f52985f;
            ActionBarLayout actionBarLayout = launchActivity.f43104p0;
            if (actionBarLayout != null) {
                if (!actionBarLayout.f28700j1) {
                    actionBarLayout.I();
                    return;
                }
                actionBarLayout.f28700j1 = false;
                actionBarLayout.e(false);
                return;
            }
            launchActivity.onBackPressed();
        }
    }

    public final void onBackProgressed(BackEvent backEvent) {
        ActionBarLayout actionBarLayout;
        ActionBarLayout actionBarLayout2;
        if (!this.f52983c || !this.d) {
            float progress = backEvent.getProgress();
            boolean z10 = false;
            if (!this.f52984e && progress > 0.015f) {
                this.f52984e = true;
                if (!org.telegram.messenger.g0.Q1() && this.f52985f.d0(false) && (actionBarLayout2 = this.f52985f.f43104p0) != null && actionBarLayout2.J(backEvent.getTouchX(), backEvent.getTouchY()) && !this.f52982b) {
                    this.f52981a.d();
                    this.f52982b = true;
                }
            }
            float max = Math.max(0.0f, progress - 0.015f) / 0.985f;
            if (!org.telegram.messenger.g0.Q1() && (actionBarLayout = this.f52985f.f43104p0) != null && actionBarLayout.f28700j1) {
                float interpolation = org.telegram.ui.Components.nr.f37922l.getInterpolation(max) * org.telegram.messenger.g0.L(56.0f);
                if (max > 0.0f) {
                    z10 = true;
                }
                actionBarLayout.l1 = z10;
                actionBarLayout.f28716s.setTranslationX(interpolation);
                actionBarLayout.setInnerTranslationX(interpolation);
            }
        }
    }

    public final void onBackStarted(BackEvent backEvent) {
        this.f52983c = true;
        this.d = false;
        this.f52984e = false;
    }
}
