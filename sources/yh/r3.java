package yh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class r3 extends AnimatorListenerAdapter {
    public final int f51888a;
    public final u3 f51889b;

    public r3(u3 u3Var, int i10) {
        this.f51888a = i10;
        this.f51889b = u3Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f51888a) {
            case 0:
                this.f51889b.f52058d0 = false;
                return;
            case 1:
                this.f51889b.f52058d0 = false;
                return;
            case 2:
                this.f51889b.N.setVisibility(4);
                return;
            case 3:
                u3 u3Var = this.f51889b;
                u3Var.f52077s0 = u3Var.f52075r0;
                u3Var.d(u3Var.U);
                return;
            default:
                u3 u3Var2 = this.f51889b;
                u3Var2.f52078t0 = 1.0f;
                u3Var2.f52054b.setScaleX(1.0f);
                u3Var2.f52054b.setScaleY(u3Var2.f52078t0);
                u3Var2.invalidate();
                return;
        }
    }
}
