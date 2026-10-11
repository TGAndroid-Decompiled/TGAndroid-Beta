package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;
public final class za0 extends AnimatorListenerAdapter {
    public final org.telegram.ui.Components.gk0 f44658a;
    public final org.telegram.ui.Components.dk0 f44659b;
    public final boolean f44660c;
    public final LaunchActivity d;

    public za0(LaunchActivity launchActivity, org.telegram.ui.Components.gk0 gk0Var, org.telegram.ui.Components.dk0 dk0Var, boolean z10) {
        this.d = launchActivity;
        this.f44658a = gk0Var;
        this.f44659b = dk0Var;
        this.f44660c = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        LaunchActivity launchActivity = this.d;
        launchActivity.G0 = null;
        launchActivity.f33887z0.invalidate();
        launchActivity.f33865o0.invalidate();
        launchActivity.f33865o0.setImageDrawable(null);
        launchActivity.f33865o0.setVisibility(8);
        launchActivity.f33867p0.setVisibility(8);
        org.telegram.ui.Components.gk0 gk0Var = this.f44658a;
        if (gk0Var != null) {
            gk0Var.setImageDrawable(this.f44659b);
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.themeAccentListUpdated, new Object[0]);
        if (!this.f44660c && gk0Var != null) {
            gk0Var.setVisibility(0);
        }
        sy.f41914w4 = false;
    }
}
