package yh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class s3 extends AnimatorListenerAdapter {
    public final int f47992a;
    public final v3 f47993b;

    public s3(v3 v3Var, int i10) {
        this.f47992a = i10;
        this.f47993b = v3Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f47992a) {
            case 0:
                this.f47993b.f48115d0 = false;
                return;
            case 1:
                this.f47993b.f48115d0 = false;
                return;
            case 2:
                this.f47993b.N.setVisibility(4);
                return;
            case 3:
                v3 v3Var = this.f47993b;
                v3Var.f48133s0 = v3Var.f48131r0;
                v3Var.d(v3Var.U);
                return;
            default:
                v3 v3Var2 = this.f47993b;
                v3Var2.f48134t0 = 1.0f;
                v3Var2.f48111b.setScaleX(1.0f);
                v3Var2.f48111b.setScaleY(v3Var2.f48134t0);
                v3Var2.invalidate();
                return;
        }
    }
}
