package pg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class p0 extends AnimatorListenerAdapter {
    public final int f40932a;
    public final q0 f40933b;

    public p0(q0 q0Var, int i10) {
        this.f40932a = i10;
        this.f40933b = q0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f40932a) {
            case 0:
                q0 q0Var = this.f40933b;
                q0Var.K = null;
                q0Var.f40951f.f(new org.telegram.ui.web.u0(this, 9));
                return;
            default:
                this.f40933b.f40951f.f(new org.telegram.ui.web.u0(this, 10));
                return;
        }
    }
}
