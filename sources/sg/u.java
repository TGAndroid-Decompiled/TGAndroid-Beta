package sg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class u extends AnimatorListenerAdapter {
    public final m0 f57396a;
    public final float f57397b;
    public final h f57398c;
    public final boolean d;
    public final Runnable f57399e;
    public final v f57400f;

    public u(v vVar, m0 m0Var, float f10, h hVar, boolean z10, Runnable runnable) {
        this.f57400f = vVar;
        this.f57396a = m0Var;
        this.f57397b = f10;
        this.f57398c = hVar;
        this.d = z10;
        this.f57399e = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int currentColor;
        t0 t0Var;
        v vVar = this.f57400f;
        vVar.f57432x = null;
        j0 j0Var = new j0(new m0[]{this.f57396a});
        u0 u0Var = vVar.f57412a;
        j0Var.f57295c = u0Var.getCurrentColor();
        j0Var.d = this.f57397b * 1.0f;
        h hVar = this.f57398c;
        j0Var.f57296e = hVar;
        hVar.getClass();
        if (hVar instanceof d) {
            currentColor = -1;
        } else {
            currentColor = u0Var.getCurrentColor();
        }
        i0 painting = u0Var.getPainting();
        boolean z10 = this.d;
        painting.c(j0Var, currentColor, z10, null);
        if (z10 && (t0Var = u0Var.f57401a) != null) {
            t0Var.e0();
        }
        Runnable runnable = this.f57399e;
        if (runnable != null) {
            runnable.run();
        }
    }
}
