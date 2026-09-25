package pg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class r0 extends AnimatorListenerAdapter {
    public final int f41212a;
    public final s0 f41213b;

    public r0(s0 s0Var, int i10) {
        this.f41212a = i10;
        this.f41213b = s0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f41212a) {
            case 0:
                s0 s0Var = this.f41213b;
                s0Var.K = null;
                s0Var.f41225f.f(new org.telegram.ui.web.q0(this, 10));
                return;
            default:
                this.f41213b.f41225f.f(new org.telegram.ui.web.q0(this, 11));
                return;
        }
    }
}
