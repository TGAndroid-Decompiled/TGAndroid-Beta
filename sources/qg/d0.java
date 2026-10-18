package qg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class d0 extends AnimatorListenerAdapter {
    public final w0 f44529a;
    public final float f44530b;
    public final m f44531c;
    public final boolean d;
    public final Runnable e;
    public final e0 f44532f;

    public d0(e0 e0Var, w0 w0Var, float f7, m mVar, boolean z10, Runnable runnable) {
        this.f44532f = e0Var;
        this.f44529a = w0Var;
        this.f44530b = f7;
        this.f44531c = mVar;
        this.d = z10;
        this.e = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int currentColor;
        d1 d1Var;
        e0 e0Var = this.f44532f;
        e0Var.f44552x = null;
        t0 t0Var = new t0(new w0[]{this.f44529a});
        e1 e1Var = e0Var.f44533a;
        t0Var.f44697c = e1Var.getCurrentColor();
        t0Var.d = this.f44530b * 1.0f;
        m mVar = this.f44531c;
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
        if (z10 && (d1Var = e1Var.f44555a) != null) {
            d1Var.e();
        }
        Runnable runnable = this.e;
        if (runnable != null) {
            runnable.run();
        }
    }
}
