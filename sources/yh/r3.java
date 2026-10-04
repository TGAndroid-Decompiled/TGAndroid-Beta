package yh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class r3 extends AnimatorListenerAdapter {
    public final int f51887a;
    public final u3 f51888b;

    public r3(u3 u3Var, int i10) {
        this.f51887a = i10;
        this.f51888b = u3Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f51887a) {
            case 0:
                this.f51888b.f52057d0 = false;
                return;
            case 1:
                this.f51888b.f52057d0 = false;
                return;
            case 2:
                this.f51888b.N.setVisibility(4);
                return;
            case 3:
                u3 u3Var = this.f51888b;
                u3Var.f52076s0 = u3Var.f52074r0;
                u3Var.d(u3Var.U);
                return;
            default:
                u3 u3Var2 = this.f51888b;
                u3Var2.f52077t0 = 1.0f;
                u3Var2.f52053b.setScaleX(1.0f);
                u3Var2.f52053b.setScaleY(u3Var2.f52077t0);
                u3Var2.invalidate();
                return;
        }
    }
}
