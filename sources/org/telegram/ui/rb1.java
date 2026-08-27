package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

public final class rb1 extends AnimatorListenerAdapter {

    public final nc1 f41896a;

    public rb1(nc1 nc1Var) {
        this.f41896a = nc1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        nc1 nc1Var = this.f41896a;
        nc1Var.F0[nc1Var.S0 != null ? (char) 0 : (char) 2].setVisibility(4);
    }
}
