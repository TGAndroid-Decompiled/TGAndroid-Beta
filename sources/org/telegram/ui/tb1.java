package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class tb1 extends AnimatorListenerAdapter {
    public final oc1 f42945a;

    public tb1(oc1 oc1Var) {
        this.f42945a = oc1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        char c10;
        oc1 oc1Var = this.f42945a;
        org.telegram.ui.Components.o71[] o71VarArr = oc1Var.F0;
        if (oc1Var.S0 != null) {
            c10 = 0;
        } else {
            c10 = 2;
        }
        o71VarArr[c10].setVisibility(4);
    }
}
