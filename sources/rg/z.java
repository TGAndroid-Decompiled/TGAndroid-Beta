package rg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class z extends AnimatorListenerAdapter {
    public final int f45748a;
    public final m0 f45749b;

    public z(m0 m0Var, int i10) {
        this.f45748a = i10;
        this.f45749b = m0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f45748a) {
            case 0:
                this.f45749b.f45502f2.setTranslationY(0.0f);
                return;
            default:
                m0 m0Var = this.f45749b;
                m0Var.f45508i2 = false;
                m0Var.f45502f2.setTranslationY(0.0f);
                m0Var.n0();
                return;
        }
    }
}
