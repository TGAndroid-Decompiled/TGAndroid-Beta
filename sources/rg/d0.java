package rg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class d0 extends AnimatorListenerAdapter {
    public final u0 f47420a;
    public final float f47421b;
    public final m f47422c;
    public final boolean d;
    public final Runnable e;
    public final e0 f47423f;

    public d0(e0 e0Var, u0 u0Var, float f7, m mVar, boolean z10, Runnable runnable) {
        this.f47423f = e0Var;
        this.f47420a = u0Var;
        this.f47421b = f7;
        this.f47422c = mVar;
        this.d = z10;
        this.e = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int currentColor;
        b1 b1Var;
        e0 e0Var = this.f47423f;
        e0Var.f47445x = null;
        r0 r0Var = new r0(new u0[]{this.f47420a});
        c1 c1Var = e0Var.f47426a;
        r0Var.f47566c = c1Var.getCurrentColor();
        r0Var.d = this.f47421b * 1.0f;
        m mVar = this.f47422c;
        r0Var.e = mVar;
        mVar.getClass();
        if (mVar instanceof d) {
            currentColor = -1;
        } else {
            currentColor = c1Var.getCurrentColor();
        }
        q0 painting = c1Var.getPainting();
        boolean z10 = this.d;
        painting.c(r0Var, currentColor, z10, null);
        if (z10 && (b1Var = c1Var.f47410a) != null) {
            b1Var.e();
        }
        Runnable runnable = this.e;
        if (runnable != null) {
            runnable.run();
        }
    }
}
