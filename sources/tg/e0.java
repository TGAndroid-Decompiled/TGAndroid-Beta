package tg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class e0 extends AnimatorListenerAdapter {
    public final int f57885a;
    public final l0 f57886b;

    public e0(l0 l0Var, int i7) {
        this.f57885a = i7;
        this.f57886b = l0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f57885a) {
            case 0:
                this.f57886b.T1.setTranslationY(0.0f);
                return;
            default:
                l0 l0Var = this.f57886b;
                l0Var.W1 = false;
                l0Var.T1.setTranslationY(0.0f);
                l0Var.o0();
                return;
        }
    }
}
