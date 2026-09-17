package rg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class c0 extends AnimatorListenerAdapter {
    public final int f45140a;
    public final o0 f45141b;

    public c0(o0 o0Var, int i10) {
        this.f45140a = i10;
        this.f45141b = o0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f45140a) {
            case 0:
                this.f45141b.f45349f2.setTranslationY(0.0f);
                return;
            default:
                o0 o0Var = this.f45141b;
                o0Var.f45355i2 = false;
                o0Var.f45349f2.setTranslationY(0.0f);
                o0Var.m0();
                return;
        }
    }
}
