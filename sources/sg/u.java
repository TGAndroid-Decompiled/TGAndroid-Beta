package sg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class u extends AnimatorListenerAdapter {
    public final m0 f57351a;
    public final float f57352b;
    public final h f57353c;
    public final boolean d;
    public final Runnable f57354e;
    public final v f57355f;

    public u(v vVar, m0 m0Var, float f10, h hVar, boolean z10, Runnable runnable) {
        this.f57355f = vVar;
        this.f57351a = m0Var;
        this.f57352b = f10;
        this.f57353c = hVar;
        this.d = z10;
        this.f57354e = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int currentColor;
        t0 t0Var;
        v vVar = this.f57355f;
        vVar.f57387x = null;
        j0 j0Var = new j0(new m0[]{this.f57351a});
        u0 u0Var = vVar.f57367a;
        j0Var.f57250c = u0Var.getCurrentColor();
        j0Var.d = this.f57352b * 1.0f;
        h hVar = this.f57353c;
        j0Var.f57251e = hVar;
        hVar.getClass();
        if (hVar instanceof d) {
            currentColor = -1;
        } else {
            currentColor = u0Var.getCurrentColor();
        }
        i0 painting = u0Var.getPainting();
        boolean z10 = this.d;
        painting.c(j0Var, currentColor, z10, null);
        if (z10 && (t0Var = u0Var.f57356a) != null) {
            t0Var.e0();
        }
        Runnable runnable = this.f57354e;
        if (runnable != null) {
            runnable.run();
        }
    }
}
