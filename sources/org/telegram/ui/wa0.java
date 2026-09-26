package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;
public final class wa0 extends AnimatorListenerAdapter {
    public final org.telegram.ui.Components.lj0 f38946a;
    public final org.telegram.ui.Components.ij0 f38947b;
    public final boolean f38948c;
    public final LaunchActivity d;

    public wa0(LaunchActivity launchActivity, org.telegram.ui.Components.lj0 lj0Var, org.telegram.ui.Components.ij0 ij0Var, boolean z10) {
        this.d = launchActivity;
        this.f38946a = lj0Var;
        this.f38947b = ij0Var;
        this.f38948c = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        LaunchActivity launchActivity = this.d;
        launchActivity.G0 = null;
        launchActivity.f31148z0.invalidate();
        launchActivity.f31126o0.invalidate();
        launchActivity.f31126o0.setImageDrawable(null);
        launchActivity.f31126o0.setVisibility(8);
        launchActivity.f31128p0.setVisibility(8);
        org.telegram.ui.Components.lj0 lj0Var = this.f38946a;
        if (lj0Var != null) {
            lj0Var.setImageDrawable(this.f38947b);
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.themeAccentListUpdated, new Object[0]);
        if (!this.f38948c && lj0Var != null) {
            lj0Var.setVisibility(0);
        }
        qy.f37007w4 = false;
    }
}
