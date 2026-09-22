package pg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class r0 extends AnimatorListenerAdapter {
    public final int f41260a;
    public final s0 f41261b;

    public r0(s0 s0Var, int i10) {
        this.f41260a = i10;
        this.f41261b = s0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f41260a) {
            case 0:
                s0 s0Var = this.f41261b;
                s0Var.K = null;
                s0Var.f41273f.f(new org.telegram.ui.web.r0(this, 10));
                return;
            default:
                this.f41261b.f41273f.f(new org.telegram.ui.web.r0(this, 11));
                return;
        }
    }
}
