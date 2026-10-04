package qg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class a0 extends AnimatorListenerAdapter {
    public final int f44958a;
    public final m0 f44959b;

    public a0(m0 m0Var, int i10) {
        this.f44958a = i10;
        this.f44959b = m0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f44958a) {
            case 0:
                this.f44959b.f45173f2.setTranslationY(0.0f);
                return;
            default:
                m0 m0Var = this.f44959b;
                m0Var.f45179i2 = false;
                m0Var.f45173f2.setTranslationY(0.0f);
                m0Var.n0();
                return;
        }
    }
}
