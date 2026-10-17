package qg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class d0 extends AnimatorListenerAdapter {
    public final w0 f44509a;
    public final float f44510b;
    public final m f44511c;
    public final boolean d;
    public final Runnable e;
    public final e0 f44512f;

    public d0(e0 e0Var, w0 w0Var, float f7, m mVar, boolean z10, Runnable runnable) {
        this.f44512f = e0Var;
        this.f44509a = w0Var;
        this.f44510b = f7;
        this.f44511c = mVar;
        this.d = z10;
        this.e = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int currentColor;
        d1 d1Var;
        e0 e0Var = this.f44512f;
        e0Var.f44532x = null;
        t0 t0Var = new t0(new w0[]{this.f44509a});
        e1 e1Var = e0Var.f44513a;
        t0Var.f44677c = e1Var.getCurrentColor();
        t0Var.d = this.f44510b * 1.0f;
        m mVar = this.f44511c;
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
        if (z10 && (d1Var = e1Var.f44535a) != null) {
            d1Var.e();
        }
        Runnable runnable = this.e;
        if (runnable != null) {
            runnable.run();
        }
    }
}
