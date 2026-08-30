package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class w51 extends AnimatorListenerAdapter {
    public final int f39339a;
    public final y51 f39340b;

    public w51(y51 y51Var, int i10) {
        this.f39339a = i10;
        this.f39340b = y51Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f39339a) {
            case 0:
                super.onAnimationEnd(animator);
                this.f39340b.F = null;
                return;
            case 1:
                super.onAnimationEnd(animator);
                this.f39340b.F = null;
                return;
            default:
                super.onAnimationEnd(animator);
                y51 y51Var = this.f39340b;
                y51Var.K = 0.0f;
                y51Var.F = null;
                y51Var.J = false;
                y51Var.d(true, false);
                return;
        }
    }
}
