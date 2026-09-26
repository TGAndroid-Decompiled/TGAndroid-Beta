package pg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class c0 extends AnimatorListenerAdapter {
    public final w0 f41081a;
    public final float f41082b;
    public final m f41083c;
    public final boolean d;
    public final Runnable e;
    public final e0 f41084f;

    public c0(e0 e0Var, w0 w0Var, float f7, m mVar, boolean z10, Runnable runnable) {
        this.f41084f = e0Var;
        this.f41081a = w0Var;
        this.f41082b = f7;
        this.f41083c = mVar;
        this.d = z10;
        this.e = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int currentColor;
        e1 e1Var;
        e0 e0Var = this.f41084f;
        e0Var.f41118x = null;
        t0 t0Var = new t0(new w0[]{this.f41081a});
        f1 f1Var = e0Var.f41099a;
        t0Var.f41264c = f1Var.getCurrentColor();
        t0Var.d = this.f41082b * 1.0f;
        m mVar = this.f41083c;
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
        if (z10 && (e1Var = f1Var.f41123a) != null) {
            e1Var.e();
        }
        Runnable runnable = this.e;
        if (runnable != null) {
            runnable.run();
        }
    }
}
