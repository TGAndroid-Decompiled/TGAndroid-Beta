package sg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class v extends AnimatorListenerAdapter {
    public final n0 f55229a;
    public final float f55230b;
    public final h f55231c;
    public final boolean d;
    public final Runnable f55232e;
    public final w f55233f;

    public v(w wVar, n0 n0Var, float f10, h hVar, boolean z9, Runnable runnable) {
        this.f55233f = wVar;
        this.f55229a = n0Var;
        this.f55230b = f10;
        this.f55231c = hVar;
        this.d = z9;
        this.f55232e = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int currentColor;
        u0 u0Var;
        w wVar = this.f55233f;
        wVar.f55265x = null;
        k0 k0Var = new k0(new n0[]{this.f55229a});
        v0 v0Var = wVar.f55245a;
        k0Var.f55129c = v0Var.getCurrentColor();
        k0Var.d = this.f55230b * 1.0f;
        h hVar = this.f55231c;
        k0Var.f55130e = hVar;
        hVar.getClass();
        if (hVar instanceof d) {
            currentColor = -1;
        } else {
            currentColor = v0Var.getCurrentColor();
        }
        j0 painting = v0Var.getPainting();
        boolean z9 = this.d;
        painting.c(k0Var, currentColor, z9, null);
        if (z9 && (u0Var = v0Var.f55234a) != null) {
            u0Var.Y();
        }
        Runnable runnable = this.f55232e;
        if (runnable != null) {
            runnable.run();
        }
    }
}
