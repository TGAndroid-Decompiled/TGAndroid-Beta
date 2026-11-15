package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class v01 extends AnimatorListenerAdapter {
    public final int f52080a;
    public final x01 f52081b;

    public v01(x01 x01Var, int i7) {
        this.f52080a = i7;
        this.f52081b = x01Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f52080a) {
            case 0:
                super.onAnimationEnd(animator);
                this.f52081b.J = null;
                return;
            case 1:
                super.onAnimationEnd(animator);
                this.f52081b.J = null;
                return;
            default:
                super.onAnimationEnd(animator);
                x01 x01Var = this.f52081b;
                x01Var.O = 0.0f;
                x01Var.J = null;
                x01Var.N = false;
                x01Var.d(true, false);
                return;
        }
    }
}
