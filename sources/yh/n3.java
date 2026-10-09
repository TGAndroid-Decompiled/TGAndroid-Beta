package yh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class n3 extends AnimatorListenerAdapter {
    public final int f52923a;
    public final p3 f52924b;

    public n3(p3 p3Var, int i10) {
        this.f52923a = i10;
        this.f52924b = p3Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f52923a) {
            case 0:
                this.f52924b.f53004d0 = false;
                return;
            case 1:
                this.f52924b.f53004d0 = false;
                return;
            case 2:
                this.f52924b.N.setVisibility(4);
                return;
            case 3:
                p3 p3Var = this.f52924b;
                p3Var.f53023s0 = p3Var.f53021r0;
                p3Var.d(p3Var.U);
                return;
            default:
                p3 p3Var2 = this.f52924b;
                p3Var2.f53024t0 = 1.0f;
                p3Var2.f53000b.setScaleX(1.0f);
                p3Var2.f53000b.setScaleY(p3Var2.f53024t0);
                p3Var2.invalidate();
                return;
        }
    }
}
