package sg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class v extends AnimatorListenerAdapter {
    public final n0 f55221a;
    public final float f55222b;
    public final h f55223c;
    public final boolean d;
    public final Runnable f55224e;
    public final w f55225f;

    public v(w wVar, n0 n0Var, float f10, h hVar, boolean z9, Runnable runnable) {
        this.f55225f = wVar;
        this.f55221a = n0Var;
        this.f55222b = f10;
        this.f55223c = hVar;
        this.d = z9;
        this.f55224e = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int currentColor;
        v0 v0Var;
        w wVar = this.f55225f;
        wVar.f55246x = null;
        k0 k0Var = new k0(new n0[]{this.f55221a});
        w0 w0Var = wVar.f55226a;
        k0Var.f55117c = w0Var.getCurrentColor();
        k0Var.d = this.f55222b * 1.0f;
        h hVar = this.f55223c;
        k0Var.f55118e = hVar;
        hVar.getClass();
        if (hVar instanceof d) {
            currentColor = -1;
        } else {
            currentColor = w0Var.getCurrentColor();
        }
        j0 painting = w0Var.getPainting();
        boolean z9 = this.d;
        painting.c(k0Var, currentColor, z9, null);
        if (z9 && (v0Var = w0Var.f55249a) != null) {
            v0Var.Y();
        }
        Runnable runnable = this.f55224e;
        if (runnable != null) {
            runnable.run();
        }
    }
}
