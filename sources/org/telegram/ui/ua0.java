package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;
public final class ua0 extends AnimatorListenerAdapter {
    public final org.telegram.ui.Components.jj0 f38725a;
    public final org.telegram.ui.Components.gj0 f38726b;
    public final boolean f38727c;
    public final LaunchActivity d;

    public ua0(LaunchActivity launchActivity, org.telegram.ui.Components.jj0 jj0Var, org.telegram.ui.Components.gj0 gj0Var, boolean z4) {
        this.d = launchActivity;
        this.f38725a = jj0Var;
        this.f38726b = gj0Var;
        this.f38727c = z4;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        LaunchActivity launchActivity = this.d;
        launchActivity.D0 = null;
        launchActivity.f31630w0.invalidate();
        launchActivity.f31610l0.invalidate();
        launchActivity.f31610l0.setImageDrawable(null);
        launchActivity.f31610l0.setVisibility(8);
        launchActivity.m0.setVisibility(8);
        org.telegram.ui.Components.jj0 jj0Var = this.f38725a;
        if (jj0Var != null) {
            jj0Var.setImageDrawable(this.f38726b);
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.themeAccentListUpdated, new Object[0]);
        if (!this.f38727c && jj0Var != null) {
            jj0Var.setVisibility(0);
        }
        qy.f37517u4 = false;
    }
}
