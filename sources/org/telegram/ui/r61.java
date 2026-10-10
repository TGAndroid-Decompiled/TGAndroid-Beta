package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class r61 extends AnimatorListenerAdapter {
    public final int f41330a;
    public final t61 f41331b;

    public r61(t61 t61Var, int i10) {
        this.f41330a = i10;
        this.f41331b = t61Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f41330a) {
            case 0:
                super.onAnimationEnd(animator);
                this.f41331b.I = null;
                return;
            case 1:
                super.onAnimationEnd(animator);
                this.f41331b.I = null;
                return;
            default:
                super.onAnimationEnd(animator);
                t61 t61Var = this.f41331b;
                t61Var.N = 0.0f;
                t61Var.I = null;
                t61Var.M = false;
                t61Var.d(true, false);
                return;
        }
    }
}
