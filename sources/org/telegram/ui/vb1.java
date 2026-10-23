package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class vb1 extends AnimatorListenerAdapter {
    public final qc1 f42723a;

    public vb1(qc1 qc1Var) {
        this.f42723a = qc1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        char c10;
        qc1 qc1Var = this.f42723a;
        org.telegram.ui.Components.m91[] m91VarArr = qc1Var.K0;
        if (qc1Var.X0 != null) {
            c10 = 0;
        } else {
            c10 = 2;
        }
        m91VarArr[c10].setVisibility(4);
    }
}
