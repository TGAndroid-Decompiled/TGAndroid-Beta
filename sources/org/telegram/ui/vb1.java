package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class vb1 extends AnimatorListenerAdapter {
    public final pc1 f42691a;

    public vb1(pc1 pc1Var) {
        this.f42691a = pc1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        pc1 pc1Var = this.f42691a;
        if (pc1Var.X0 == null) {
            pc1Var.K0[0].setVisibility(4);
        }
    }
}
