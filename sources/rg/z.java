package rg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class z extends AnimatorListenerAdapter {
    public final int f45723a;
    public final m0 f45724b;

    public z(m0 m0Var, int i10) {
        this.f45723a = i10;
        this.f45724b = m0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f45723a) {
            case 0:
                this.f45724b.f45483f2.setTranslationY(0.0f);
                return;
            default:
                m0 m0Var = this.f45724b;
                m0Var.f45489i2 = false;
                m0Var.f45483f2.setTranslationY(0.0f);
                m0Var.n0();
                return;
        }
    }
}
