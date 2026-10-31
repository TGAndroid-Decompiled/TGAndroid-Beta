package org.telegram.ui;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class y90 implements OnBackAnimationCallback {
    public boolean f43761b;
    public boolean e;
    public final LaunchActivity f43763f;
    public final e2.f f43760a = new e2.f(null);
    public boolean f43762c = false;
    public boolean d = false;

    public y90(LaunchActivity launchActivity) {
        this.f43763f = launchActivity;
    }

    public final void onBackCancelled() {
        ActionBarLayout actionBarLayout;
        this.f43762c = false;
        this.d = false;
        if (this.f43761b) {
            this.f43760a.e();
            this.f43761b = false;
        }
        if (!org.telegram.messenger.i0.Q1() && (actionBarLayout = this.f43763f.f33377q0) != null && actionBarLayout.f20090i1) {
            actionBarLayout.f20090i1 = false;
            actionBarLayout.e(true);
        }
    }

    public final void onBackInvoked() {
        this.d = true;
        if (this.f43761b) {
            this.f43760a.e();
            this.f43761b = false;
        }
        if (org.telegram.messenger.i0.Q1()) {
            this.f43763f.onBackPressed();
        } else if (!this.f43763f.d0(true)) {
        } else {
            LaunchActivity launchActivity = this.f43763f;
            ActionBarLayout actionBarLayout = launchActivity.f33377q0;
            if (actionBarLayout != null) {
                if (!actionBarLayout.f20090i1) {
                    actionBarLayout.H();
                    return;
                }
                actionBarLayout.f20090i1 = false;
                actionBarLayout.e(false);
                return;
            }
            launchActivity.onBackPressed();
        }
    }

    public final void onBackProgressed(BackEvent backEvent) {
        ActionBarLayout actionBarLayout;
        ActionBarLayout actionBarLayout2;
        if (!this.f43762c || !this.d) {
            float progress = backEvent.getProgress();
            boolean z10 = false;
            if (!this.e && progress > 0.015f) {
                this.e = true;
                if (!org.telegram.messenger.i0.Q1() && this.f43763f.d0(false) && (actionBarLayout2 = this.f43763f.f33377q0) != null && actionBarLayout2.I(backEvent.getTouchX(), backEvent.getTouchY()) && !this.f43761b) {
                    this.f43760a.d();
                    this.f43761b = true;
                }
            }
            float max = Math.max(0.0f, progress - 0.015f) / 0.985f;
            if (!org.telegram.messenger.i0.Q1() && (actionBarLayout = this.f43763f.f33377q0) != null && actionBarLayout.f20090i1) {
                float interpolation = org.telegram.ui.Components.gr.f26500l.getInterpolation(max) * org.telegram.messenger.i0.L(56.0f);
                if (max > 0.0f) {
                    z10 = true;
                }
                actionBarLayout.f20094k1 = z10;
                actionBarLayout.f20109s.setTranslationX(interpolation);
                actionBarLayout.setInnerTranslationX(interpolation);
            }
        }
    }

    public final void onBackStarted(BackEvent backEvent) {
        this.f43762c = true;
        this.d = false;
        this.e = false;
    }
}
