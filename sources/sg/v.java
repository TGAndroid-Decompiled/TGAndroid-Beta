package sg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class v extends AnimatorListenerAdapter {
    public final n0 f55129a;
    public final float f55130b;
    public final h f55131c;
    public final boolean d;
    public final Runnable f55132e;
    public final w f55133f;

    public v(w wVar, n0 n0Var, float f10, h hVar, boolean z9, Runnable runnable) {
        this.f55133f = wVar;
        this.f55129a = n0Var;
        this.f55130b = f10;
        this.f55131c = hVar;
        this.d = z9;
        this.f55132e = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int currentColor;
        v0 v0Var;
        w wVar = this.f55133f;
        wVar.f55154x = null;
        k0 k0Var = new k0(new n0[]{this.f55129a});
        w0 w0Var = wVar.f55134a;
        k0Var.f55025c = w0Var.getCurrentColor();
        k0Var.d = this.f55130b * 1.0f;
        h hVar = this.f55131c;
        k0Var.f55026e = hVar;
        hVar.getClass();
        if (hVar instanceof d) {
            currentColor = -1;
        } else {
            currentColor = w0Var.getCurrentColor();
        }
        j0 painting = w0Var.getPainting();
        boolean z9 = this.d;
        painting.c(k0Var, currentColor, z9, null);
        if (z9 && (v0Var = w0Var.f55157a) != null) {
            v0Var.Y();
        }
        Runnable runnable = this.f55132e;
        if (runnable != null) {
            runnable.run();
        }
    }
}
