package xf;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class p0 extends AnimatorListenerAdapter {
    public final int f49293a;
    public final q0 f49294b;

    public p0(q0 q0Var, int i9) {
        this.f49293a = i9;
        this.f49294b = q0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f49293a) {
            case 0:
                q0 q0Var = this.f49294b;
                q0Var.K = null;
                q0Var.f49314f.f(new pf.o1(this, 11));
                return;
            default:
                this.f49294b.f49314f.f(new pf.o1(this, 12));
                return;
        }
    }
}
