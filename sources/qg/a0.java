package qg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class a0 extends AnimatorListenerAdapter {
    public final int f41602a;
    public final m0 f41603b;

    public a0(m0 m0Var, int i10) {
        this.f41602a = i10;
        this.f41603b = m0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f41602a) {
            case 0:
                this.f41603b.f41805f2.setTranslationY(0.0f);
                return;
            default:
                m0 m0Var = this.f41603b;
                m0Var.f41811i2 = false;
                m0Var.f41805f2.setTranslationY(0.0f);
                m0Var.m0();
                return;
        }
    }
}
