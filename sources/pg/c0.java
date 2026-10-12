package pg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class c0 extends AnimatorListenerAdapter {
    public final v0 f45492a;
    public final float f45493b;
    public final m f45494c;
    public final boolean d;
    public final Runnable f45495e;
    public final d0 f45496f;

    public c0(d0 d0Var, v0 v0Var, float f7, m mVar, boolean z10, Runnable runnable) {
        this.f45496f = d0Var;
        this.f45492a = v0Var;
        this.f45493b = f7;
        this.f45494c = mVar;
        this.d = z10;
        this.f45495e = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int currentColor;
        c1 c1Var;
        d0 d0Var = this.f45496f;
        d0Var.f45517x = null;
        s0 s0Var = new s0(new v0[]{this.f45492a});
        d1 d1Var = d0Var.f45497a;
        s0Var.f45667c = d1Var.getCurrentColor();
        s0Var.d = this.f45493b * 1.0f;
        m mVar = this.f45494c;
        s0Var.f45668e = mVar;
        mVar.getClass();
        if (mVar instanceof d) {
            currentColor = -1;
        } else {
            currentColor = d1Var.getCurrentColor();
        }
        r0 painting = d1Var.getPainting();
        boolean z10 = this.d;
        painting.c(s0Var, currentColor, z10, null);
        if (z10 && (c1Var = d1Var.f45520a) != null) {
            c1Var.e();
        }
        Runnable runnable = this.f45495e;
        if (runnable != null) {
            runnable.run();
        }
    }
}
