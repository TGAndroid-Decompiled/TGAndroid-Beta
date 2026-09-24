package pg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class r0 extends AnimatorListenerAdapter {
    public final int f41197a;
    public final s0 f41198b;

    public r0(s0 s0Var, int i10) {
        this.f41197a = i10;
        this.f41198b = s0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f41197a) {
            case 0:
                s0 s0Var = this.f41198b;
                s0Var.K = null;
                s0Var.f41210f.f(new org.telegram.ui.web.q0(this, 10));
                return;
            default:
                this.f41198b.f41210f.f(new org.telegram.ui.web.q0(this, 11));
                return;
        }
    }
}
