package org.telegram.ui;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class t80 implements OnBackAnimationCallback {
    public boolean f51487b;
    public boolean f51489e;
    public final LaunchActivity f51490f;
    public final h2.f f51486a = new h2.f((int[]) null);
    public boolean f51488c = false;
    public boolean d = false;

    public t80(LaunchActivity launchActivity) {
        this.f51490f = launchActivity;
    }

    public final void onBackCancelled() {
        ActionBarLayout actionBarLayout;
        this.f51488c = false;
        this.d = false;
        if (this.f51487b) {
            this.f51486a.e();
            this.f51487b = false;
        }
        if (!org.telegram.messenger.g0.Q1() && (actionBarLayout = this.f51490f.f42649p0) != null && actionBarLayout.f28349j1) {
            actionBarLayout.f28349j1 = false;
            actionBarLayout.e(true);
        }
    }

    public final void onBackInvoked() {
        this.d = true;
        if (this.f51487b) {
            this.f51486a.e();
            this.f51487b = false;
        }
        if (org.telegram.messenger.g0.Q1()) {
            this.f51490f.onBackPressed();
        } else if (!this.f51490f.d0(true)) {
        } else {
            LaunchActivity launchActivity = this.f51490f;
            ActionBarLayout actionBarLayout = launchActivity.f42649p0;
            if (actionBarLayout != null) {
                if (!actionBarLayout.f28349j1) {
                    actionBarLayout.I();
                    return;
                }
                actionBarLayout.f28349j1 = false;
                actionBarLayout.e(false);
                return;
            }
            launchActivity.onBackPressed();
        }
    }

    public final void onBackProgressed(BackEvent backEvent) {
        ActionBarLayout actionBarLayout;
        ActionBarLayout actionBarLayout2;
        if (!this.f51488c || !this.d) {
            float progress = backEvent.getProgress();
            boolean z10 = false;
            if (!this.f51489e && progress > 0.015f) {
                this.f51489e = true;
                if (!org.telegram.messenger.g0.Q1() && this.f51490f.d0(false) && (actionBarLayout2 = this.f51490f.f42649p0) != null && actionBarLayout2.J(backEvent.getTouchX(), backEvent.getTouchY()) && !this.f51487b) {
                    this.f51486a.d();
                    this.f51487b = true;
                }
            }
            float max = Math.max(0.0f, progress - 0.015f) / 0.985f;
            if (!org.telegram.messenger.g0.Q1() && (actionBarLayout = this.f51490f.f42649p0) != null && actionBarLayout.f28349j1) {
                float interpolation = org.telegram.ui.Components.er.f34424l.getInterpolation(max) * org.telegram.messenger.g0.L(56.0f);
                if (max > 0.0f) {
                    z10 = true;
                }
                actionBarLayout.l1 = z10;
                actionBarLayout.f28365s.setTranslationX(interpolation);
                actionBarLayout.setInnerTranslationX(interpolation);
            }
        }
    }

    public final void onBackStarted(BackEvent backEvent) {
        this.f51488c = true;
        this.d = false;
        this.f51489e = false;
    }
}
