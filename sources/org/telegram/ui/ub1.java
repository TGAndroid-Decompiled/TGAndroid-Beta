package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ub1 extends AnimatorListenerAdapter {
    public final pc1 f42380a;

    public ub1(pc1 pc1Var) {
        this.f42380a = pc1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        char c10;
        pc1 pc1Var = this.f42380a;
        org.telegram.ui.Components.m91[] m91VarArr = pc1Var.K0;
        if (pc1Var.X0 != null) {
            c10 = 0;
        } else {
            c10 = 2;
        }
        m91VarArr[c10].setVisibility(4);
    }
}
