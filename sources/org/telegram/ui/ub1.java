package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ub1 extends AnimatorListenerAdapter {
    public final oc1 f43212a;

    public ub1(oc1 oc1Var) {
        this.f43212a = oc1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        oc1 oc1Var = this.f43212a;
        if (oc1Var.S0 == null) {
            oc1Var.F0[0].setVisibility(4);
        }
    }
}
