package tg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class a0 extends AnimatorListenerAdapter {
    public final int f57768a;
    public final h0 f57769b;

    public a0(h0 h0Var, int i7) {
        this.f57768a = i7;
        this.f57769b = h0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f57768a) {
            case 0:
                this.f57769b.P1.setTranslationY(0.0f);
                return;
            default:
                h0 h0Var = this.f57769b;
                h0Var.S1 = false;
                h0Var.P1.setTranslationY(0.0f);
                h0Var.l0();
                return;
        }
    }
}
