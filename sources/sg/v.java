package sg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class v extends AnimatorListenerAdapter {
    public final n0 f55104a;
    public final float f55105b;
    public final h f55106c;
    public final boolean d;
    public final Runnable f55107e;
    public final w f55108f;

    public v(w wVar, n0 n0Var, float f10, h hVar, boolean z9, Runnable runnable) {
        this.f55108f = wVar;
        this.f55104a = n0Var;
        this.f55105b = f10;
        this.f55106c = hVar;
        this.d = z9;
        this.f55107e = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int currentColor;
        v0 v0Var;
        w wVar = this.f55108f;
        wVar.f55129x = null;
        k0 k0Var = new k0(new n0[]{this.f55104a});
        w0 w0Var = wVar.f55109a;
        k0Var.f55000c = w0Var.getCurrentColor();
        k0Var.d = this.f55105b * 1.0f;
        h hVar = this.f55106c;
        k0Var.f55001e = hVar;
        hVar.getClass();
        if (hVar instanceof d) {
            currentColor = -1;
        } else {
            currentColor = w0Var.getCurrentColor();
        }
        j0 painting = w0Var.getPainting();
        boolean z9 = this.d;
        painting.c(k0Var, currentColor, z9, null);
        if (z9 && (v0Var = w0Var.f55132a) != null) {
            v0Var.Y();
        }
        Runnable runnable = this.f55107e;
        if (runnable != null) {
            runnable.run();
        }
    }
}
