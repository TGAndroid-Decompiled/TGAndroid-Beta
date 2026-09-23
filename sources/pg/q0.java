package pg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class q0 extends AnimatorListenerAdapter {
    public final int f40887a;
    public final r0 f40888b;

    public q0(r0 r0Var, int i10) {
        this.f40887a = i10;
        this.f40888b = r0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f40887a) {
            case 0:
                r0 r0Var = this.f40888b;
                r0Var.K = null;
                r0Var.f40908f.f(new org.telegram.ui.web.t0(this, 9));
                return;
            default:
                this.f40888b.f40908f.f(new org.telegram.ui.web.t0(this, 10));
                return;
        }
    }
}
