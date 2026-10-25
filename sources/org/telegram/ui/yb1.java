package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class yb1 extends AnimatorListenerAdapter {
    public final tc1 f46022a;

    public yb1(tc1 tc1Var) {
        this.f46022a = tc1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        tc1 tc1Var = this.f46022a;
        if (tc1Var.X0 == null) {
            tc1Var.K0[0].setVisibility(4);
        }
    }
}
