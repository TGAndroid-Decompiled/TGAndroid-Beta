package org.telegram.ui;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class t80 implements OnBackAnimationCallback {
    public boolean f49984b;
    public boolean f49986e;
    public final LaunchActivity f49987f;
    public final h2.f f49983a = new h2.f((int[]) null);
    public boolean f49985c = false;
    public boolean d = false;

    public t80(LaunchActivity launchActivity) {
        this.f49987f = launchActivity;
    }

    public final void onBackCancelled() {
        ActionBarLayout actionBarLayout;
        this.f49985c = false;
        this.d = false;
        if (this.f49984b) {
            this.f49983a.e();
            this.f49984b = false;
        }
        if (!org.telegram.messenger.g0.Q1() && (actionBarLayout = this.f49987f.f41275o0) != null && actionBarLayout.f27249i1) {
            actionBarLayout.f27249i1 = false;
            actionBarLayout.e(true);
        }
    }

    public final void onBackInvoked() {
        this.d = true;
        if (this.f49984b) {
            this.f49983a.e();
            this.f49984b = false;
        }
        if (org.telegram.messenger.g0.Q1()) {
            this.f49987f.onBackPressed();
        } else if (!this.f49987f.d0(true)) {
        } else {
            LaunchActivity launchActivity = this.f49987f;
            ActionBarLayout actionBarLayout = launchActivity.f41275o0;
            if (actionBarLayout != null) {
                if (!actionBarLayout.f27249i1) {
                    actionBarLayout.I();
                    return;
                }
                actionBarLayout.f27249i1 = false;
                actionBarLayout.e(false);
                return;
            }
            launchActivity.onBackPressed();
        }
    }

    public final void onBackProgressed(BackEvent backEvent) {
        ActionBarLayout actionBarLayout;
        ActionBarLayout actionBarLayout2;
        if (!this.f49985c || !this.d) {
            float progress = backEvent.getProgress();
            boolean z9 = false;
            if (!this.f49986e && progress > 0.015f) {
                this.f49986e = true;
                if (!org.telegram.messenger.g0.Q1() && this.f49987f.d0(false) && (actionBarLayout2 = this.f49987f.f41275o0) != null && actionBarLayout2.J(backEvent.getTouchX(), backEvent.getTouchY()) && !this.f49984b) {
                    this.f49983a.d();
                    this.f49984b = true;
                }
            }
            float max = Math.max(0.0f, progress - 0.015f) / 0.985f;
            if (!org.telegram.messenger.g0.Q1() && (actionBarLayout = this.f49987f.f41275o0) != null && actionBarLayout.f27249i1) {
                float interpolation = org.telegram.ui.Components.xq.f40350l.getInterpolation(max) * org.telegram.messenger.g0.L(56.0f);
                if (max > 0.0f) {
                    z9 = true;
                }
                actionBarLayout.f27253k1 = z9;
                actionBarLayout.f27267s.setTranslationX(interpolation);
                actionBarLayout.setInnerTranslationX(interpolation);
            }
        }
    }

    public final void onBackStarted(BackEvent backEvent) {
        this.f49985c = true;
        this.d = false;
        this.f49986e = false;
    }
}
