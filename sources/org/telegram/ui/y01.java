package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class y01 extends AnimatorListenerAdapter {
    public final int f54145a;
    public final a11 f54146b;

    public y01(a11 a11Var, int i7) {
        this.f54145a = i7;
        this.f54146b = a11Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f54145a) {
            case 0:
                super.onAnimationEnd(animator);
                this.f54146b.J = null;
                return;
            case 1:
                super.onAnimationEnd(animator);
                this.f54146b.J = null;
                return;
            default:
                super.onAnimationEnd(animator);
                a11 a11Var = this.f54146b;
                a11Var.O = 0.0f;
                a11Var.J = null;
                a11Var.N = false;
                a11Var.d(true, false);
                return;
        }
    }
}
