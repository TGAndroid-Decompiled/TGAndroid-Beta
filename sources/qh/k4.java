package qh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class k4 extends AnimatorListenerAdapter {
    public final int f45563a;
    public final b5 f45564b;

    public k4(b5 b5Var, int i10) {
        this.f45563a = i10;
        this.f45564b = b5Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f45563a) {
            case 0:
                b5 b5Var = this.f45564b;
                b5Var.Y1 = 0.0f;
                b5Var.W1.setAlpha(1.0f);
                b5Var.W1.setVisibility(8);
                b5Var.W1.n();
                return;
            case 1:
                this.f45564b.f44968m2.setTranslationY(0.0f);
                return;
            default:
                b5 b5Var2 = this.f45564b;
                b5Var2.f44974p2 = false;
                b5Var2.f44968m2.setTranslationY(0.0f);
                b5Var2.w0();
                return;
        }
    }
}
