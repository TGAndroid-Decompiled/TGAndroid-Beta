package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ud1 extends AnimatorListenerAdapter {
    public final int f38917a;
    public final yd1 f38918b;

    public ud1(yd1 yd1Var, int i10) {
        this.f38917a = i10;
        this.f38918b = yd1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f38917a) {
            case 0:
                yd1 yd1Var = this.f38918b;
                yd1Var.v = 0;
                yd1Var.f40496n.setVisibility(8);
                return;
            case 1:
                this.f38918b.v = 0;
                return;
            default:
                this.f38918b.C.setVisibility(8);
                return;
        }
    }
}
