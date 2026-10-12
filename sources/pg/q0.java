package pg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class q0 extends AnimatorListenerAdapter {
    public final int f45608a;
    public final r0 f45609b;

    public q0(r0 r0Var, int i10) {
        this.f45608a = i10;
        this.f45609b = r0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f45608a) {
            case 0:
                r0 r0Var = this.f45609b;
                r0Var.K = null;
                r0Var.f45632f.f(new org.telegram.ui.web.t0(this, 9));
                return;
            default:
                this.f45609b.f45632f.f(new org.telegram.ui.web.t0(this, 10));
                return;
        }
    }
}
