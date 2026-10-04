package yh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class r3 extends AnimatorListenerAdapter {
    public final int f51893a;
    public final u3 f51894b;

    public r3(u3 u3Var, int i10) {
        this.f51893a = i10;
        this.f51894b = u3Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f51893a) {
            case 0:
                this.f51894b.f52063d0 = false;
                return;
            case 1:
                this.f51894b.f52063d0 = false;
                return;
            case 2:
                this.f51894b.N.setVisibility(4);
                return;
            case 3:
                u3 u3Var = this.f51894b;
                u3Var.f52082s0 = u3Var.f52080r0;
                u3Var.d(u3Var.U);
                return;
            default:
                u3 u3Var2 = this.f51894b;
                u3Var2.f52083t0 = 1.0f;
                u3Var2.f52059b.setScaleX(1.0f);
                u3Var2.f52059b.setScaleY(u3Var2.f52083t0);
                u3Var2.invalidate();
                return;
        }
    }
}
