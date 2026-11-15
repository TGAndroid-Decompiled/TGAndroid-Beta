package sg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class u extends AnimatorListenerAdapter {
    public final m0 f56777a;
    public final float f56778b;
    public final h f56779c;
    public final boolean d;
    public final Runnable f56780e;
    public final v f56781f;

    public u(v vVar, m0 m0Var, float f10, h hVar, boolean z10, Runnable runnable) {
        this.f56781f = vVar;
        this.f56777a = m0Var;
        this.f56778b = f10;
        this.f56779c = hVar;
        this.d = z10;
        this.f56780e = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int currentColor;
        t0 t0Var;
        v vVar = this.f56781f;
        vVar.f56813x = null;
        j0 j0Var = new j0(new m0[]{this.f56777a});
        u0 u0Var = vVar.f56793a;
        j0Var.f56676c = u0Var.getCurrentColor();
        j0Var.d = this.f56778b * 1.0f;
        h hVar = this.f56779c;
        j0Var.f56677e = hVar;
        hVar.getClass();
        if (hVar instanceof d) {
            currentColor = -1;
        } else {
            currentColor = u0Var.getCurrentColor();
        }
        i0 painting = u0Var.getPainting();
        boolean z10 = this.d;
        painting.c(j0Var, currentColor, z10, null);
        if (z10 && (t0Var = u0Var.f56782a) != null) {
            t0Var.h0();
        }
        Runnable runnable = this.f56780e;
        if (runnable != null) {
            runnable.run();
        }
    }
}
