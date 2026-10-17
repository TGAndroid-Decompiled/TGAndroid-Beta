package qg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.web.z1;
public final class r0 extends AnimatorListenerAdapter {
    public final int f44627a;
    public final s0 f44628b;

    public r0(s0 s0Var, int i10) {
        this.f44627a = i10;
        this.f44628b = s0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f44627a) {
            case 0:
                s0 s0Var = this.f44628b;
                s0Var.K = null;
                s0Var.f44648f.f(new z1(this, 4));
                return;
            default:
                this.f44628b.f44648f.f(new z1(this, 5));
                return;
        }
    }
}
