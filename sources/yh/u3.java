package yh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class u3 extends AnimatorListenerAdapter {
    public final int f47877a;
    public final x3 f47878b;

    public u3(x3 x3Var, int i10) {
        this.f47877a = i10;
        this.f47878b = x3Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f47877a) {
            case 0:
                this.f47878b.f47997d0 = false;
                return;
            case 1:
                this.f47878b.f47997d0 = false;
                return;
            case 2:
                this.f47878b.N.setVisibility(4);
                return;
            case 3:
                x3 x3Var = this.f47878b;
                x3Var.f48015s0 = x3Var.f48013r0;
                x3Var.d(x3Var.U);
                return;
            default:
                x3 x3Var2 = this.f47878b;
                x3Var2.f48016t0 = 1.0f;
                x3Var2.f47993b.setScaleX(1.0f);
                x3Var2.f47993b.setScaleY(x3Var2.f48016t0);
                x3Var2.invalidate();
                return;
        }
    }
}
