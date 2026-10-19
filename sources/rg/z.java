package rg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class z extends AnimatorListenerAdapter {
    public final int f45715a;
    public final m0 f45716b;

    public z(m0 m0Var, int i10) {
        this.f45715a = i10;
        this.f45716b = m0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f45715a) {
            case 0:
                this.f45716b.f45475f2.setTranslationY(0.0f);
                return;
            default:
                m0 m0Var = this.f45716b;
                m0Var.f45481i2 = false;
                m0Var.f45475f2.setTranslationY(0.0f);
                m0Var.n0();
                return;
        }
    }
}
