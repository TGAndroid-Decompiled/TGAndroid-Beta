package qg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class p0 extends AnimatorListenerAdapter {
    public final int f44501a;
    public final q0 f44502b;

    public p0(q0 q0Var, int i10) {
        this.f44501a = i10;
        this.f44502b = q0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f44501a) {
            case 0:
                q0 q0Var = this.f44502b;
                q0Var.K = null;
                q0Var.f44522f.f(new org.telegram.ui.web.b(this, 12));
                return;
            default:
                this.f44502b.f44522f.f(new org.telegram.ui.web.b(this, 13));
                return;
        }
    }
}
