package yh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class r3 extends AnimatorListenerAdapter {
    public final int f47948a;
    public final u3 f47949b;

    public r3(u3 u3Var, int i10) {
        this.f47948a = i10;
        this.f47949b = u3Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f47948a) {
            case 0:
                this.f47949b.f48087d0 = false;
                return;
            case 1:
                this.f47949b.f48087d0 = false;
                return;
            case 2:
                this.f47949b.N.setVisibility(4);
                return;
            case 3:
                u3 u3Var = this.f47949b;
                u3Var.f48105s0 = u3Var.f48103r0;
                u3Var.d(u3Var.U);
                return;
            default:
                u3 u3Var2 = this.f47949b;
                u3Var2.f48106t0 = 1.0f;
                u3Var2.f48083b.setScaleX(1.0f);
                u3Var2.f48083b.setScaleY(u3Var2.f48106t0);
                u3Var2.invalidate();
                return;
        }
    }
}
