package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;
public final class sa0 extends AnimatorListenerAdapter {
    public final org.telegram.ui.Components.jj0 f38244a;
    public final org.telegram.ui.Components.gj0 f38245b;
    public final boolean f38246c;
    public final LaunchActivity d;

    public sa0(LaunchActivity launchActivity, org.telegram.ui.Components.jj0 jj0Var, org.telegram.ui.Components.gj0 gj0Var, boolean z4) {
        this.d = launchActivity;
        this.f38244a = jj0Var;
        this.f38245b = gj0Var;
        this.f38246c = z4;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        LaunchActivity launchActivity = this.d;
        launchActivity.D0 = null;
        launchActivity.f31656w0.invalidate();
        launchActivity.f31636l0.invalidate();
        launchActivity.f31636l0.setImageDrawable(null);
        launchActivity.f31636l0.setVisibility(8);
        launchActivity.m0.setVisibility(8);
        org.telegram.ui.Components.jj0 jj0Var = this.f38244a;
        if (jj0Var != null) {
            jj0Var.setImageDrawable(this.f38245b);
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.themeAccentListUpdated, new Object[0]);
        if (!this.f38246c && jj0Var != null) {
            jj0Var.setVisibility(0);
        }
        oy.f36999u4 = false;
    }
}
