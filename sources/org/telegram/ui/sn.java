package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class sn extends AnimatorListenerAdapter {
    public final org.telegram.ui.Components.nc0 f37829a;

    public sn(org.telegram.ui.Components.nc0 nc0Var) {
        this.f37829a = nc0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.f37829a.s(1.0f);
    }
}
