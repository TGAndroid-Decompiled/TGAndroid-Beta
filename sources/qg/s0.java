package qg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.web.z1;
public final class s0 extends AnimatorListenerAdapter {
    public final int f44605a;
    public final t0 f44606b;

    public s0(t0 t0Var, int i10) {
        this.f44605a = i10;
        this.f44606b = t0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f44605a) {
            case 0:
                t0 t0Var = this.f44606b;
                t0Var.K = null;
                t0Var.f44628f.f(new z1(this, 4));
                return;
            default:
                this.f44606b.f44628f.f(new z1(this, 5));
                return;
        }
    }
}
