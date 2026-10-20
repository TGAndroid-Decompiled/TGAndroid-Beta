package qg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.web.z1;
public final class s0 extends AnimatorListenerAdapter {
    public final int f44615a;
    public final t0 f44616b;

    public s0(t0 t0Var, int i10) {
        this.f44615a = i10;
        this.f44616b = t0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f44615a) {
            case 0:
                t0 t0Var = this.f44616b;
                t0Var.K = null;
                t0Var.f44638f.f(new z1(this, 4));
                return;
            default:
                this.f44616b.f44638f.f(new z1(this, 5));
                return;
        }
    }
}
