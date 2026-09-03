package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;
public final class ta0 extends AnimatorListenerAdapter {
    public final org.telegram.ui.Components.kj0 f41485a;
    public final org.telegram.ui.Components.hj0 f41486b;
    public final boolean f41487c;
    public final LaunchActivity d;

    public ta0(LaunchActivity launchActivity, org.telegram.ui.Components.kj0 kj0Var, org.telegram.ui.Components.hj0 hj0Var, boolean z4) {
        this.d = launchActivity;
        this.f41485a = kj0Var;
        this.f41486b = hj0Var;
        this.f41487c = z4;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        LaunchActivity launchActivity = this.d;
        launchActivity.D0 = null;
        launchActivity.f34178w0.invalidate();
        launchActivity.f34158l0.invalidate();
        launchActivity.f34158l0.setImageDrawable(null);
        launchActivity.f34158l0.setVisibility(8);
        launchActivity.m0.setVisibility(8);
        org.telegram.ui.Components.kj0 kj0Var = this.f41485a;
        if (kj0Var != null) {
            kj0Var.setImageDrawable(this.f41486b);
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.themeAccentListUpdated, new Object[0]);
        if (!this.f41487c && kj0Var != null) {
            kj0Var.setVisibility(0);
        }
        py.f40145u4 = false;
    }
}
