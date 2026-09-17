package yh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class u3 extends AnimatorListenerAdapter {
    public final int f47872a;
    public final x3 f47873b;

    public u3(x3 x3Var, int i10) {
        this.f47872a = i10;
        this.f47873b = x3Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f47872a) {
            case 0:
                this.f47873b.f47992d0 = false;
                return;
            case 1:
                this.f47873b.f47992d0 = false;
                return;
            case 2:
                this.f47873b.N.setVisibility(4);
                return;
            case 3:
                x3 x3Var = this.f47873b;
                x3Var.f48010s0 = x3Var.f48008r0;
                x3Var.d(x3Var.U);
                return;
            default:
                x3 x3Var2 = this.f47873b;
                x3Var2.f48011t0 = 1.0f;
                x3Var2.f47988b.setScaleX(1.0f);
                x3Var2.f47988b.setScaleY(x3Var2.f48011t0);
                x3Var2.invalidate();
                return;
        }
    }
}
