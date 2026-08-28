package yf;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class z extends AnimatorListenerAdapter {
    public final int f50195a;
    public final l0 f50196b;

    public z(l0 l0Var, int i9) {
        this.f50195a = i9;
        this.f50196b = l0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f50195a) {
            case 0:
                this.f50196b.f49929b2.setTranslationY(0.0f);
                return;
            default:
                l0 l0Var = this.f50196b;
                l0Var.f49935e2 = false;
                l0Var.f49929b2.setTranslationY(0.0f);
                l0Var.m0();
                return;
        }
    }
}
