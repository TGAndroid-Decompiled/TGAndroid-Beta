package tg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class z extends AnimatorListenerAdapter {
    public final int f58191a;
    public final g0 f58192b;

    public z(g0 g0Var, int i7) {
        this.f58191a = i7;
        this.f58192b = g0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f58191a) {
            case 0:
                this.f58192b.P1.setTranslationY(0.0f);
                return;
            default:
                g0 g0Var = this.f58192b;
                g0Var.S1 = false;
                g0Var.P1.setTranslationY(0.0f);
                g0Var.l0();
                return;
        }
    }
}
