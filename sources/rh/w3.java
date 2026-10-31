package rh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class w3 extends AnimatorListenerAdapter {
    public final int f47632a;
    public final y3 f47633b;

    public w3(y3 y3Var, int i10) {
        this.f47632a = i10;
        this.f47633b = y3Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f47632a) {
            case 0:
                this.f47633b.f47726g0 = false;
                return;
            case 1:
                this.f47633b.f47726g0 = false;
                return;
            case 2:
                this.f47633b.O.setVisibility(4);
                return;
            case 3:
                y3 y3Var = this.f47633b;
                y3Var.f47743v0 = y3Var.f47742u0;
                y3Var.d(y3Var.f47717a0);
                return;
            default:
                y3 y3Var2 = this.f47633b;
                y3Var2.f47745w0 = 1.0f;
                y3Var2.f47718b.setScaleX(1.0f);
                y3Var2.f47718b.setScaleY(y3Var2.f47745w0);
                y3Var2.invalidate();
                return;
        }
    }
}
