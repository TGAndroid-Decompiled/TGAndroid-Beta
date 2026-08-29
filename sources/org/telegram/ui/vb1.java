package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class vb1 extends AnimatorListenerAdapter {
    public final qc1 f43501a;

    public vb1(qc1 qc1Var) {
        this.f43501a = qc1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        qc1 qc1Var = this.f43501a;
        if (qc1Var.S0 == null) {
            qc1Var.F0[0].setVisibility(4);
        }
    }
}
