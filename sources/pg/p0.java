package pg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class p0 extends AnimatorListenerAdapter {
    public final int f40954a;
    public final q0 f40955b;

    public p0(q0 q0Var, int i10) {
        this.f40954a = i10;
        this.f40955b = q0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f40954a) {
            case 0:
                q0 q0Var = this.f40955b;
                q0Var.K = null;
                q0Var.f40973f.f(new org.telegram.ui.web.u0(this, 9));
                return;
            default:
                this.f40955b.f40973f.f(new org.telegram.ui.web.u0(this, 10));
                return;
        }
    }
}
