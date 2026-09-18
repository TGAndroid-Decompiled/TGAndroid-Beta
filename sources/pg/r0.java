package pg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class r0 extends AnimatorListenerAdapter {
    public final int f41200a;
    public final s0 f41201b;

    public r0(s0 s0Var, int i10) {
        this.f41200a = i10;
        this.f41201b = s0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f41200a) {
            case 0:
                s0 s0Var = this.f41201b;
                s0Var.K = null;
                s0Var.f41223f.f(new org.telegram.ui.web.u0(this, 9));
                return;
            default:
                this.f41201b.f41223f.f(new org.telegram.ui.web.u0(this, 10));
                return;
        }
    }
}
