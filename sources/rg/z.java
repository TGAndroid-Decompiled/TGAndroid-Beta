package rg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class z extends AnimatorListenerAdapter {
    public final int f45720a;
    public final m0 f45721b;

    public z(m0 m0Var, int i10) {
        this.f45720a = i10;
        this.f45721b = m0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f45720a) {
            case 0:
                this.f45721b.f45476f2.setTranslationY(0.0f);
                return;
            default:
                m0 m0Var = this.f45721b;
                m0Var.f45482i2 = false;
                m0Var.f45476f2.setTranslationY(0.0f);
                m0Var.n0();
                return;
        }
    }
}
