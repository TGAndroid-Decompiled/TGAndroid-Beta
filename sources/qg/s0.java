package qg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.web.z1;
public final class s0 extends AnimatorListenerAdapter {
    public final int f44607a;
    public final t0 f44608b;

    public s0(t0 t0Var, int i10) {
        this.f44607a = i10;
        this.f44608b = t0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f44607a) {
            case 0:
                t0 t0Var = this.f44608b;
                t0Var.K = null;
                t0Var.f44630f.f(new z1(this, 4));
                return;
            default:
                this.f44608b.f44630f.f(new z1(this, 5));
                return;
        }
    }
}
