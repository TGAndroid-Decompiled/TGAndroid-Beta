package rg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class c0 extends AnimatorListenerAdapter {
    public final int f45139a;
    public final o0 f45140b;

    public c0(o0 o0Var, int i10) {
        this.f45139a = i10;
        this.f45140b = o0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f45139a) {
            case 0:
                this.f45140b.f45348f2.setTranslationY(0.0f);
                return;
            default:
                o0 o0Var = this.f45140b;
                o0Var.f45354i2 = false;
                o0Var.f45348f2.setTranslationY(0.0f);
                o0Var.m0();
                return;
        }
    }
}
