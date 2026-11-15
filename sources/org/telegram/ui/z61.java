package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class z61 extends AnimatorListenerAdapter {
    public final t71 f53894a;

    public z61(t71 t71Var) {
        this.f53894a = t71Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        t71 t71Var = this.f53894a;
        if (t71Var.Y0 == null) {
            t71Var.L0[0].setVisibility(4);
        }
    }
}
