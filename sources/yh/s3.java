package yh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class s3 extends AnimatorListenerAdapter {
    public final int f48058a;
    public final v3 f48059b;

    public s3(v3 v3Var, int i10) {
        this.f48058a = i10;
        this.f48059b = v3Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f48058a) {
            case 0:
                this.f48059b.f48178d0 = false;
                return;
            case 1:
                this.f48059b.f48178d0 = false;
                return;
            case 2:
                this.f48059b.N.setVisibility(4);
                return;
            case 3:
                v3 v3Var = this.f48059b;
                v3Var.f48196s0 = v3Var.f48194r0;
                v3Var.d(v3Var.U);
                return;
            default:
                v3 v3Var2 = this.f48059b;
                v3Var2.f48197t0 = 1.0f;
                v3Var2.f48174b.setScaleX(1.0f);
                v3Var2.f48174b.setScaleY(v3Var2.f48197t0);
                v3Var2.invalidate();
                return;
        }
    }
}
