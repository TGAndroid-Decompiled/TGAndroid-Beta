package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class sb1 extends AnimatorListenerAdapter {
    public final mc1 f41083a;

    public sb1(mc1 mc1Var) {
        this.f41083a = mc1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        mc1 mc1Var = this.f41083a;
        if (mc1Var.W0 == null) {
            mc1Var.J0[0].setVisibility(4);
        }
    }
}
