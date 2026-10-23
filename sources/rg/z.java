package rg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class z extends AnimatorListenerAdapter {
    public final int f45727a;
    public final m0 f45728b;

    public z(m0 m0Var, int i10) {
        this.f45727a = i10;
        this.f45728b = m0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f45727a) {
            case 0:
                this.f45728b.f45487f2.setTranslationY(0.0f);
                return;
            default:
                m0 m0Var = this.f45728b;
                m0Var.f45493i2 = false;
                m0Var.f45487f2.setTranslationY(0.0f);
                m0Var.n0();
                return;
        }
    }
}
