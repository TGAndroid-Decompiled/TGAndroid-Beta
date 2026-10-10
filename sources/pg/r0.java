package pg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class r0 extends AnimatorListenerAdapter {
    public final int f45777a;
    public final s0 f45778b;

    public r0(s0 s0Var, int i10) {
        this.f45777a = i10;
        this.f45778b = s0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f45777a) {
            case 0:
                s0 s0Var = this.f45778b;
                s0Var.K = null;
                s0Var.f45803f.f(new org.telegram.ui.web.q0(this, 10));
                return;
            default:
                this.f45778b.f45803f.f(new org.telegram.ui.web.q0(this, 11));
                return;
        }
    }
}
