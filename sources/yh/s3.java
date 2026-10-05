package yh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class s3 extends AnimatorListenerAdapter {
    public final int f51961a;
    public final v3 f51962b;

    public s3(v3 v3Var, int i10) {
        this.f51961a = i10;
        this.f51962b = v3Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f51961a) {
            case 0:
                this.f51962b.f52133d0 = false;
                return;
            case 1:
                this.f51962b.f52133d0 = false;
                return;
            case 2:
                this.f51962b.N.setVisibility(4);
                return;
            case 3:
                v3 v3Var = this.f51962b;
                v3Var.f52152s0 = v3Var.f52150r0;
                v3Var.d(v3Var.U);
                return;
            default:
                v3 v3Var2 = this.f51962b;
                v3Var2.f52153t0 = 1.0f;
                v3Var2.f52129b.setScaleX(1.0f);
                v3Var2.f52129b.setScaleY(v3Var2.f52153t0);
                v3Var2.invalidate();
                return;
        }
    }
}
