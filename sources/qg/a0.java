package qg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class a0 extends AnimatorListenerAdapter {
    public final int f44950a;
    public final m0 f44951b;

    public a0(m0 m0Var, int i10) {
        this.f44950a = i10;
        this.f44951b = m0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f44950a) {
            case 0:
                this.f44951b.f45165f2.setTranslationY(0.0f);
                return;
            default:
                m0 m0Var = this.f44951b;
                m0Var.f45171i2 = false;
                m0Var.f45165f2.setTranslationY(0.0f);
                m0Var.n0();
                return;
        }
    }
}
