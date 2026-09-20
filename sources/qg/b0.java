package qg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class b0 extends AnimatorListenerAdapter {
    public final int f41598a;
    public final n0 f41599b;

    public b0(n0 n0Var, int i10) {
        this.f41598a = i10;
        this.f41599b = n0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f41598a) {
            case 0:
                this.f41599b.f41794f2.setTranslationY(0.0f);
                return;
            default:
                n0 n0Var = this.f41599b;
                n0Var.f41800i2 = false;
                n0Var.f41794f2.setTranslationY(0.0f);
                n0Var.m0();
                return;
        }
    }
}
