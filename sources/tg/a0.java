package tg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class a0 extends AnimatorListenerAdapter {
    public final int f57733a;
    public final h0 f57734b;

    public a0(h0 h0Var, int i7) {
        this.f57733a = i7;
        this.f57734b = h0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f57733a) {
            case 0:
                this.f57734b.P1.setTranslationY(0.0f);
                return;
            default:
                h0 h0Var = this.f57734b;
                h0Var.S1 = false;
                h0Var.P1.setTranslationY(0.0f);
                h0Var.l0();
                return;
        }
    }
}
