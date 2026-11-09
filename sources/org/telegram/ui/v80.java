package org.telegram.ui;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class v80 implements OnBackAnimationCallback {
    public boolean f50600b;
    public boolean f50602e;
    public final LaunchActivity f50603f;
    public final h2.f f50599a = new h2.f((int[]) null);
    public boolean f50601c = false;
    public boolean d = false;

    public v80(LaunchActivity launchActivity) {
        this.f50603f = launchActivity;
    }

    public final void onBackCancelled() {
        ActionBarLayout actionBarLayout;
        this.f50601c = false;
        this.d = false;
        if (this.f50600b) {
            this.f50599a.e();
            this.f50600b = false;
        }
        if (!org.telegram.messenger.g0.Q1() && (actionBarLayout = this.f50603f.f41286o0) != null && actionBarLayout.f27252i1) {
            actionBarLayout.f27252i1 = false;
            actionBarLayout.e(true);
        }
    }

    public final void onBackInvoked() {
        this.d = true;
        if (this.f50600b) {
            this.f50599a.e();
            this.f50600b = false;
        }
        if (org.telegram.messenger.g0.Q1()) {
            this.f50603f.onBackPressed();
        } else if (!this.f50603f.d0(true)) {
        } else {
            LaunchActivity launchActivity = this.f50603f;
            ActionBarLayout actionBarLayout = launchActivity.f41286o0;
            if (actionBarLayout != null) {
                if (!actionBarLayout.f27252i1) {
                    actionBarLayout.I();
                    return;
                }
                actionBarLayout.f27252i1 = false;
                actionBarLayout.e(false);
                return;
            }
            launchActivity.onBackPressed();
        }
    }

    public final void onBackProgressed(BackEvent backEvent) {
        ActionBarLayout actionBarLayout;
        ActionBarLayout actionBarLayout2;
        if (!this.f50601c || !this.d) {
            float progress = backEvent.getProgress();
            boolean z9 = false;
            if (!this.f50602e && progress > 0.015f) {
                this.f50602e = true;
                if (!org.telegram.messenger.g0.Q1() && this.f50603f.d0(false) && (actionBarLayout2 = this.f50603f.f41286o0) != null && actionBarLayout2.J(backEvent.getTouchX(), backEvent.getTouchY()) && !this.f50600b) {
                    this.f50599a.d();
                    this.f50600b = true;
                }
            }
            float max = Math.max(0.0f, progress - 0.015f) / 0.985f;
            if (!org.telegram.messenger.g0.Q1() && (actionBarLayout = this.f50603f.f41286o0) != null && actionBarLayout.f27252i1) {
                float interpolation = org.telegram.ui.Components.xq.f40463l.getInterpolation(max) * org.telegram.messenger.g0.L(56.0f);
                if (max > 0.0f) {
                    z9 = true;
                }
                actionBarLayout.f27256k1 = z9;
                actionBarLayout.f27270s.setTranslationX(interpolation);
                actionBarLayout.setInnerTranslationX(interpolation);
            }
        }
    }

    public final void onBackStarted(BackEvent backEvent) {
        this.f50601c = true;
        this.d = false;
        this.f50602e = false;
    }
}
