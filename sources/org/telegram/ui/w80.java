package org.telegram.ui;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class w80 implements OnBackAnimationCallback {
    public boolean f52969b;
    public boolean f52971e;
    public final LaunchActivity f52972f;
    public final h2.f f52968a = new h2.f((int[]) null);
    public boolean f52970c = false;
    public boolean d = false;

    public w80(LaunchActivity launchActivity) {
        this.f52972f = launchActivity;
    }

    public final void onBackCancelled() {
        ActionBarLayout actionBarLayout;
        this.f52970c = false;
        this.d = false;
        if (this.f52969b) {
            this.f52968a.e();
            this.f52969b = false;
        }
        if (!org.telegram.messenger.g0.Q1() && (actionBarLayout = this.f52972f.f43094p0) != null && actionBarLayout.f28701j1) {
            actionBarLayout.f28701j1 = false;
            actionBarLayout.e(true);
        }
    }

    public final void onBackInvoked() {
        this.d = true;
        if (this.f52969b) {
            this.f52968a.e();
            this.f52969b = false;
        }
        if (org.telegram.messenger.g0.Q1()) {
            this.f52972f.onBackPressed();
        } else if (!this.f52972f.d0(true)) {
        } else {
            LaunchActivity launchActivity = this.f52972f;
            ActionBarLayout actionBarLayout = launchActivity.f43094p0;
            if (actionBarLayout != null) {
                if (!actionBarLayout.f28701j1) {
                    actionBarLayout.I();
                    return;
                }
                actionBarLayout.f28701j1 = false;
                actionBarLayout.e(false);
                return;
            }
            launchActivity.onBackPressed();
        }
    }

    public final void onBackProgressed(BackEvent backEvent) {
        ActionBarLayout actionBarLayout;
        ActionBarLayout actionBarLayout2;
        if (!this.f52970c || !this.d) {
            float progress = backEvent.getProgress();
            boolean z10 = false;
            if (!this.f52971e && progress > 0.015f) {
                this.f52971e = true;
                if (!org.telegram.messenger.g0.Q1() && this.f52972f.d0(false) && (actionBarLayout2 = this.f52972f.f43094p0) != null && actionBarLayout2.J(backEvent.getTouchX(), backEvent.getTouchY()) && !this.f52969b) {
                    this.f52968a.d();
                    this.f52969b = true;
                }
            }
            float max = Math.max(0.0f, progress - 0.015f) / 0.985f;
            if (!org.telegram.messenger.g0.Q1() && (actionBarLayout = this.f52972f.f43094p0) != null && actionBarLayout.f28701j1) {
                float interpolation = org.telegram.ui.Components.lr.f37213l.getInterpolation(max) * org.telegram.messenger.g0.L(56.0f);
                if (max > 0.0f) {
                    z10 = true;
                }
                actionBarLayout.l1 = z10;
                actionBarLayout.f28717s.setTranslationX(interpolation);
                actionBarLayout.setInnerTranslationX(interpolation);
            }
        }
    }

    public final void onBackStarted(BackEvent backEvent) {
        this.f52970c = true;
        this.d = false;
        this.f52971e = false;
    }
}
