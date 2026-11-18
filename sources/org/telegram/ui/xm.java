package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class xm extends AnimatorListenerAdapter {
    public final org.telegram.ui.Components.bb0 f53882a;

    public xm(org.telegram.ui.Components.bb0 bb0Var) {
        this.f53882a = bb0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.f53882a.r(1.0f);
    }
}
