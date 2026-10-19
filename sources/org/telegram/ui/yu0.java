package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class yu0 extends AnimatorListenerAdapter {
    public final int f43553a;
    public final fv0 f43554b;

    public yu0(fv0 fv0Var, int i10) {
        this.f43553a = i10;
        this.f43554b = fv0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f43553a) {
            case 0:
                this.f43554b.R.setTranslationY(0.0f);
                return;
            case 1:
                this.f43554b.R.setTranslationY(0.0f);
                return;
            default:
                fv0 fv0Var = this.f43554b;
                fv0Var.getClass();
                fv0Var.R.setTranslationY(0.0f);
                fv0Var.l0();
                return;
        }
    }
}
