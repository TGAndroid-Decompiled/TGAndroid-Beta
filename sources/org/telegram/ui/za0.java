package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;
public final class za0 extends AnimatorListenerAdapter {
    public final org.telegram.ui.Components.nj0 f40453a;
    public final org.telegram.ui.Components.kj0 f40454b;
    public final boolean f40455c;
    public final LaunchActivity d;

    public za0(LaunchActivity launchActivity, org.telegram.ui.Components.nj0 nj0Var, org.telegram.ui.Components.kj0 kj0Var, boolean z10) {
        this.d = launchActivity;
        this.f40453a = nj0Var;
        this.f40454b = kj0Var;
        this.f40455c = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        LaunchActivity launchActivity = this.d;
        launchActivity.G0 = null;
        launchActivity.f31150z0.invalidate();
        launchActivity.f31128o0.invalidate();
        launchActivity.f31128o0.setImageDrawable(null);
        launchActivity.f31128o0.setVisibility(8);
        launchActivity.f31130p0.setVisibility(8);
        org.telegram.ui.Components.nj0 nj0Var = this.f40453a;
        if (nj0Var != null) {
            nj0Var.setImageDrawable(this.f40454b);
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.themeAccentListUpdated, new Object[0]);
        if (!this.f40455c && nj0Var != null) {
            nj0Var.setVisibility(0);
        }
        ty.f37950v4 = false;
    }
}
