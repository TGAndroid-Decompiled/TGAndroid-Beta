package qg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.web.z1;
public final class s0 extends AnimatorListenerAdapter {
    public final int f44619a;
    public final t0 f44620b;

    public s0(t0 t0Var, int i10) {
        this.f44619a = i10;
        this.f44620b = t0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f44619a) {
            case 0:
                t0 t0Var = this.f44620b;
                t0Var.K = null;
                t0Var.f44642f.f(new z1(this, 4));
                return;
            default:
                this.f44620b.f44642f.f(new z1(this, 5));
                return;
        }
    }
}
