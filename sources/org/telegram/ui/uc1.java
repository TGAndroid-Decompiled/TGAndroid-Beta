package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class uc1 extends AnimatorListenerAdapter {
    public final pd1 f41200a;

    public uc1(pd1 pd1Var) {
        this.f41200a = pd1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        char c10;
        pd1 pd1Var = this.f41200a;
        org.telegram.ui.Components.i91[] i91VarArr = pd1Var.J0;
        if (pd1Var.W0 != null) {
            c10 = 0;
        } else {
            c10 = 2;
        }
        i91VarArr[c10].setVisibility(4);
    }
}
