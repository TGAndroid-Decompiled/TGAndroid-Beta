package org.telegram.ui;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class t80 implements OnBackAnimationCallback {
    public boolean f51486b;
    public boolean f51488e;
    public final LaunchActivity f51489f;
    public final h2.f f51485a = new h2.f((int[]) null);
    public boolean f51487c = false;
    public boolean d = false;

    public t80(LaunchActivity launchActivity) {
        this.f51489f = launchActivity;
    }

    public final void onBackCancelled() {
        ActionBarLayout actionBarLayout;
        this.f51487c = false;
        this.d = false;
        if (this.f51486b) {
            this.f51485a.e();
            this.f51486b = false;
        }
        if (!org.telegram.messenger.g0.Q1() && (actionBarLayout = this.f51489f.f42649p0) != null && actionBarLayout.f28349j1) {
            actionBarLayout.f28349j1 = false;
            actionBarLayout.e(true);
        }
    }

    public final void onBackInvoked() {
        this.d = true;
        if (this.f51486b) {
            this.f51485a.e();
            this.f51486b = false;
        }
        if (org.telegram.messenger.g0.Q1()) {
            this.f51489f.onBackPressed();
        } else if (!this.f51489f.d0(true)) {
        } else {
            LaunchActivity launchActivity = this.f51489f;
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
        if (!this.f51487c || !this.d) {
            float progress = backEvent.getProgress();
            boolean z10 = false;
            if (!this.f51488e && progress > 0.015f) {
                this.f51488e = true;
                if (!org.telegram.messenger.g0.Q1() && this.f51489f.d0(false) && (actionBarLayout2 = this.f51489f.f42649p0) != null && actionBarLayout2.J(backEvent.getTouchX(), backEvent.getTouchY()) && !this.f51486b) {
                    this.f51485a.d();
                    this.f51486b = true;
                }
            }
            float max = Math.max(0.0f, progress - 0.015f) / 0.985f;
            if (!org.telegram.messenger.g0.Q1() && (actionBarLayout = this.f51489f.f42649p0) != null && actionBarLayout.f28349j1) {
                float interpolation = org.telegram.ui.Components.er.f34425l.getInterpolation(max) * org.telegram.messenger.g0.L(56.0f);
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
        this.f51487c = true;
        this.d = false;
        this.f51488e = false;
    }
}
