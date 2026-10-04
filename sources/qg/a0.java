package qg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class a0 extends AnimatorListenerAdapter {
    public final int f44951a;
    public final m0 f44952b;

    public a0(m0 m0Var, int i10) {
        this.f44951a = i10;
        this.f44952b = m0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f44951a) {
            case 0:
                this.f44952b.f45166f2.setTranslationY(0.0f);
                return;
            default:
                m0 m0Var = this.f44952b;
                m0Var.f45172i2 = false;
                m0Var.f45166f2.setTranslationY(0.0f);
                m0Var.n0();
                return;
        }
    }
}
