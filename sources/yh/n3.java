package yh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class n3 extends AnimatorListenerAdapter {
    public final int f52925a;
    public final p3 f52926b;

    public n3(p3 p3Var, int i10) {
        this.f52925a = i10;
        this.f52926b = p3Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f52925a) {
            case 0:
                this.f52926b.f53006d0 = false;
                return;
            case 1:
                this.f52926b.f53006d0 = false;
                return;
            case 2:
                this.f52926b.N.setVisibility(4);
                return;
            case 3:
                p3 p3Var = this.f52926b;
                p3Var.f53025s0 = p3Var.f53023r0;
                p3Var.d(p3Var.U);
                return;
            default:
                p3 p3Var2 = this.f52926b;
                p3Var2.f53026t0 = 1.0f;
                p3Var2.f53002b.setScaleX(1.0f);
                p3Var2.f53002b.setScaleY(p3Var2.f53026t0);
                p3Var2.invalidate();
                return;
        }
    }
}
