package qg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class d0 extends AnimatorListenerAdapter {
    public final w0 f44908a;
    public final float f44909b;
    public final m f44910c;
    public final boolean d;
    public final Runnable e;
    public final e0 f44911f;

    public d0(e0 e0Var, w0 w0Var, float f7, m mVar, boolean z10, Runnable runnable) {
        this.f44911f = e0Var;
        this.f44908a = w0Var;
        this.f44909b = f7;
        this.f44910c = mVar;
        this.d = z10;
        this.e = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int currentColor;
        d1 d1Var;
        e0 e0Var = this.f44911f;
        e0Var.f44931x = null;
        t0 t0Var = new t0(new w0[]{this.f44908a});
        e1 e1Var = e0Var.f44912a;
        t0Var.f45076c = e1Var.getCurrentColor();
        t0Var.d = this.f44909b * 1.0f;
        m mVar = this.f44910c;
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
        if (z10 && (d1Var = e1Var.f44934a) != null) {
            d1Var.e();
        }
        Runnable runnable = this.e;
        if (runnable != null) {
            runnable.run();
        }
    }
}
