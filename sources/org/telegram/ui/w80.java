package org.telegram.ui;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class w80 implements OnBackAnimationCallback {
    public boolean f53015b;
    public boolean f53017e;
    public final LaunchActivity f53018f;
    public final h2.f f53014a = new h2.f((int[]) null);
    public boolean f53016c = false;
    public boolean d = false;

    public w80(LaunchActivity launchActivity) {
        this.f53018f = launchActivity;
    }

    public final void onBackCancelled() {
        ActionBarLayout actionBarLayout;
        this.f53016c = false;
        this.d = false;
        if (this.f53015b) {
            this.f53014a.e();
            this.f53015b = false;
        }
        if (!org.telegram.messenger.g0.Q1() && (actionBarLayout = this.f53018f.f43135p0) != null && actionBarLayout.f28731j1) {
            actionBarLayout.f28731j1 = false;
            actionBarLayout.e(true);
        }
    }

    public final void onBackInvoked() {
        this.d = true;
        if (this.f53015b) {
            this.f53014a.e();
            this.f53015b = false;
        }
        if (org.telegram.messenger.g0.Q1()) {
            this.f53018f.onBackPressed();
        } else if (!this.f53018f.d0(true)) {
        } else {
            LaunchActivity launchActivity = this.f53018f;
            ActionBarLayout actionBarLayout = launchActivity.f43135p0;
            if (actionBarLayout != null) {
                if (!actionBarLayout.f28731j1) {
                    actionBarLayout.I();
                    return;
                }
                actionBarLayout.f28731j1 = false;
                actionBarLayout.e(false);
                return;
            }
            launchActivity.onBackPressed();
        }
    }

    public final void onBackProgressed(BackEvent backEvent) {
        ActionBarLayout actionBarLayout;
        ActionBarLayout actionBarLayout2;
        if (!this.f53016c || !this.d) {
            float progress = backEvent.getProgress();
            boolean z10 = false;
            if (!this.f53017e && progress > 0.015f) {
                this.f53017e = true;
                if (!org.telegram.messenger.g0.Q1() && this.f53018f.d0(false) && (actionBarLayout2 = this.f53018f.f43135p0) != null && actionBarLayout2.J(backEvent.getTouchX(), backEvent.getTouchY()) && !this.f53015b) {
                    this.f53014a.d();
                    this.f53015b = true;
                }
            }
            float max = Math.max(0.0f, progress - 0.015f) / 0.985f;
            if (!org.telegram.messenger.g0.Q1() && (actionBarLayout = this.f53018f.f43135p0) != null && actionBarLayout.f28731j1) {
                float interpolation = org.telegram.ui.Components.nr.f37961l.getInterpolation(max) * org.telegram.messenger.g0.L(56.0f);
                if (max > 0.0f) {
                    z10 = true;
                }
                actionBarLayout.l1 = z10;
                actionBarLayout.f28747s.setTranslationX(interpolation);
                actionBarLayout.setInnerTranslationX(interpolation);
            }
        }
    }

    public final void onBackStarted(BackEvent backEvent) {
        this.f53016c = true;
        this.d = false;
        this.f53017e = false;
    }
}
