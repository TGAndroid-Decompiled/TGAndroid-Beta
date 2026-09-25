package qg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class b0 extends AnimatorListenerAdapter {
    public final int f41585a;
    public final n0 f41586b;

    public b0(n0 n0Var, int i10) {
        this.f41585a = i10;
        this.f41586b = n0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f41585a) {
            case 0:
                this.f41586b.f41781f2.setTranslationY(0.0f);
                return;
            default:
                n0 n0Var = this.f41586b;
                n0Var.f41787i2 = false;
                n0Var.f41781f2.setTranslationY(0.0f);
                n0Var.n0();
                return;
        }
    }
}
