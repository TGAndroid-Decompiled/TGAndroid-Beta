package yh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class n3 extends AnimatorListenerAdapter {
    public final int f53129a;
    public final p3 f53130b;

    public n3(p3 p3Var, int i10) {
        this.f53129a = i10;
        this.f53130b = p3Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f53129a) {
            case 0:
                this.f53130b.f53230d0 = false;
                return;
            case 1:
                this.f53130b.f53230d0 = false;
                return;
            case 2:
                this.f53130b.N.setVisibility(4);
                return;
            case 3:
                p3 p3Var = this.f53130b;
                p3Var.f53249s0 = p3Var.f53247r0;
                p3Var.d(p3Var.U);
                return;
            default:
                p3 p3Var2 = this.f53130b;
                p3Var2.f53250t0 = 1.0f;
                p3Var2.f53226b.setScaleX(1.0f);
                p3Var2.f53226b.setScaleY(p3Var2.f53250t0);
                p3Var2.invalidate();
                return;
        }
    }
}
