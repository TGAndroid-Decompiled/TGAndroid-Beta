package tg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class z extends AnimatorListenerAdapter {
    public final int f55920a;
    public final g0 f55921b;

    public z(g0 g0Var, int i7) {
        this.f55920a = i7;
        this.f55921b = g0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f55920a) {
            case 0:
                this.f55921b.O1.setTranslationY(0.0f);
                return;
            default:
                g0 g0Var = this.f55921b;
                g0Var.R1 = false;
                g0Var.O1.setTranslationY(0.0f);
                g0Var.l0();
                return;
        }
    }
}
