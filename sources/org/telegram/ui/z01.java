package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class z01 extends AnimatorListenerAdapter {
    public final int f54314a;
    public final b11 f54315b;

    public z01(b11 b11Var, int i7) {
        this.f54314a = i7;
        this.f54315b = b11Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f54314a) {
            case 0:
                super.onAnimationEnd(animator);
                this.f54315b.J = null;
                return;
            case 1:
                super.onAnimationEnd(animator);
                this.f54315b.J = null;
                return;
            default:
                super.onAnimationEnd(animator);
                b11 b11Var = this.f54315b;
                b11Var.O = 0.0f;
                b11Var.J = null;
                b11Var.N = false;
                b11Var.d(true, false);
                return;
        }
    }
}
