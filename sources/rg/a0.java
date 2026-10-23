package rg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class a0 extends AnimatorListenerAdapter {
    public final int f45698a;
    public final m0 f45699b;

    public a0(m0 m0Var, int i10) {
        this.f45698a = i10;
        this.f45699b = m0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f45698a) {
            case 0:
                this.f45699b.f45893f2.setTranslationY(0.0f);
                return;
            default:
                m0 m0Var = this.f45699b;
                m0Var.f45899i2 = false;
                m0Var.f45893f2.setTranslationY(0.0f);
                m0Var.m0();
                return;
        }
    }
}
