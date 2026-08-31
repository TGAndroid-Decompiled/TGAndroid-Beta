package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;
public final class ta0 extends AnimatorListenerAdapter {
    public final org.telegram.ui.Components.lj0 f41557a;
    public final org.telegram.ui.Components.ij0 f41558b;
    public final boolean f41559c;
    public final LaunchActivity d;

    public ta0(LaunchActivity launchActivity, org.telegram.ui.Components.lj0 lj0Var, org.telegram.ui.Components.ij0 ij0Var, boolean z4) {
        this.d = launchActivity;
        this.f41557a = lj0Var;
        this.f41558b = ij0Var;
        this.f41559c = z4;
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
        org.telegram.ui.Components.lj0 lj0Var = this.f41557a;
        if (lj0Var != null) {
            lj0Var.setImageDrawable(this.f41558b);
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.themeAccentListUpdated, new Object[0]);
        if (!this.f41559c && lj0Var != null) {
            lj0Var.setVisibility(0);
        }
        py.f40175u4 = false;
    }
}
