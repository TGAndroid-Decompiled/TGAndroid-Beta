package xh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class r3 extends AnimatorListenerAdapter {
    public final int f45954a;
    public final u3 f45955b;

    public r3(u3 u3Var, int i10) {
        this.f45954a = i10;
        this.f45955b = u3Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f45954a) {
            case 0:
                this.f45955b.f46103d0 = false;
                return;
            case 1:
                this.f45955b.f46103d0 = false;
                return;
            case 2:
                this.f45955b.N.setVisibility(4);
                return;
            case 3:
                u3 u3Var = this.f45955b;
                u3Var.f46121s0 = u3Var.f46119r0;
                u3Var.d(u3Var.U);
                return;
            default:
                u3 u3Var2 = this.f45955b;
                u3Var2.f46122t0 = 1.0f;
                u3Var2.f46099b.setScaleX(1.0f);
                u3Var2.f46099b.setScaleY(u3Var2.f46122t0);
                u3Var2.invalidate();
                return;
        }
    }
}
