package pg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class r0 extends AnimatorListenerAdapter {
    public final int f41310a;
    public final s0 f41311b;

    public r0(s0 s0Var, int i10) {
        this.f41310a = i10;
        this.f41311b = s0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f41310a) {
            case 0:
                s0 s0Var = this.f41311b;
                s0Var.K = null;
                s0Var.f41323f.f(new org.telegram.ui.web.q0(this, 10));
                return;
            default:
                this.f41311b.f41323f.f(new org.telegram.ui.web.q0(this, 11));
                return;
        }
    }
}
