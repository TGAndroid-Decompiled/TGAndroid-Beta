package sg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class u extends AnimatorListenerAdapter {
    public final m0 f57392a;
    public final float f57393b;
    public final h f57394c;
    public final boolean d;
    public final Runnable f57395e;
    public final v f57396f;

    public u(v vVar, m0 m0Var, float f10, h hVar, boolean z10, Runnable runnable) {
        this.f57396f = vVar;
        this.f57392a = m0Var;
        this.f57393b = f10;
        this.f57394c = hVar;
        this.d = z10;
        this.f57395e = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int currentColor;
        t0 t0Var;
        v vVar = this.f57396f;
        vVar.f57428x = null;
        j0 j0Var = new j0(new m0[]{this.f57392a});
        u0 u0Var = vVar.f57408a;
        j0Var.f57291c = u0Var.getCurrentColor();
        j0Var.d = this.f57393b * 1.0f;
        h hVar = this.f57394c;
        j0Var.f57292e = hVar;
        hVar.getClass();
        if (hVar instanceof d) {
            currentColor = -1;
        } else {
            currentColor = u0Var.getCurrentColor();
        }
        i0 painting = u0Var.getPainting();
        boolean z10 = this.d;
        painting.c(j0Var, currentColor, z10, null);
        if (z10 && (t0Var = u0Var.f57397a) != null) {
            t0Var.e0();
        }
        Runnable runnable = this.f57395e;
        if (runnable != null) {
            runnable.run();
        }
    }
}
