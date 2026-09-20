package yh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class s3 extends AnimatorListenerAdapter {
    public final int f48037a;
    public final v3 f48038b;

    public s3(v3 v3Var, int i10) {
        this.f48037a = i10;
        this.f48038b = v3Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f48037a) {
            case 0:
                this.f48038b.f48157d0 = false;
                return;
            case 1:
                this.f48038b.f48157d0 = false;
                return;
            case 2:
                this.f48038b.N.setVisibility(4);
                return;
            case 3:
                v3 v3Var = this.f48038b;
                v3Var.f48175s0 = v3Var.f48173r0;
                v3Var.d(v3Var.U);
                return;
            default:
                v3 v3Var2 = this.f48038b;
                v3Var2.f48176t0 = 1.0f;
                v3Var2.f48153b.setScaleX(1.0f);
                v3Var2.f48153b.setScaleY(v3Var2.f48176t0);
                v3Var2.invalidate();
                return;
        }
    }
}
