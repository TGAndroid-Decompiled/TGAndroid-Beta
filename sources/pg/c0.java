package pg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class c0 extends AnimatorListenerAdapter {
    public final w0 f41079a;
    public final float f41080b;
    public final m f41081c;
    public final boolean d;
    public final Runnable e;
    public final e0 f41082f;

    public c0(e0 e0Var, w0 w0Var, float f7, m mVar, boolean z10, Runnable runnable) {
        this.f41082f = e0Var;
        this.f41079a = w0Var;
        this.f41080b = f7;
        this.f41081c = mVar;
        this.d = z10;
        this.e = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int currentColor;
        e1 e1Var;
        e0 e0Var = this.f41082f;
        e0Var.f41116x = null;
        t0 t0Var = new t0(new w0[]{this.f41079a});
        f1 f1Var = e0Var.f41097a;
        t0Var.f41262c = f1Var.getCurrentColor();
        t0Var.d = this.f41080b * 1.0f;
        m mVar = this.f41081c;
        t0Var.e = mVar;
        mVar.getClass();
        if (mVar instanceof d) {
            currentColor = -1;
        } else {
            currentColor = f1Var.getCurrentColor();
        }
        s0 painting = f1Var.getPainting();
        boolean z10 = this.d;
        painting.c(t0Var, currentColor, z10, null);
        if (z10 && (e1Var = f1Var.f41121a) != null) {
            e1Var.e();
        }
        Runnable runnable = this.e;
        if (runnable != null) {
            runnable.run();
        }
    }
}
