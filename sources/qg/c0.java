package qg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class c0 extends AnimatorListenerAdapter {
    public final w0 f44474a;
    public final float f44475b;
    public final m f44476c;
    public final boolean d;
    public final Runnable e;
    public final d0 f44477f;

    public c0(d0 d0Var, w0 w0Var, float f7, m mVar, boolean z10, Runnable runnable) {
        this.f44477f = d0Var;
        this.f44474a = w0Var;
        this.f44475b = f7;
        this.f44476c = mVar;
        this.d = z10;
        this.e = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int currentColor;
        d1 d1Var;
        d0 d0Var = this.f44477f;
        d0Var.f44507x = null;
        t0 t0Var = new t0(new w0[]{this.f44474a});
        e1 e1Var = d0Var.f44488a;
        t0Var.f44656c = e1Var.getCurrentColor();
        t0Var.d = this.f44475b * 1.0f;
        m mVar = this.f44476c;
        t0Var.e = mVar;
        mVar.getClass();
        if (mVar instanceof d) {
            currentColor = -1;
        } else {
            currentColor = e1Var.getCurrentColor();
        }
        s0 painting = e1Var.getPainting();
        boolean z10 = this.d;
        painting.c(t0Var, currentColor, z10, null);
        if (z10 && (d1Var = e1Var.f44511a) != null) {
            d1Var.e();
        }
        Runnable runnable = this.e;
        if (runnable != null) {
            runnable.run();
        }
    }
}
