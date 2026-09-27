package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class vc1 extends AnimatorListenerAdapter {
    public final pd1 f38549a;

    public vc1(pd1 pd1Var) {
        this.f38549a = pd1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        pd1 pd1Var = this.f38549a;
        if (pd1Var.W0 == null) {
            pd1Var.J0[0].setVisibility(4);
        }
    }
}
