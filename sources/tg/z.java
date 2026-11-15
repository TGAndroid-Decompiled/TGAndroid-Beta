package tg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class z extends AnimatorListenerAdapter {
    public final int f57624a;
    public final g0 f57625b;

    public z(g0 g0Var, int i7) {
        this.f57624a = i7;
        this.f57625b = g0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f57624a) {
            case 0:
                this.f57625b.P1.setTranslationY(0.0f);
                return;
            default:
                g0 g0Var = this.f57625b;
                g0Var.S1 = false;
                g0Var.P1.setTranslationY(0.0f);
                g0Var.l0();
                return;
        }
    }
}
