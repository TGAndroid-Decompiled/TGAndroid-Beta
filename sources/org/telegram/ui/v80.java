package org.telegram.ui;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class v80 implements OnBackAnimationCallback {
    public boolean f52727b;
    public boolean f52729e;
    public final LaunchActivity f52730f;
    public final h2.f f52726a = new h2.f((int[]) null);
    public boolean f52728c = false;
    public boolean d = false;

    public v80(LaunchActivity launchActivity) {
        this.f52730f = launchActivity;
    }

    public final void onBackCancelled() {
        ActionBarLayout actionBarLayout;
        this.f52728c = false;
        this.d = false;
        if (this.f52727b) {
            this.f52726a.e();
            this.f52727b = false;
        }
        if (!org.telegram.messenger.g0.Q1() && (actionBarLayout = this.f52730f.f43094p0) != null && actionBarLayout.f28703j1) {
            actionBarLayout.f28703j1 = false;
            actionBarLayout.e(true);
        }
    }

    public final void onBackInvoked() {
        this.d = true;
        if (this.f52727b) {
            this.f52726a.e();
            this.f52727b = false;
        }
        if (org.telegram.messenger.g0.Q1()) {
            this.f52730f.onBackPressed();
        } else if (!this.f52730f.d0(true)) {
        } else {
            LaunchActivity launchActivity = this.f52730f;
            ActionBarLayout actionBarLayout = launchActivity.f43094p0;
            if (actionBarLayout != null) {
                if (!actionBarLayout.f28703j1) {
                    actionBarLayout.I();
                    return;
                }
                actionBarLayout.f28703j1 = false;
                actionBarLayout.e(false);
                return;
            }
            launchActivity.onBackPressed();
        }
    }

    public final void onBackProgressed(BackEvent backEvent) {
        ActionBarLayout actionBarLayout;
        ActionBarLayout actionBarLayout2;
        if (!this.f52728c || !this.d) {
            float progress = backEvent.getProgress();
            boolean z10 = false;
            if (!this.f52729e && progress > 0.015f) {
                this.f52729e = true;
                if (!org.telegram.messenger.g0.Q1() && this.f52730f.d0(false) && (actionBarLayout2 = this.f52730f.f43094p0) != null && actionBarLayout2.J(backEvent.getTouchX(), backEvent.getTouchY()) && !this.f52727b) {
                    this.f52726a.d();
                    this.f52727b = true;
                }
            }
            float max = Math.max(0.0f, progress - 0.015f) / 0.985f;
            if (!org.telegram.messenger.g0.Q1() && (actionBarLayout = this.f52730f.f43094p0) != null && actionBarLayout.f28703j1) {
                float interpolation = org.telegram.ui.Components.lr.f37213l.getInterpolation(max) * org.telegram.messenger.g0.L(56.0f);
                if (max > 0.0f) {
                    z10 = true;
                }
                actionBarLayout.l1 = z10;
                actionBarLayout.f28719s.setTranslationX(interpolation);
                actionBarLayout.setInnerTranslationX(interpolation);
            }
        }
    }

    public final void onBackStarted(BackEvent backEvent) {
        this.f52728c = true;
        this.d = false;
        this.f52729e = false;
    }
}
