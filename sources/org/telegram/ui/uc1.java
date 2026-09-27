package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class uc1 extends AnimatorListenerAdapter {
    public final pd1 f38206a;

    public uc1(pd1 pd1Var) {
        this.f38206a = pd1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        char c10;
        pd1 pd1Var = this.f38206a;
        org.telegram.ui.Components.z81[] z81VarArr = pd1Var.J0;
        if (pd1Var.W0 != null) {
            c10 = 0;
        } else {
            c10 = 2;
        }
        z81VarArr[c10].setVisibility(4);
    }
}
