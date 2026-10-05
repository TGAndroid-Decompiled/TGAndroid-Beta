package pg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class r0 extends AnimatorListenerAdapter {
    public final int f44585a;
    public final s0 f44586b;

    public r0(s0 s0Var, int i10) {
        this.f44585a = i10;
        this.f44586b = s0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f44585a) {
            case 0:
                s0 s0Var = this.f44586b;
                s0Var.K = null;
                s0Var.f44601f.f(new org.telegram.ui.web.u0(this, 9));
                return;
            default:
                this.f44586b.f44601f.f(new org.telegram.ui.web.u0(this, 10));
                return;
        }
    }
}
