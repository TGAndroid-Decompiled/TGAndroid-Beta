package pg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class r0 extends AnimatorListenerAdapter {
    public final int f41241a;
    public final s0 f41242b;

    public r0(s0 s0Var, int i10) {
        this.f41241a = i10;
        this.f41242b = s0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f41241a) {
            case 0:
                s0 s0Var = this.f41242b;
                s0Var.K = null;
                s0Var.f41264f.f(new org.telegram.ui.web.r0(this, 10));
                return;
            default:
                this.f41242b.f41264f.f(new org.telegram.ui.web.r0(this, 11));
                return;
        }
    }
}
