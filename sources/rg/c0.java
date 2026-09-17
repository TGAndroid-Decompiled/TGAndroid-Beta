package rg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class c0 extends AnimatorListenerAdapter {
    public final int f45168a;
    public final o0 f45169b;

    public c0(o0 o0Var, int i10) {
        this.f45168a = i10;
        this.f45169b = o0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f45168a) {
            case 0:
                this.f45169b.f45377f2.setTranslationY(0.0f);
                return;
            default:
                o0 o0Var = this.f45169b;
                o0Var.f45383i2 = false;
                o0Var.f45377f2.setTranslationY(0.0f);
                o0Var.m0();
                return;
        }
    }
}
