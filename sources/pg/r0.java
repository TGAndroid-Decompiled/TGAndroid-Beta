package pg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class r0 extends AnimatorListenerAdapter {
    public final int f45801a;
    public final s0 f45802b;

    public r0(s0 s0Var, int i10) {
        this.f45801a = i10;
        this.f45802b = s0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f45801a) {
            case 0:
                s0 s0Var = this.f45802b;
                s0Var.K = null;
                s0Var.f45827f.f(new org.telegram.ui.web.t0(this, 9));
                return;
            default:
                this.f45802b.f45827f.f(new org.telegram.ui.web.t0(this, 10));
                return;
        }
    }
}
