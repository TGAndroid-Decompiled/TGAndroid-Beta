package ug;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class y extends AnimatorListenerAdapter {
    public final int f56313a;
    public final f0 f56314b;

    public y(f0 f0Var, int i3) {
        this.f56313a = i3;
        this.f56314b = f0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f56313a) {
            case 0:
                this.f56314b.P1.setTranslationY(0.0f);
                return;
            default:
                f0 f0Var = this.f56314b;
                f0Var.S1 = false;
                f0Var.P1.setTranslationY(0.0f);
                f0Var.l0();
                return;
        }
    }
}
