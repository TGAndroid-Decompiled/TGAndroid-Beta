package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;
public final class wa0 extends AnimatorListenerAdapter {
    public final org.telegram.ui.Components.lj0 f38931a;
    public final org.telegram.ui.Components.ij0 f38932b;
    public final boolean f38933c;
    public final LaunchActivity d;

    public wa0(LaunchActivity launchActivity, org.telegram.ui.Components.lj0 lj0Var, org.telegram.ui.Components.ij0 ij0Var, boolean z10) {
        this.d = launchActivity;
        this.f38931a = lj0Var;
        this.f38932b = ij0Var;
        this.f38933c = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        LaunchActivity launchActivity = this.d;
        launchActivity.G0 = null;
        launchActivity.f31134z0.invalidate();
        launchActivity.f31112o0.invalidate();
        launchActivity.f31112o0.setImageDrawable(null);
        launchActivity.f31112o0.setVisibility(8);
        launchActivity.f31114p0.setVisibility(8);
        org.telegram.ui.Components.lj0 lj0Var = this.f38931a;
        if (lj0Var != null) {
            lj0Var.setImageDrawable(this.f38932b);
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.themeAccentListUpdated, new Object[0]);
        if (!this.f38933c && lj0Var != null) {
            lj0Var.setVisibility(0);
        }
        qy.f36995w4 = false;
    }
}
