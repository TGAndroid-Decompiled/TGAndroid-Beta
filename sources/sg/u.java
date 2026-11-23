package sg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class u extends AnimatorListenerAdapter {
    public final m0 f57361a;
    public final float f57362b;
    public final h f57363c;
    public final boolean d;
    public final Runnable f57364e;
    public final v f57365f;

    public u(v vVar, m0 m0Var, float f10, h hVar, boolean z10, Runnable runnable) {
        this.f57365f = vVar;
        this.f57361a = m0Var;
        this.f57362b = f10;
        this.f57363c = hVar;
        this.d = z10;
        this.f57364e = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int currentColor;
        t0 t0Var;
        v vVar = this.f57365f;
        vVar.f57397x = null;
        j0 j0Var = new j0(new m0[]{this.f57361a});
        u0 u0Var = vVar.f57377a;
        j0Var.f57260c = u0Var.getCurrentColor();
        j0Var.d = this.f57362b * 1.0f;
        h hVar = this.f57363c;
        j0Var.f57261e = hVar;
        hVar.getClass();
        if (hVar instanceof d) {
            currentColor = -1;
        } else {
            currentColor = u0Var.getCurrentColor();
        }
        i0 painting = u0Var.getPainting();
        boolean z10 = this.d;
        painting.c(j0Var, currentColor, z10, null);
        if (z10 && (t0Var = u0Var.f57366a) != null) {
            t0Var.e0();
        }
        Runnable runnable = this.f57364e;
        if (runnable != null) {
            runnable.run();
        }
    }
}
