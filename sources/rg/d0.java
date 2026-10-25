package rg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class d0 extends AnimatorListenerAdapter {
    public final u0 f47382a;
    public final float f47383b;
    public final m f47384c;
    public final boolean d;
    public final Runnable e;
    public final e0 f47385f;

    public d0(e0 e0Var, u0 u0Var, float f7, m mVar, boolean z10, Runnable runnable) {
        this.f47385f = e0Var;
        this.f47382a = u0Var;
        this.f47383b = f7;
        this.f47384c = mVar;
        this.d = z10;
        this.e = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int currentColor;
        b1 b1Var;
        e0 e0Var = this.f47385f;
        e0Var.f47407x = null;
        r0 r0Var = new r0(new u0[]{this.f47382a});
        c1 c1Var = e0Var.f47388a;
        r0Var.f47528c = c1Var.getCurrentColor();
        r0Var.d = this.f47383b * 1.0f;
        m mVar = this.f47384c;
        r0Var.e = mVar;
        mVar.getClass();
        if (mVar instanceof d) {
            currentColor = -1;
        } else {
            currentColor = c1Var.getCurrentColor();
        }
        q0 painting = c1Var.getPainting();
        boolean z10 = this.d;
        painting.c(r0Var, currentColor, z10, null);
        if (z10 && (b1Var = c1Var.f47372a) != null) {
            b1Var.e();
        }
        Runnable runnable = this.e;
        if (runnable != null) {
            runnable.run();
        }
    }
}
