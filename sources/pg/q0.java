package pg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class q0 extends AnimatorListenerAdapter {
    public final int f45613a;
    public final r0 f45614b;

    public q0(r0 r0Var, int i10) {
        this.f45613a = i10;
        this.f45614b = r0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f45613a) {
            case 0:
                r0 r0Var = this.f45614b;
                r0Var.K = null;
                r0Var.f45637f.f(new org.telegram.ui.web.t0(this, 9));
                return;
            default:
                this.f45614b.f45637f.f(new org.telegram.ui.web.t0(this, 10));
                return;
        }
    }
}
