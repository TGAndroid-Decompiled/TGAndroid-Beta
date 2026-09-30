package pg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class c0 extends AnimatorListenerAdapter {
    public final w0 f41083a;
    public final float f41084b;
    public final m f41085c;
    public final boolean d;
    public final Runnable e;
    public final e0 f41086f;

    public c0(e0 e0Var, w0 w0Var, float f7, m mVar, boolean z10, Runnable runnable) {
        this.f41086f = e0Var;
        this.f41083a = w0Var;
        this.f41084b = f7;
        this.f41085c = mVar;
        this.d = z10;
        this.e = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int currentColor;
        e1 e1Var;
        e0 e0Var = this.f41086f;
        e0Var.f41120x = null;
        t0 t0Var = new t0(new w0[]{this.f41083a});
        f1 f1Var = e0Var.f41101a;
        t0Var.f41266c = f1Var.getCurrentColor();
        t0Var.d = this.f41084b * 1.0f;
        m mVar = this.f41085c;
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
        if (z10 && (e1Var = f1Var.f41125a) != null) {
            e1Var.e();
        }
        Runnable runnable = this.e;
        if (runnable != null) {
            runnable.run();
        }
    }
}
