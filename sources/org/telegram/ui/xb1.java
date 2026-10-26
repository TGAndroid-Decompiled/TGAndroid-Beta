package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class xb1 extends AnimatorListenerAdapter {
    public final tc1 f45721a;

    public xb1(tc1 tc1Var) {
        this.f45721a = tc1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        char c10;
        tc1 tc1Var = this.f45721a;
        org.telegram.ui.Components.v91[] v91VarArr = tc1Var.K0;
        if (tc1Var.X0 != null) {
            c10 = 0;
        } else {
            c10 = 2;
        }
        v91VarArr[c10].setVisibility(4);
    }
}
