package org.telegram.ui;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class w80 implements OnBackAnimationCallback {
    public boolean f50942b;
    public boolean f50944e;
    public final LaunchActivity f50945f;
    public final h2.f f50941a = new h2.f((int[]) null);
    public boolean f50943c = false;
    public boolean d = false;

    public w80(LaunchActivity launchActivity) {
        this.f50945f = launchActivity;
    }

    public final void onBackCancelled() {
        ActionBarLayout actionBarLayout;
        this.f50943c = false;
        this.d = false;
        if (this.f50942b) {
            this.f50941a.e();
            this.f50942b = false;
        }
        if (!org.telegram.messenger.g0.Q1() && (actionBarLayout = this.f50945f.f41277o0) != null && actionBarLayout.f27256i1) {
            actionBarLayout.f27256i1 = false;
            actionBarLayout.e(true);
        }
    }

    public final void onBackInvoked() {
        this.d = true;
        if (this.f50942b) {
            this.f50941a.e();
            this.f50942b = false;
        }
        if (org.telegram.messenger.g0.Q1()) {
            this.f50945f.onBackPressed();
        } else if (!this.f50945f.d0(true)) {
        } else {
            LaunchActivity launchActivity = this.f50945f;
            ActionBarLayout actionBarLayout = launchActivity.f41277o0;
            if (actionBarLayout != null) {
                if (!actionBarLayout.f27256i1) {
                    actionBarLayout.I();
                    return;
                }
                actionBarLayout.f27256i1 = false;
                actionBarLayout.e(false);
                return;
            }
            launchActivity.onBackPressed();
        }
    }

    public final void onBackProgressed(BackEvent backEvent) {
        ActionBarLayout actionBarLayout;
        ActionBarLayout actionBarLayout2;
        if (!this.f50943c || !this.d) {
            float progress = backEvent.getProgress();
            boolean z9 = false;
            if (!this.f50944e && progress > 0.015f) {
                this.f50944e = true;
                if (!org.telegram.messenger.g0.Q1() && this.f50945f.d0(false) && (actionBarLayout2 = this.f50945f.f41277o0) != null && actionBarLayout2.J(backEvent.getTouchX(), backEvent.getTouchY()) && !this.f50942b) {
                    this.f50941a.d();
                    this.f50942b = true;
                }
            }
            float max = Math.max(0.0f, progress - 0.015f) / 0.985f;
            if (!org.telegram.messenger.g0.Q1() && (actionBarLayout = this.f50945f.f41277o0) != null && actionBarLayout.f27256i1) {
                float interpolation = org.telegram.ui.Components.wq.f40051l.getInterpolation(max) * org.telegram.messenger.g0.L(56.0f);
                if (max > 0.0f) {
                    z9 = true;
                }
                actionBarLayout.f27260k1 = z9;
                actionBarLayout.f27274s.setTranslationX(interpolation);
                actionBarLayout.setInnerTranslationX(interpolation);
            }
        }
    }

    public final void onBackStarted(BackEvent backEvent) {
        this.f50943c = true;
        this.d = false;
        this.f50944e = false;
    }
}
