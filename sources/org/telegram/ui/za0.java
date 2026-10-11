package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;
public final class za0 extends AnimatorListenerAdapter {
    public final org.telegram.ui.Components.hk0 f44624a;
    public final org.telegram.ui.Components.ek0 f44625b;
    public final boolean f44626c;
    public final LaunchActivity d;

    public za0(LaunchActivity launchActivity, org.telegram.ui.Components.hk0 hk0Var, org.telegram.ui.Components.ek0 ek0Var, boolean z10) {
        this.d = launchActivity;
        this.f44624a = hk0Var;
        this.f44625b = ek0Var;
        this.f44626c = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        LaunchActivity launchActivity = this.d;
        launchActivity.G0 = null;
        launchActivity.f33853z0.invalidate();
        launchActivity.f33831o0.invalidate();
        launchActivity.f33831o0.setImageDrawable(null);
        launchActivity.f33831o0.setVisibility(8);
        launchActivity.f33833p0.setVisibility(8);
        org.telegram.ui.Components.hk0 hk0Var = this.f44624a;
        if (hk0Var != null) {
            hk0Var.setImageDrawable(this.f44625b);
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.themeAccentListUpdated, new Object[0]);
        if (!this.f44626c && hk0Var != null) {
            hk0Var.setVisibility(0);
        }
        sy.f41880w4 = false;
    }
}
