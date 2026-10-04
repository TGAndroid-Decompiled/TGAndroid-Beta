package pg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class c0 extends AnimatorListenerAdapter {
    public final w0 f44439a;
    public final float f44440b;
    public final m f44441c;
    public final boolean d;
    public final Runnable f44442e;
    public final e0 f44443f;

    public c0(e0 e0Var, w0 w0Var, float f7, m mVar, boolean z10, Runnable runnable) {
        this.f44443f = e0Var;
        this.f44439a = w0Var;
        this.f44440b = f7;
        this.f44441c = mVar;
        this.d = z10;
        this.f44442e = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int currentColor;
        e1 e1Var;
        e0 e0Var = this.f44443f;
        e0Var.f44479x = null;
        t0 t0Var = new t0(new w0[]{this.f44439a});
        f1 f1Var = e0Var.f44459a;
        t0Var.f44636c = f1Var.getCurrentColor();
        t0Var.d = this.f44440b * 1.0f;
        m mVar = this.f44441c;
        t0Var.f44637e = mVar;
        mVar.getClass();
        if (mVar instanceof d) {
            currentColor = -1;
        } else {
            currentColor = f1Var.getCurrentColor();
        }
        s0 painting = f1Var.getPainting();
        boolean z10 = this.d;
        painting.c(t0Var, currentColor, z10, null);
        if (z10 && (e1Var = f1Var.f44484a) != null) {
            e1Var.e();
        }
        Runnable runnable = this.f44442e;
        if (runnable != null) {
            runnable.run();
        }
    }
}
