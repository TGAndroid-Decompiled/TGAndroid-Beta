package pg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class c0 extends AnimatorListenerAdapter {
    public final w0 f45593a;
    public final float f45594b;
    public final m f45595c;
    public final boolean d;
    public final Runnable f45596e;
    public final d0 f45597f;

    public c0(d0 d0Var, w0 w0Var, float f7, m mVar, boolean z10, Runnable runnable) {
        this.f45597f = d0Var;
        this.f45593a = w0Var;
        this.f45594b = f7;
        this.f45595c = mVar;
        this.d = z10;
        this.f45596e = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int currentColor;
        d1 d1Var;
        d0 d0Var = this.f45597f;
        d0Var.f45629x = null;
        t0 t0Var = new t0(new w0[]{this.f45593a});
        e1 e1Var = d0Var.f45609a;
        t0Var.f45790c = e1Var.getCurrentColor();
        t0Var.d = this.f45594b * 1.0f;
        m mVar = this.f45595c;
        t0Var.f45791e = mVar;
        mVar.getClass();
        if (mVar instanceof d) {
            currentColor = -1;
        } else {
            currentColor = e1Var.getCurrentColor();
        }
        s0 painting = e1Var.getPainting();
        boolean z10 = this.d;
        painting.c(t0Var, currentColor, z10, null);
        if (z10 && (d1Var = e1Var.f45633a) != null) {
            d1Var.e();
        }
        Runnable runnable = this.f45596e;
        if (runnable != null) {
            runnable.run();
        }
    }
}
