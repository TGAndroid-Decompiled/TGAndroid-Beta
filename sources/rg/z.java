package rg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class z extends AnimatorListenerAdapter {
    public final int f45713a;
    public final m0 f45714b;

    public z(m0 m0Var, int i10) {
        this.f45713a = i10;
        this.f45714b = m0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f45713a) {
            case 0:
                this.f45714b.f45473f2.setTranslationY(0.0f);
                return;
            default:
                m0 m0Var = this.f45714b;
                m0Var.f45479i2 = false;
                m0Var.f45473f2.setTranslationY(0.0f);
                m0Var.n0();
                return;
        }
    }
}
