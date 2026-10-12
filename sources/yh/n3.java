package yh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class n3 extends AnimatorListenerAdapter {
    public final int f53141a;
    public final p3 f53142b;

    public n3(p3 p3Var, int i10) {
        this.f53141a = i10;
        this.f53142b = p3Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f53141a) {
            case 0:
                this.f53142b.f53242d0 = false;
                return;
            case 1:
                this.f53142b.f53242d0 = false;
                return;
            case 2:
                this.f53142b.N.setVisibility(4);
                return;
            case 3:
                p3 p3Var = this.f53142b;
                p3Var.f53261s0 = p3Var.f53259r0;
                p3Var.d(p3Var.U);
                return;
            default:
                p3 p3Var2 = this.f53142b;
                p3Var2.f53262t0 = 1.0f;
                p3Var2.f53238b.setScaleX(1.0f);
                p3Var2.f53238b.setScaleY(p3Var2.f53262t0);
                p3Var2.invalidate();
                return;
        }
    }
}
