package qg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class c0 extends AnimatorListenerAdapter {
    public final int f41347a;
    public final p0 f41348b;

    public c0(p0 p0Var, int i10) {
        this.f41347a = i10;
        this.f41348b = p0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f41347a) {
            case 0:
                this.f41348b.f41552f2.setTranslationY(0.0f);
                return;
            default:
                p0 p0Var = this.f41348b;
                p0Var.f41558i2 = false;
                p0Var.f41552f2.setTranslationY(0.0f);
                p0Var.m0();
                return;
        }
    }
}
