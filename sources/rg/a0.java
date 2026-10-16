package rg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class a0 extends AnimatorListenerAdapter {
    public final int f43944a;
    public final o0 f43945b;

    public a0(o0 o0Var, int i10) {
        this.f43944a = i10;
        this.f43945b = o0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f43944a) {
            case 0:
                this.f43945b.f44169f2.setTranslationY(0.0f);
                return;
            default:
                o0 o0Var = this.f43945b;
                o0Var.f44175i2 = false;
                o0Var.f44169f2.setTranslationY(0.0f);
                o0Var.n0();
                return;
        }
    }
}
