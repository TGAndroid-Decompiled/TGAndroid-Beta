package tg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class h0 extends AnimatorListenerAdapter {
    public final int f55184a;
    public final i0 f55185b;

    public h0(i0 i0Var, int i3) {
        this.f55184a = i3;
        this.f55185b = i0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f55184a) {
            case 0:
                i0 i0Var = this.f55185b;
                i0Var.K = null;
                i0Var.f55193f.f(new r4.u(this, 5));
                return;
            default:
                this.f55185b.f55193f.f(new r4.u(this, 6));
                return;
        }
    }
}
