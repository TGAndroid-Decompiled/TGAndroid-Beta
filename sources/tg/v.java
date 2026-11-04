package tg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class v extends AnimatorListenerAdapter {
    public final m0 f55332a;
    public final float f55333b;
    public final h f55334c;
    public final boolean d;
    public final Runnable f55335e;
    public final w f55336f;

    public v(w wVar, m0 m0Var, float f10, h hVar, boolean z10, Runnable runnable) {
        this.f55336f = wVar;
        this.f55332a = m0Var;
        this.f55333b = f10;
        this.f55334c = hVar;
        this.d = z10;
        this.f55335e = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int currentColor;
        t0 t0Var;
        w wVar = this.f55336f;
        wVar.f55359x = null;
        j0 j0Var = new j0(new m0[]{this.f55332a});
        u0 u0Var = wVar.f55339a;
        j0Var.f55218c = u0Var.getCurrentColor();
        j0Var.d = this.f55333b * 1.0f;
        h hVar = this.f55334c;
        j0Var.f55219e = hVar;
        hVar.getClass();
        if (hVar instanceof d) {
            currentColor = -1;
        } else {
            currentColor = u0Var.getCurrentColor();
        }
        i0 painting = u0Var.getPainting();
        boolean z10 = this.d;
        painting.c(j0Var, currentColor, z10, null);
        if (z10 && (t0Var = u0Var.f55321a) != null) {
            t0Var.N();
        }
        Runnable runnable = this.f55335e;
        if (runnable != null) {
            runnable.run();
        }
    }
}
