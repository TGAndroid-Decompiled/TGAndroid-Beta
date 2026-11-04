package org.telegram.ui;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class r80 implements OnBackAnimationCallback {
    public boolean f49131b;
    public boolean f49133e;
    public final LaunchActivity f49134f;
    public final g2.g f49130a = new g2.g((int[]) null);
    public boolean f49132c = false;
    public boolean d = false;

    public r80(LaunchActivity launchActivity) {
        this.f49134f = launchActivity;
    }

    public final void onBackCancelled() {
        ActionBarLayout actionBarLayout;
        this.f49132c = false;
        this.d = false;
        if (this.f49131b) {
            this.f49130a.e();
            this.f49131b = false;
        }
        if (!org.telegram.messenger.g0.Q1() && (actionBarLayout = this.f49134f.f41314r0) != null && actionBarLayout.f27300j1) {
            actionBarLayout.f27300j1 = false;
            actionBarLayout.e(true);
        }
    }

    public final void onBackInvoked() {
        this.d = true;
        if (this.f49131b) {
            this.f49130a.e();
            this.f49131b = false;
        }
        if (org.telegram.messenger.g0.Q1()) {
            this.f49134f.onBackPressed();
        } else if (!this.f49134f.d0(true)) {
        } else {
            LaunchActivity launchActivity = this.f49134f;
            ActionBarLayout actionBarLayout = launchActivity.f41314r0;
            if (actionBarLayout != null) {
                if (!actionBarLayout.f27300j1) {
                    actionBarLayout.I();
                    return;
                }
                actionBarLayout.f27300j1 = false;
                actionBarLayout.e(false);
                return;
            }
            launchActivity.onBackPressed();
        }
    }

    public final void onBackProgressed(BackEvent backEvent) {
        ActionBarLayout actionBarLayout;
        ActionBarLayout actionBarLayout2;
        if (!this.f49132c || !this.d) {
            float progress = backEvent.getProgress();
            boolean z10 = false;
            if (!this.f49133e && progress > 0.015f) {
                this.f49133e = true;
                if (!org.telegram.messenger.g0.Q1() && this.f49134f.d0(false) && (actionBarLayout2 = this.f49134f.f41314r0) != null && actionBarLayout2.J(backEvent.getTouchX(), backEvent.getTouchY()) && !this.f49131b) {
                    this.f49130a.d();
                    this.f49131b = true;
                }
            }
            float max = Math.max(0.0f, progress - 0.015f) / 0.985f;
            if (!org.telegram.messenger.g0.Q1() && (actionBarLayout = this.f49134f.f41314r0) != null && actionBarLayout.f27300j1) {
                float interpolation = org.telegram.ui.Components.xq.f40457l.getInterpolation(max) * org.telegram.messenger.g0.L(56.0f);
                if (max > 0.0f) {
                    z10 = true;
                }
                actionBarLayout.f27303l1 = z10;
                actionBarLayout.f27316s.setTranslationX(interpolation);
                actionBarLayout.setInnerTranslationX(interpolation);
            }
        }
    }

    public final void onBackStarted(BackEvent backEvent) {
        this.f49132c = true;
        this.d = false;
        this.f49133e = false;
    }
}
