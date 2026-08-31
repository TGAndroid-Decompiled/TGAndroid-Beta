package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class y51 extends AnimatorListenerAdapter {
    public final int f43564a;
    public final a61 f43565b;

    public y51(a61 a61Var, int i10) {
        this.f43564a = i10;
        this.f43565b = a61Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f43564a) {
            case 0:
                super.onAnimationEnd(animator);
                this.f43565b.F = null;
                return;
            case 1:
                super.onAnimationEnd(animator);
                this.f43565b.F = null;
                return;
            default:
                super.onAnimationEnd(animator);
                a61 a61Var = this.f43565b;
                a61Var.K = 0.0f;
                a61Var.F = null;
                a61Var.J = false;
                a61Var.d(true, false);
                return;
        }
    }
}
