package tg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class z extends AnimatorListenerAdapter {
    public final int f56024a;
    public final g0 f56025b;

    public z(g0 g0Var, int i7) {
        this.f56024a = i7;
        this.f56025b = g0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f56024a) {
            case 0:
                this.f56025b.O1.setTranslationY(0.0f);
                return;
            default:
                g0 g0Var = this.f56025b;
                g0Var.R1 = false;
                g0Var.O1.setTranslationY(0.0f);
                g0Var.l0();
                return;
        }
    }
}
