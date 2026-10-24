package rg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class a0 extends AnimatorListenerAdapter {
    public final int f45697a;
    public final m0 f45698b;

    public a0(m0 m0Var, int i10) {
        this.f45697a = i10;
        this.f45698b = m0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f45697a) {
            case 0:
                this.f45698b.f45892f2.setTranslationY(0.0f);
                return;
            default:
                m0 m0Var = this.f45698b;
                m0Var.f45898i2 = false;
                m0Var.f45892f2.setTranslationY(0.0f);
                m0Var.m0();
                return;
        }
    }
}
