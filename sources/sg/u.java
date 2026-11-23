package sg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class u extends AnimatorListenerAdapter {
    public final l0 f57480a;
    public final float f57481b;
    public final h f57482c;
    public final boolean d;
    public final Runnable f57483e;
    public final v f57484f;

    public u(v vVar, l0 l0Var, float f10, h hVar, boolean z10, Runnable runnable) {
        this.f57484f = vVar;
        this.f57480a = l0Var;
        this.f57481b = f10;
        this.f57482c = hVar;
        this.d = z10;
        this.f57483e = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int currentColor;
        s0 s0Var;
        v vVar = this.f57484f;
        vVar.f57507x = null;
        i0 i0Var = new i0(new l0[]{this.f57480a});
        t0 t0Var = vVar.f57487a;
        i0Var.f57366c = t0Var.getCurrentColor();
        i0Var.d = this.f57481b * 1.0f;
        h hVar = this.f57482c;
        i0Var.f57367e = hVar;
        hVar.getClass();
        if (hVar instanceof d) {
            currentColor = -1;
        } else {
            currentColor = t0Var.getCurrentColor();
        }
        h0 painting = t0Var.getPainting();
        boolean z10 = this.d;
        painting.c(i0Var, currentColor, z10, null);
        if (z10 && (s0Var = t0Var.f57469a) != null) {
            s0Var.k0();
        }
        Runnable runnable = this.f57483e;
        if (runnable != null) {
            runnable.run();
        }
    }
}
