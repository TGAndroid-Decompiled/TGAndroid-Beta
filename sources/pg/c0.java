package pg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class c0 extends AnimatorListenerAdapter {
    public final w0 f41110a;
    public final float f41111b;
    public final m f41112c;
    public final boolean d;
    public final Runnable e;
    public final e0 f41113f;

    public c0(e0 e0Var, w0 w0Var, float f7, m mVar, boolean z10, Runnable runnable) {
        this.f41113f = e0Var;
        this.f41110a = w0Var;
        this.f41111b = f7;
        this.f41112c = mVar;
        this.d = z10;
        this.e = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int currentColor;
        d1 d1Var;
        e0 e0Var = this.f41113f;
        e0Var.f41145x = null;
        t0 t0Var = new t0(new w0[]{this.f41110a});
        e1 e1Var = e0Var.f41126a;
        t0Var.f41294c = e1Var.getCurrentColor();
        t0Var.d = this.f41111b * 1.0f;
        m mVar = this.f41112c;
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
        if (z10 && (d1Var = e1Var.f41148a) != null) {
            d1Var.e();
        }
        Runnable runnable = this.e;
        if (runnable != null) {
            runnable.run();
        }
    }
}
