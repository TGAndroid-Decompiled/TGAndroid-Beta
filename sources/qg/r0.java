package qg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.web.a2;
public final class r0 extends AnimatorListenerAdapter {
    public final int f44603a;
    public final s0 f44604b;

    public r0(s0 s0Var, int i10) {
        this.f44603a = i10;
        this.f44604b = s0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f44603a) {
            case 0:
                s0 s0Var = this.f44604b;
                s0Var.K = null;
                s0Var.f44626f.f(new a2(this, 4));
                return;
            default:
                this.f44604b.f44626f.f(new a2(this, 5));
                return;
        }
    }
}
