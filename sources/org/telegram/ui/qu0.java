package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class qu0 extends AnimatorListenerAdapter {
    public final int f42201a;
    public final xu0 f42202b;

    public qu0(xu0 xu0Var, int i9) {
        this.f42201a = i9;
        this.f42202b = xu0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f42201a) {
            case 0:
                this.f42202b.N.setTranslationY(0.0f);
                return;
            case 1:
                this.f42202b.N.setTranslationY(0.0f);
                return;
            default:
                xu0 xu0Var = this.f42202b;
                xu0Var.getClass();
                xu0Var.N.setTranslationY(0.0f);
                xu0Var.k0();
                return;
        }
    }
}
