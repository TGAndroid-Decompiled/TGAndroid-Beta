package qg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class d0 extends AnimatorListenerAdapter {
    public final x0 f44483a;
    public final float f44484b;
    public final m f44485c;
    public final boolean d;
    public final Runnable e;
    public final e0 f44486f;

    public d0(e0 e0Var, x0 x0Var, float f7, m mVar, boolean z10, Runnable runnable) {
        this.f44486f = e0Var;
        this.f44483a = x0Var;
        this.f44484b = f7;
        this.f44485c = mVar;
        this.d = z10;
        this.e = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int currentColor;
        e1 e1Var;
        e0 e0Var = this.f44486f;
        e0Var.f44516x = null;
        u0 u0Var = new u0(new x0[]{this.f44483a});
        f1 f1Var = e0Var.f44497a;
        u0Var.f44668c = f1Var.getCurrentColor();
        u0Var.d = this.f44484b * 1.0f;
        m mVar = this.f44485c;
        u0Var.e = mVar;
        mVar.getClass();
        if (mVar instanceof d) {
            currentColor = -1;
        } else {
            currentColor = f1Var.getCurrentColor();
        }
        t0 painting = f1Var.getPainting();
        boolean z10 = this.d;
        painting.c(u0Var, currentColor, z10, null);
        if (z10 && (e1Var = f1Var.f44520a) != null) {
            e1Var.e();
        }
        Runnable runnable = this.e;
        if (runnable != null) {
            runnable.run();
        }
    }
}
