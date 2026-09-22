package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class wn extends AnimatorListenerAdapter {
    public final org.telegram.ui.Components.nc0 f39207a;

    public wn(org.telegram.ui.Components.nc0 nc0Var) {
        this.f39207a = nc0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.f39207a.s(1.0f);
    }
}
