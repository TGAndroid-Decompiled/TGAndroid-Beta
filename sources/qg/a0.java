package qg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class a0 extends AnimatorListenerAdapter {
    public final int f46119a;
    public final m0 f46120b;

    public a0(m0 m0Var, int i10) {
        this.f46119a = i10;
        this.f46120b = m0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f46119a) {
            case 0:
                this.f46120b.f46315f2.setTranslationY(0.0f);
                return;
            default:
                m0 m0Var = this.f46120b;
                m0Var.f46321i2 = false;
                m0Var.f46315f2.setTranslationY(0.0f);
                m0Var.n0();
                return;
        }
    }
}
