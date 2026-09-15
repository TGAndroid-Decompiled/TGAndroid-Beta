package qg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class c0 extends AnimatorListenerAdapter {
    public final int f41320a;
    public final p0 f41321b;

    public c0(p0 p0Var, int i10) {
        this.f41320a = i10;
        this.f41321b = p0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f41320a) {
            case 0:
                this.f41321b.f41525f2.setTranslationY(0.0f);
                return;
            default:
                p0 p0Var = this.f41321b;
                p0Var.f41531i2 = false;
                p0Var.f41525f2.setTranslationY(0.0f);
                p0Var.m0();
                return;
        }
    }
}
