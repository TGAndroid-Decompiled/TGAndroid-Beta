package pg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class r0 extends AnimatorListenerAdapter {
    public final int f41210a;
    public final s0 f41211b;

    public r0(s0 s0Var, int i10) {
        this.f41210a = i10;
        this.f41211b = s0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f41210a) {
            case 0:
                s0 s0Var = this.f41211b;
                s0Var.K = null;
                s0Var.f41223f.f(new org.telegram.ui.web.q0(this, 10));
                return;
            default:
                this.f41211b.f41223f.f(new org.telegram.ui.web.q0(this, 11));
                return;
        }
    }
}
