package pg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class r0 extends AnimatorListenerAdapter {
    public final int f45733a;
    public final s0 f45734b;

    public r0(s0 s0Var, int i10) {
        this.f45733a = i10;
        this.f45734b = s0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f45733a) {
            case 0:
                s0 s0Var = this.f45734b;
                s0Var.K = null;
                s0Var.f45759f.f(new org.telegram.ui.web.q0(this, 10));
                return;
            default:
                this.f45734b.f45759f.f(new org.telegram.ui.web.q0(this, 11));
                return;
        }
    }
}
