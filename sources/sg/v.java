package sg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class v extends AnimatorListenerAdapter {
    public final n0 f55220a;
    public final float f55221b;
    public final h f55222c;
    public final boolean d;
    public final Runnable f55223e;
    public final w f55224f;

    public v(w wVar, n0 n0Var, float f10, h hVar, boolean z9, Runnable runnable) {
        this.f55224f = wVar;
        this.f55220a = n0Var;
        this.f55221b = f10;
        this.f55222c = hVar;
        this.d = z9;
        this.f55223e = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int currentColor;
        v0 v0Var;
        w wVar = this.f55224f;
        wVar.f55245x = null;
        k0 k0Var = new k0(new n0[]{this.f55220a});
        w0 w0Var = wVar.f55225a;
        k0Var.f55116c = w0Var.getCurrentColor();
        k0Var.d = this.f55221b * 1.0f;
        h hVar = this.f55222c;
        k0Var.f55117e = hVar;
        hVar.getClass();
        if (hVar instanceof d) {
            currentColor = -1;
        } else {
            currentColor = w0Var.getCurrentColor();
        }
        j0 painting = w0Var.getPainting();
        boolean z9 = this.d;
        painting.c(k0Var, currentColor, z9, null);
        if (z9 && (v0Var = w0Var.f55248a) != null) {
            v0Var.Y();
        }
        Runnable runnable = this.f55223e;
        if (runnable != null) {
            runnable.run();
        }
    }
}
