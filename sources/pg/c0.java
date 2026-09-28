package pg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class c0 extends AnimatorListenerAdapter {
    public final w0 f41082a;
    public final float f41083b;
    public final m f41084c;
    public final boolean d;
    public final Runnable e;
    public final e0 f41085f;

    public c0(e0 e0Var, w0 w0Var, float f7, m mVar, boolean z10, Runnable runnable) {
        this.f41085f = e0Var;
        this.f41082a = w0Var;
        this.f41083b = f7;
        this.f41084c = mVar;
        this.d = z10;
        this.e = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int currentColor;
        e1 e1Var;
        e0 e0Var = this.f41085f;
        e0Var.f41119x = null;
        t0 t0Var = new t0(new w0[]{this.f41082a});
        f1 f1Var = e0Var.f41100a;
        t0Var.f41265c = f1Var.getCurrentColor();
        t0Var.d = this.f41083b * 1.0f;
        m mVar = this.f41084c;
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
        if (z10 && (e1Var = f1Var.f41124a) != null) {
            e1Var.e();
        }
        Runnable runnable = this.e;
        if (runnable != null) {
            runnable.run();
        }
    }
}
