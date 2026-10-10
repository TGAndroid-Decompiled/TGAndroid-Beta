package qg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class a0 extends AnimatorListenerAdapter {
    public final int f46218a;
    public final m0 f46219b;

    public a0(m0 m0Var, int i10) {
        this.f46218a = i10;
        this.f46219b = m0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f46218a) {
            case 0:
                this.f46219b.f46414f2.setTranslationY(0.0f);
                return;
            default:
                m0 m0Var = this.f46219b;
                m0Var.f46420i2 = false;
                m0Var.f46414f2.setTranslationY(0.0f);
                m0Var.n0();
                return;
        }
    }
}
