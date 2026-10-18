package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class sb1 extends AnimatorListenerAdapter {
    public final mc1 f41045a;

    public sb1(mc1 mc1Var) {
        this.f41045a = mc1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        mc1 mc1Var = this.f41045a;
        if (mc1Var.W0 == null) {
            mc1Var.J0[0].setVisibility(4);
        }
    }
}
