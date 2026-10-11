package yh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class n3 extends AnimatorListenerAdapter {
    public final int f53026a;
    public final p3 f53027b;

    public n3(p3 p3Var, int i10) {
        this.f53026a = i10;
        this.f53027b = p3Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f53026a) {
            case 0:
                this.f53027b.f53127d0 = false;
                return;
            case 1:
                this.f53027b.f53127d0 = false;
                return;
            case 2:
                this.f53027b.N.setVisibility(4);
                return;
            case 3:
                p3 p3Var = this.f53027b;
                p3Var.f53146s0 = p3Var.f53144r0;
                p3Var.d(p3Var.U);
                return;
            default:
                p3 p3Var2 = this.f53027b;
                p3Var2.f53147t0 = 1.0f;
                p3Var2.f53123b.setScaleX(1.0f);
                p3Var2.f53123b.setScaleY(p3Var2.f53147t0);
                p3Var2.invalidate();
                return;
        }
    }
}
