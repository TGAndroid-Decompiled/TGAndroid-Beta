package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class uc1 extends AnimatorListenerAdapter {
    public final od1 f38411a;

    public uc1(od1 od1Var) {
        this.f38411a = od1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        od1 od1Var = this.f38411a;
        if (od1Var.W0 == null) {
            od1Var.J0[0].setVisibility(4);
        }
    }
}
