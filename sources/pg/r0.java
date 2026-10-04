package pg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class r0 extends AnimatorListenerAdapter {
    public final int f44578a;
    public final s0 f44579b;

    public r0(s0 s0Var, int i10) {
        this.f44578a = i10;
        this.f44579b = s0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f44578a) {
            case 0:
                s0 s0Var = this.f44579b;
                s0Var.K = null;
                s0Var.f44594f.f(new org.telegram.ui.web.u0(this, 9));
                return;
            default:
                this.f44579b.f44594f.f(new org.telegram.ui.web.u0(this, 10));
                return;
        }
    }
}
