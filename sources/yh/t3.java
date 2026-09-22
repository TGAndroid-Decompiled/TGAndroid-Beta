package yh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class t3 extends AnimatorListenerAdapter {
    public final int f47754a;
    public final w3 f47755b;

    public t3(w3 w3Var, int i10) {
        this.f47754a = i10;
        this.f47755b = w3Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f47754a) {
            case 0:
                this.f47755b.f47876d0 = false;
                return;
            case 1:
                this.f47755b.f47876d0 = false;
                return;
            case 2:
                this.f47755b.N.setVisibility(4);
                return;
            case 3:
                w3 w3Var = this.f47755b;
                w3Var.f47894s0 = w3Var.f47892r0;
                w3Var.d(w3Var.U);
                return;
            default:
                w3 w3Var2 = this.f47755b;
                w3Var2.f47895t0 = 1.0f;
                w3Var2.f47872b.setScaleX(1.0f);
                w3Var2.f47872b.setScaleY(w3Var2.f47895t0);
                w3Var2.invalidate();
                return;
        }
    }
}
