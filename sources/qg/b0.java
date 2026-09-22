package qg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class b0 extends AnimatorListenerAdapter {
    public final int f41619a;
    public final n0 f41620b;

    public b0(n0 n0Var, int i10) {
        this.f41619a = i10;
        this.f41620b = n0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f41619a) {
            case 0:
                this.f41620b.f41815f2.setTranslationY(0.0f);
                return;
            default:
                n0 n0Var = this.f41620b;
                n0Var.f41821i2 = false;
                n0Var.f41815f2.setTranslationY(0.0f);
                n0Var.m0();
                return;
        }
    }
}
