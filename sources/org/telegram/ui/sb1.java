package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

public final class sb1 extends AnimatorListenerAdapter {

    public final nc1 f42572a;

    public sb1(nc1 nc1Var) {
        this.f42572a = nc1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        nc1 nc1Var = this.f42572a;
        if (nc1Var.S0 == null) {
            nc1Var.F0[0].setVisibility(4);
        }
    }
}
