package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;
public final class xa0 extends AnimatorListenerAdapter {
    public final org.telegram.ui.Components.bj0 f39231a;
    public final org.telegram.ui.Components.yi0 f39232b;
    public final boolean f39233c;
    public final LaunchActivity d;

    public xa0(LaunchActivity launchActivity, org.telegram.ui.Components.bj0 bj0Var, org.telegram.ui.Components.yi0 yi0Var, boolean z10) {
        this.d = launchActivity;
        this.f39231a = bj0Var;
        this.f39232b = yi0Var;
        this.f39233c = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        LaunchActivity launchActivity = this.d;
        launchActivity.G0 = null;
        launchActivity.f30833z0.invalidate();
        launchActivity.f30811o0.invalidate();
        launchActivity.f30811o0.setImageDrawable(null);
        launchActivity.f30811o0.setVisibility(8);
        launchActivity.f30813p0.setVisibility(8);
        org.telegram.ui.Components.bj0 bj0Var = this.f39231a;
        if (bj0Var != null) {
            bj0Var.setImageDrawable(this.f39232b);
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.themeAccentListUpdated, new Object[0]);
        if (!this.f39233c && bj0Var != null) {
            bj0Var.setVisibility(0);
        }
        ry.f36952w4 = false;
    }
}
