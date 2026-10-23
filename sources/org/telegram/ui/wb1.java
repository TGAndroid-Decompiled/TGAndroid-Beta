package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class wb1 extends AnimatorListenerAdapter {
    public final qc1 f43000a;

    public wb1(qc1 qc1Var) {
        this.f43000a = qc1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        qc1 qc1Var = this.f43000a;
        if (qc1Var.X0 == null) {
            qc1Var.K0[0].setVisibility(4);
        }
    }
}
