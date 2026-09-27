package yh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class r3 extends AnimatorListenerAdapter {
    public final int f47994a;
    public final u3 f47995b;

    public r3(u3 u3Var, int i10) {
        this.f47994a = i10;
        this.f47995b = u3Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f47994a) {
            case 0:
                this.f47995b.f48135d0 = false;
                return;
            case 1:
                this.f47995b.f48135d0 = false;
                return;
            case 2:
                this.f47995b.N.setVisibility(4);
                return;
            case 3:
                u3 u3Var = this.f47995b;
                u3Var.f48153s0 = u3Var.f48151r0;
                u3Var.d(u3Var.U);
                return;
            default:
                u3 u3Var2 = this.f47995b;
                u3Var2.f48154t0 = 1.0f;
                u3Var2.f48131b.setScaleX(1.0f);
                u3Var2.f48131b.setScaleY(u3Var2.f48154t0);
                u3Var2.invalidate();
                return;
        }
    }
}
