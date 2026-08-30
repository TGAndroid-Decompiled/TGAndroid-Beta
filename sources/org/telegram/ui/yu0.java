package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class yu0 extends AnimatorListenerAdapter {
    public final int f40578a;
    public final fv0 f40579b;

    public yu0(fv0 fv0Var, int i10) {
        this.f40578a = i10;
        this.f40579b = fv0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f40578a) {
            case 0:
                this.f40579b.O.setTranslationY(0.0f);
                return;
            case 1:
                this.f40579b.O.setTranslationY(0.0f);
                return;
            default:
                fv0 fv0Var = this.f40579b;
                fv0Var.getClass();
                fv0Var.O.setTranslationY(0.0f);
                fv0Var.l0();
                return;
        }
    }
}
