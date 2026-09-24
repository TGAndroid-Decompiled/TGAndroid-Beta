package qg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class b0 extends AnimatorListenerAdapter {
    public final int f41570a;
    public final n0 f41571b;

    public b0(n0 n0Var, int i10) {
        this.f41570a = i10;
        this.f41571b = n0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f41570a) {
            case 0:
                this.f41571b.f41766f2.setTranslationY(0.0f);
                return;
            default:
                n0 n0Var = this.f41571b;
                n0Var.f41772i2 = false;
                n0Var.f41766f2.setTranslationY(0.0f);
                n0Var.n0();
                return;
        }
    }
}
