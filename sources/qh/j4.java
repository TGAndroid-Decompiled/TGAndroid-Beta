package qh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class j4 extends AnimatorListenerAdapter {
    public final int f45531a;
    public final a5 f45532b;

    public j4(a5 a5Var, int i10) {
        this.f45531a = i10;
        this.f45532b = a5Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f45531a) {
            case 0:
                a5 a5Var = this.f45532b;
                a5Var.Y1 = 0.0f;
                a5Var.W1.setAlpha(1.0f);
                a5Var.W1.setVisibility(8);
                a5Var.W1.n();
                return;
            case 1:
                this.f45532b.f44945m2.setTranslationY(0.0f);
                return;
            default:
                a5 a5Var2 = this.f45532b;
                a5Var2.f44951p2 = false;
                a5Var2.f44945m2.setTranslationY(0.0f);
                a5Var2.w0();
                return;
        }
    }
}
