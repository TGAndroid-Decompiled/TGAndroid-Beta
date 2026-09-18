package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class wn extends AnimatorListenerAdapter {
    public final org.telegram.ui.Components.lc0 f39193a;

    public wn(org.telegram.ui.Components.lc0 lc0Var) {
        this.f39193a = lc0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.f39193a.s(1.0f);
    }
}
