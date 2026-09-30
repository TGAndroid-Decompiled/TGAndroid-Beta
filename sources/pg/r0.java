package pg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class r0 extends AnimatorListenerAdapter {
    public final int f41213a;
    public final s0 f41214b;

    public r0(s0 s0Var, int i10) {
        this.f41213a = i10;
        this.f41214b = s0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f41213a) {
            case 0:
                s0 s0Var = this.f41214b;
                s0Var.K = null;
                s0Var.f41226f.f(new org.telegram.ui.web.q0(this, 10));
                return;
            default:
                this.f41214b.f41226f.f(new org.telegram.ui.web.q0(this, 11));
                return;
        }
    }
}
