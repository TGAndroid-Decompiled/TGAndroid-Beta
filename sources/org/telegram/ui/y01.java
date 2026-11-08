package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class y01 extends AnimatorListenerAdapter {
    public final int f52030a;
    public final a11 f52031b;

    public y01(a11 a11Var, int i7) {
        this.f52030a = i7;
        this.f52031b = a11Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f52030a) {
            case 0:
                super.onAnimationEnd(animator);
                this.f52031b.I = null;
                return;
            case 1:
                super.onAnimationEnd(animator);
                this.f52031b.I = null;
                return;
            default:
                super.onAnimationEnd(animator);
                a11 a11Var = this.f52031b;
                a11Var.N = 0.0f;
                a11Var.I = null;
                a11Var.M = false;
                a11Var.d(true, false);
                return;
        }
    }
}
