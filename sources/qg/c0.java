package qg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class c0 extends AnimatorListenerAdapter {
    public final u0 f44410a;
    public final float f44411b;
    public final m f44412c;
    public final boolean d;
    public final Runnable f44413e;
    public final d0 f44414f;

    public c0(d0 d0Var, u0 u0Var, float f7, m mVar, boolean z10, Runnable runnable) {
        this.f44414f = d0Var;
        this.f44410a = u0Var;
        this.f44411b = f7;
        this.f44412c = mVar;
        this.d = z10;
        this.f44413e = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int currentColor;
        b1 b1Var;
        d0 d0Var = this.f44414f;
        d0Var.f44446x = null;
        r0 r0Var = new r0(new u0[]{this.f44410a});
        c1 c1Var = d0Var.f44426a;
        r0Var.f44578c = c1Var.getCurrentColor();
        r0Var.d = this.f44411b * 1.0f;
        m mVar = this.f44412c;
        r0Var.f44579e = mVar;
        mVar.getClass();
        if (mVar instanceof d) {
            currentColor = -1;
        } else {
            currentColor = c1Var.getCurrentColor();
        }
        q0 painting = c1Var.getPainting();
        boolean z10 = this.d;
        painting.c(r0Var, currentColor, z10, null);
        if (z10 && (b1Var = c1Var.f44415a) != null) {
            b1Var.e();
        }
        Runnable runnable = this.f44413e;
        if (runnable != null) {
            runnable.run();
        }
    }
}
