package sg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class v extends AnimatorListenerAdapter {
    public final n0 f55228a;
    public final float f55229b;
    public final h f55230c;
    public final boolean d;
    public final Runnable f55231e;
    public final w f55232f;

    public v(w wVar, n0 n0Var, float f10, h hVar, boolean z9, Runnable runnable) {
        this.f55232f = wVar;
        this.f55228a = n0Var;
        this.f55229b = f10;
        this.f55230c = hVar;
        this.d = z9;
        this.f55231e = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int currentColor;
        u0 u0Var;
        w wVar = this.f55232f;
        wVar.f55264x = null;
        k0 k0Var = new k0(new n0[]{this.f55228a});
        v0 v0Var = wVar.f55244a;
        k0Var.f55128c = v0Var.getCurrentColor();
        k0Var.d = this.f55229b * 1.0f;
        h hVar = this.f55230c;
        k0Var.f55129e = hVar;
        hVar.getClass();
        if (hVar instanceof d) {
            currentColor = -1;
        } else {
            currentColor = v0Var.getCurrentColor();
        }
        j0 painting = v0Var.getPainting();
        boolean z9 = this.d;
        painting.c(k0Var, currentColor, z9, null);
        if (z9 && (u0Var = v0Var.f55233a) != null) {
            u0Var.Y();
        }
        Runnable runnable = this.f55231e;
        if (runnable != null) {
            runnable.run();
        }
    }
}
