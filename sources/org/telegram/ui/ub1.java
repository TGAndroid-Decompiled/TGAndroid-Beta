package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ub1 extends AnimatorListenerAdapter {
    public final qc1 f43222a;

    public ub1(qc1 qc1Var) {
        this.f43222a = qc1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        char c3;
        qc1 qc1Var = this.f43222a;
        org.telegram.ui.Components.a81[] a81VarArr = qc1Var.F0;
        if (qc1Var.S0 != null) {
            c3 = 0;
        } else {
            c3 = 2;
        }
        a81VarArr[c3].setVisibility(4);
    }
}
