package qg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class a0 extends AnimatorListenerAdapter {
    public final int f41544a;
    public final m0 f41545b;

    public a0(m0 m0Var, int i10) {
        this.f41544a = i10;
        this.f41545b = m0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f41544a) {
            case 0:
                this.f41545b.f41747f2.setTranslationY(0.0f);
                return;
            default:
                m0 m0Var = this.f41545b;
                m0Var.f41753i2 = false;
                m0Var.f41747f2.setTranslationY(0.0f);
                m0Var.m0();
                return;
        }
    }
}
