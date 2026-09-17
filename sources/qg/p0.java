package qg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class p0 extends AnimatorListenerAdapter {
    public final int f44502a;
    public final q0 f44503b;

    public p0(q0 q0Var, int i10) {
        this.f44502a = i10;
        this.f44503b = q0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f44502a) {
            case 0:
                q0 q0Var = this.f44503b;
                q0Var.K = null;
                q0Var.f44523f.f(new org.telegram.ui.web.b(this, 12));
                return;
            default:
                this.f44503b.f44523f.f(new org.telegram.ui.web.b(this, 13));
                return;
        }
    }
}
