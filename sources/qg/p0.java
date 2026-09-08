package qg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class p0 extends AnimatorListenerAdapter {
    public final int f44529a;
    public final q0 f44530b;

    public p0(q0 q0Var, int i10) {
        this.f44529a = i10;
        this.f44530b = q0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f44529a) {
            case 0:
                q0 q0Var = this.f44530b;
                q0Var.K = null;
                q0Var.f44550f.f(new org.telegram.ui.web.b(this, 12));
                return;
            default:
                this.f44530b.f44550f.f(new org.telegram.ui.web.b(this, 13));
                return;
        }
    }
}
