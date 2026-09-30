package qg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class b0 extends AnimatorListenerAdapter {
    public final int f41586a;
    public final n0 f41587b;

    public b0(n0 n0Var, int i10) {
        this.f41586a = i10;
        this.f41587b = n0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f41586a) {
            case 0:
                this.f41587b.f41782f2.setTranslationY(0.0f);
                return;
            default:
                n0 n0Var = this.f41587b;
                n0Var.f41788i2 = false;
                n0Var.f41782f2.setTranslationY(0.0f);
                n0Var.n0();
                return;
        }
    }
}
