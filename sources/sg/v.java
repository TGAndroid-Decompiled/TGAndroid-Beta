package sg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class v extends AnimatorListenerAdapter {
    public final n0 f55128a;
    public final float f55129b;
    public final h f55130c;
    public final boolean d;
    public final Runnable f55131e;
    public final w f55132f;

    public v(w wVar, n0 n0Var, float f10, h hVar, boolean z9, Runnable runnable) {
        this.f55132f = wVar;
        this.f55128a = n0Var;
        this.f55129b = f10;
        this.f55130c = hVar;
        this.d = z9;
        this.f55131e = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int currentColor;
        v0 v0Var;
        w wVar = this.f55132f;
        wVar.f55153x = null;
        k0 k0Var = new k0(new n0[]{this.f55128a});
        w0 w0Var = wVar.f55133a;
        k0Var.f55024c = w0Var.getCurrentColor();
        k0Var.d = this.f55129b * 1.0f;
        h hVar = this.f55130c;
        k0Var.f55025e = hVar;
        hVar.getClass();
        if (hVar instanceof d) {
            currentColor = -1;
        } else {
            currentColor = w0Var.getCurrentColor();
        }
        j0 painting = w0Var.getPainting();
        boolean z9 = this.d;
        painting.c(k0Var, currentColor, z9, null);
        if (z9 && (v0Var = w0Var.f55156a) != null) {
            v0Var.Y();
        }
        Runnable runnable = this.f55131e;
        if (runnable != null) {
            runnable.run();
        }
    }
}
