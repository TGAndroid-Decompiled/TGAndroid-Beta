package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class s61 extends AnimatorListenerAdapter {
    public final int f36562a;
    public final u61 f36563b;

    public s61(u61 u61Var, int i10) {
        this.f36562a = i10;
        this.f36563b = u61Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f36562a) {
            case 0:
                super.onAnimationEnd(animator);
                this.f36563b.I = null;
                return;
            case 1:
                super.onAnimationEnd(animator);
                this.f36563b.I = null;
                return;
            default:
                super.onAnimationEnd(animator);
                u61 u61Var = this.f36563b;
                u61Var.N = 0.0f;
                u61Var.I = null;
                u61Var.M = false;
                u61Var.d(true, false);
                return;
        }
    }
}
