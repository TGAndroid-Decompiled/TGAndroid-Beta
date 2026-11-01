package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class r81 extends AnimatorListenerAdapter {
    public final k91 f41010a;

    public r81(k91 k91Var) {
        this.f41010a = k91Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        k91 k91Var = this.f41010a;
        if (k91Var.X0 == null) {
            k91Var.K0[0].setVisibility(4);
        }
    }
}
