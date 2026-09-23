package yh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class s3 extends AnimatorListenerAdapter {
    public final int f47685a;
    public final v3 f47686b;

    public s3(v3 v3Var, int i10) {
        this.f47685a = i10;
        this.f47686b = v3Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f47685a) {
            case 0:
                this.f47686b.f47808d0 = false;
                return;
            case 1:
                this.f47686b.f47808d0 = false;
                return;
            case 2:
                this.f47686b.N.setVisibility(4);
                return;
            case 3:
                v3 v3Var = this.f47686b;
                v3Var.f47826s0 = v3Var.f47824r0;
                v3Var.d(v3Var.U);
                return;
            default:
                v3 v3Var2 = this.f47686b;
                v3Var2.f47827t0 = 1.0f;
                v3Var2.f47804b.setScaleX(1.0f);
                v3Var2.f47804b.setScaleY(v3Var2.f47827t0);
                v3Var2.invalidate();
                return;
        }
    }
}
