package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class y61 extends AnimatorListenerAdapter {
    public final int f41755a;
    public final a71 f41756b;

    public y61(a71 a71Var, int i10) {
        this.f41755a = i10;
        this.f41756b = a71Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f41755a) {
            case 0:
                super.onAnimationEnd(animator);
                this.f41756b.I = null;
                return;
            case 1:
                super.onAnimationEnd(animator);
                this.f41756b.I = null;
                return;
            default:
                super.onAnimationEnd(animator);
                a71 a71Var = this.f41756b;
                a71Var.N = 0.0f;
                a71Var.I = null;
                a71Var.M = false;
                a71Var.d(true, false);
                return;
        }
    }
}
