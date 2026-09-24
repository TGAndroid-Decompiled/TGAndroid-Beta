package pg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class c0 extends AnimatorListenerAdapter {
    public final w0 f41067a;
    public final float f41068b;
    public final m f41069c;
    public final boolean d;
    public final Runnable e;
    public final e0 f41070f;

    public c0(e0 e0Var, w0 w0Var, float f7, m mVar, boolean z10, Runnable runnable) {
        this.f41070f = e0Var;
        this.f41067a = w0Var;
        this.f41068b = f7;
        this.f41069c = mVar;
        this.d = z10;
        this.e = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int currentColor;
        e1 e1Var;
        e0 e0Var = this.f41070f;
        e0Var.f41104x = null;
        t0 t0Var = new t0(new w0[]{this.f41067a});
        f1 f1Var = e0Var.f41085a;
        t0Var.f41250c = f1Var.getCurrentColor();
        t0Var.d = this.f41068b * 1.0f;
        m mVar = this.f41069c;
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
        if (z10 && (e1Var = f1Var.f41109a) != null) {
            e1Var.e();
        }
        Runnable runnable = this.e;
        if (runnable != null) {
            runnable.run();
        }
    }
}
