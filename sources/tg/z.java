package tg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class z extends AnimatorListenerAdapter {
    public final int f56011a;
    public final g0 f56012b;

    public z(g0 g0Var, int i7) {
        this.f56011a = i7;
        this.f56012b = g0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f56011a) {
            case 0:
                this.f56012b.O1.setTranslationY(0.0f);
                return;
            default:
                g0 g0Var = this.f56012b;
                g0Var.R1 = false;
                g0Var.O1.setTranslationY(0.0f);
                g0Var.l0();
                return;
        }
    }
}
