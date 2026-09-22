package pg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class p0 extends AnimatorListenerAdapter {
    public final int f40928a;
    public final q0 f40929b;

    public p0(q0 q0Var, int i10) {
        this.f40928a = i10;
        this.f40929b = q0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f40928a) {
            case 0:
                q0 q0Var = this.f40929b;
                q0Var.K = null;
                q0Var.f40947f.f(new org.telegram.ui.web.u0(this, 9));
                return;
            default:
                this.f40929b.f40947f.f(new org.telegram.ui.web.u0(this, 10));
                return;
        }
    }
}
