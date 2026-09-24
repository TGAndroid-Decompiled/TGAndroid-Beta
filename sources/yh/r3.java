package yh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class r3 extends AnimatorListenerAdapter {
    public final int f47935a;
    public final u3 f47936b;

    public r3(u3 u3Var, int i10) {
        this.f47935a = i10;
        this.f47936b = u3Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f47935a) {
            case 0:
                this.f47936b.f48074d0 = false;
                return;
            case 1:
                this.f47936b.f48074d0 = false;
                return;
            case 2:
                this.f47936b.N.setVisibility(4);
                return;
            case 3:
                u3 u3Var = this.f47936b;
                u3Var.f48092s0 = u3Var.f48090r0;
                u3Var.d(u3Var.U);
                return;
            default:
                u3 u3Var2 = this.f47936b;
                u3Var2.f48093t0 = 1.0f;
                u3Var2.f48070b.setScaleX(1.0f);
                u3Var2.f48070b.setScaleY(u3Var2.f48093t0);
                u3Var2.invalidate();
                return;
        }
    }
}
