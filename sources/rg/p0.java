package rg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class p0 extends AnimatorListenerAdapter {
    public final int f47485a;
    public final q0 f47486b;

    public p0(q0 q0Var, int i10) {
        this.f47485a = i10;
        this.f47486b = q0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f47485a) {
            case 0:
                q0 q0Var = this.f47486b;
                q0Var.K = null;
                q0Var.f47503f.f(new org.telegram.ui.web.h1(this, 9));
                return;
            default:
                this.f47486b.f47503f.f(new org.telegram.ui.web.h1(this, 10));
                return;
        }
    }
}
