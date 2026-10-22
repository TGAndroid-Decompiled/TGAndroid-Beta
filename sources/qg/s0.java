package qg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.web.z1;
public final class s0 extends AnimatorListenerAdapter {
    public final int f44618a;
    public final t0 f44619b;

    public s0(t0 t0Var, int i10) {
        this.f44618a = i10;
        this.f44619b = t0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f44618a) {
            case 0:
                t0 t0Var = this.f44619b;
                t0Var.K = null;
                t0Var.f44641f.f(new z1(this, 4));
                return;
            default:
                this.f44619b.f44641f.f(new z1(this, 5));
                return;
        }
    }
}
