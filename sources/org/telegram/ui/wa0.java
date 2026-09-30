package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;
public final class wa0 extends AnimatorListenerAdapter {
    public final org.telegram.ui.Components.oj0 f39034a;
    public final org.telegram.ui.Components.lj0 f39035b;
    public final boolean f39036c;
    public final LaunchActivity d;

    public wa0(LaunchActivity launchActivity, org.telegram.ui.Components.oj0 oj0Var, org.telegram.ui.Components.lj0 lj0Var, boolean z10) {
        this.d = launchActivity;
        this.f39034a = oj0Var;
        this.f39035b = lj0Var;
        this.f39036c = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        LaunchActivity launchActivity = this.d;
        launchActivity.G0 = null;
        launchActivity.f31222z0.invalidate();
        launchActivity.f31200o0.invalidate();
        launchActivity.f31200o0.setImageDrawable(null);
        launchActivity.f31200o0.setVisibility(8);
        launchActivity.f31202p0.setVisibility(8);
        org.telegram.ui.Components.oj0 oj0Var = this.f39034a;
        if (oj0Var != null) {
            oj0Var.setImageDrawable(this.f39035b);
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.themeAccentListUpdated, new Object[0]);
        if (!this.f39036c && oj0Var != null) {
            oj0Var.setVisibility(0);
        }
        qy.f37108w4 = false;
    }
}
