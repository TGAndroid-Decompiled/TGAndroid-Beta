package yh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class r3 extends AnimatorListenerAdapter {
    public final int f48054a;
    public final u3 f48055b;

    public r3(u3 u3Var, int i10) {
        this.f48054a = i10;
        this.f48055b = u3Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f48054a) {
            case 0:
                this.f48055b.f48194d0 = false;
                return;
            case 1:
                this.f48055b.f48194d0 = false;
                return;
            case 2:
                this.f48055b.N.setVisibility(4);
                return;
            case 3:
                u3 u3Var = this.f48055b;
                u3Var.f48212s0 = u3Var.f48210r0;
                u3Var.d(u3Var.U);
                return;
            default:
                u3 u3Var2 = this.f48055b;
                u3Var2.f48213t0 = 1.0f;
                u3Var2.f48190b.setScaleX(1.0f);
                u3Var2.f48190b.setScaleY(u3Var2.f48213t0);
                u3Var2.invalidate();
                return;
        }
    }
}
