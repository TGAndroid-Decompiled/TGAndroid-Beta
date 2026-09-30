package qg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class b0 extends AnimatorListenerAdapter {
    public final int f41683a;
    public final n0 f41684b;

    public b0(n0 n0Var, int i10) {
        this.f41683a = i10;
        this.f41684b = n0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f41683a) {
            case 0:
                this.f41684b.f41881f2.setTranslationY(0.0f);
                return;
            default:
                n0 n0Var = this.f41684b;
                n0Var.f41887i2 = false;
                n0Var.f41881f2.setTranslationY(0.0f);
                n0Var.m0();
                return;
        }
    }
}
