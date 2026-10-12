package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class u61 extends AnimatorListenerAdapter {
    public final int f42378a;
    public final w61 f42379b;

    public u61(w61 w61Var, int i10) {
        this.f42378a = i10;
        this.f42379b = w61Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f42378a) {
            case 0:
                super.onAnimationEnd(animator);
                this.f42379b.I = null;
                return;
            case 1:
                super.onAnimationEnd(animator);
                this.f42379b.I = null;
                return;
            default:
                super.onAnimationEnd(animator);
                w61 w61Var = this.f42379b;
                w61Var.N = 0.0f;
                w61Var.I = null;
                w61Var.M = false;
                w61Var.d(true, false);
                return;
        }
    }
}
