package org.telegram.ui;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class t80 implements OnBackAnimationCallback {
    public boolean f49973b;
    public boolean f49975e;
    public final LaunchActivity f49976f;
    public final h2.f f49972a = new h2.f((int[]) null);
    public boolean f49974c = false;
    public boolean d = false;

    public t80(LaunchActivity launchActivity) {
        this.f49976f = launchActivity;
    }

    public final void onBackCancelled() {
        ActionBarLayout actionBarLayout;
        this.f49974c = false;
        this.d = false;
        if (this.f49973b) {
            this.f49972a.e();
            this.f49973b = false;
        }
        if (!org.telegram.messenger.g0.Q1() && (actionBarLayout = this.f49976f.f41279o0) != null && actionBarLayout.f27252i1) {
            actionBarLayout.f27252i1 = false;
            actionBarLayout.e(true);
        }
    }

    public final void onBackInvoked() {
        this.d = true;
        if (this.f49973b) {
            this.f49972a.e();
            this.f49973b = false;
        }
        if (org.telegram.messenger.g0.Q1()) {
            this.f49976f.onBackPressed();
        } else if (!this.f49976f.d0(true)) {
        } else {
            LaunchActivity launchActivity = this.f49976f;
            ActionBarLayout actionBarLayout = launchActivity.f41279o0;
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
        if (!this.f49974c || !this.d) {
            float progress = backEvent.getProgress();
            boolean z9 = false;
            if (!this.f49975e && progress > 0.015f) {
                this.f49975e = true;
                if (!org.telegram.messenger.g0.Q1() && this.f49976f.d0(false) && (actionBarLayout2 = this.f49976f.f41279o0) != null && actionBarLayout2.J(backEvent.getTouchX(), backEvent.getTouchY()) && !this.f49973b) {
                    this.f49972a.d();
                    this.f49973b = true;
                }
            }
            float max = Math.max(0.0f, progress - 0.015f) / 0.985f;
            if (!org.telegram.messenger.g0.Q1() && (actionBarLayout = this.f49976f.f41279o0) != null && actionBarLayout.f27252i1) {
                float interpolation = org.telegram.ui.Components.xq.f40371l.getInterpolation(max) * org.telegram.messenger.g0.L(56.0f);
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
        this.f49974c = true;
        this.d = false;
        this.f49975e = false;
    }
}
