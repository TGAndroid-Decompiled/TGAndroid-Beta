package yh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class u3 extends AnimatorListenerAdapter {
    public final int f47849a;
    public final x3 f47850b;

    public u3(x3 x3Var, int i10) {
        this.f47849a = i10;
        this.f47850b = x3Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f47849a) {
            case 0:
                this.f47850b.f47969d0 = false;
                return;
            case 1:
                this.f47850b.f47969d0 = false;
                return;
            case 2:
                this.f47850b.N.setVisibility(4);
                return;
            case 3:
                x3 x3Var = this.f47850b;
                x3Var.f47987s0 = x3Var.f47985r0;
                x3Var.d(x3Var.U);
                return;
            default:
                x3 x3Var2 = this.f47850b;
                x3Var2.f47988t0 = 1.0f;
                x3Var2.f47965b.setScaleX(1.0f);
                x3Var2.f47965b.setScaleY(x3Var2.f47988t0);
                x3Var2.invalidate();
                return;
        }
    }
}
