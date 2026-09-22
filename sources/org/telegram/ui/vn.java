package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class vn extends AnimatorListenerAdapter {
    public final org.telegram.ui.Components.nc0 f38598a;

    public vn(org.telegram.ui.Components.nc0 nc0Var) {
        this.f38598a = nc0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.f38598a.s(1.0f);
    }
}
