package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;
public final class wa0 extends AnimatorListenerAdapter {
    public final org.telegram.ui.Components.mj0 f38945a;
    public final org.telegram.ui.Components.jj0 f38946b;
    public final boolean f38947c;
    public final LaunchActivity d;

    public wa0(LaunchActivity launchActivity, org.telegram.ui.Components.mj0 mj0Var, org.telegram.ui.Components.jj0 jj0Var, boolean z10) {
        this.d = launchActivity;
        this.f38945a = mj0Var;
        this.f38946b = jj0Var;
        this.f38947c = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        LaunchActivity launchActivity = this.d;
        launchActivity.G0 = null;
        launchActivity.f31147z0.invalidate();
        launchActivity.f31125o0.invalidate();
        launchActivity.f31125o0.setImageDrawable(null);
        launchActivity.f31125o0.setVisibility(8);
        launchActivity.f31127p0.setVisibility(8);
        org.telegram.ui.Components.mj0 mj0Var = this.f38945a;
        if (mj0Var != null) {
            mj0Var.setImageDrawable(this.f38946b);
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.themeAccentListUpdated, new Object[0]);
        if (!this.f38947c && mj0Var != null) {
            mj0Var.setVisibility(0);
        }
        qy.f37006w4 = false;
    }
}
