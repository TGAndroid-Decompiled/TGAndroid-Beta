package rg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class z extends AnimatorListenerAdapter {
    public final int f45726a;
    public final m0 f45727b;

    public z(m0 m0Var, int i10) {
        this.f45726a = i10;
        this.f45727b = m0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f45726a) {
            case 0:
                this.f45727b.f45486f2.setTranslationY(0.0f);
                return;
            default:
                m0 m0Var = this.f45727b;
                m0Var.f45492i2 = false;
                m0Var.f45486f2.setTranslationY(0.0f);
                m0Var.n0();
                return;
        }
    }
}
