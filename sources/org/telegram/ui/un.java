package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class un extends AnimatorListenerAdapter {
    public final org.telegram.ui.Components.nc0 f38283a;

    public un(org.telegram.ui.Components.nc0 nc0Var) {
        this.f38283a = nc0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.f38283a.s(1.0f);
    }
}
