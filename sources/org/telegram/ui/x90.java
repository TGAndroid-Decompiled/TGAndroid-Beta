package org.telegram.ui;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class x90 implements OnBackAnimationCallback {
    public boolean f43288b;
    public boolean e;
    public final LaunchActivity f43290f;
    public final e2.f f43287a = new e2.f((int[]) null);
    public boolean f43289c = false;
    public boolean d = false;

    public x90(LaunchActivity launchActivity) {
        this.f43290f = launchActivity;
    }

    public final void onBackCancelled() {
        ActionBarLayout actionBarLayout;
        this.f43289c = false;
        this.d = false;
        if (this.f43288b) {
            this.f43287a.e();
            this.f43288b = false;
        }
        if (!org.telegram.messenger.i0.Q1() && (actionBarLayout = this.f43290f.f33384q0) != null && actionBarLayout.f20091i1) {
            actionBarLayout.f20091i1 = false;
            actionBarLayout.e(true);
        }
    }

    public final void onBackInvoked() {
        this.d = true;
        if (this.f43288b) {
            this.f43287a.e();
            this.f43288b = false;
        }
        if (org.telegram.messenger.i0.Q1()) {
            this.f43290f.onBackPressed();
        } else if (!this.f43290f.d0(true)) {
        } else {
            LaunchActivity launchActivity = this.f43290f;
            ActionBarLayout actionBarLayout = launchActivity.f33384q0;
            if (actionBarLayout != null) {
                if (!actionBarLayout.f20091i1) {
                    actionBarLayout.H();
                    return;
                }
                actionBarLayout.f20091i1 = false;
                actionBarLayout.e(false);
                return;
            }
            launchActivity.onBackPressed();
        }
    }

    public final void onBackProgressed(BackEvent backEvent) {
        ActionBarLayout actionBarLayout;
        ActionBarLayout actionBarLayout2;
        if (!this.f43289c || !this.d) {
            float progress = backEvent.getProgress();
            boolean z10 = false;
            if (!this.e && progress > 0.015f) {
                this.e = true;
                if (!org.telegram.messenger.i0.Q1() && this.f43290f.d0(false) && (actionBarLayout2 = this.f43290f.f33384q0) != null && actionBarLayout2.I(backEvent.getTouchX(), backEvent.getTouchY()) && !this.f43288b) {
                    this.f43287a.d();
                    this.f43288b = true;
                }
            }
            float max = Math.max(0.0f, progress - 0.015f) / 0.985f;
            if (!org.telegram.messenger.i0.Q1() && (actionBarLayout = this.f43290f.f33384q0) != null && actionBarLayout.f20091i1) {
                float interpolation = org.telegram.ui.Components.gr.f26528l.getInterpolation(max) * org.telegram.messenger.i0.L(56.0f);
                if (max > 0.0f) {
                    z10 = true;
                }
                actionBarLayout.f20095k1 = z10;
                actionBarLayout.f20110s.setTranslationX(interpolation);
                actionBarLayout.setInnerTranslationX(interpolation);
            }
        }
    }

    public final void onBackStarted(BackEvent backEvent) {
        this.f43289c = true;
        this.d = false;
        this.e = false;
    }
}
