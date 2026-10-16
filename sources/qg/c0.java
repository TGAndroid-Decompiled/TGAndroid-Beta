package qg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class c0 extends AnimatorListenerAdapter {
    public final u0 f43135a;
    public final float f43136b;
    public final m f43137c;
    public final boolean d;
    public final Runnable e;
    public final d0 f43138f;

    public c0(d0 d0Var, u0 u0Var, float f7, m mVar, boolean z10, Runnable runnable) {
        this.f43138f = d0Var;
        this.f43135a = u0Var;
        this.f43136b = f7;
        this.f43137c = mVar;
        this.d = z10;
        this.e = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int currentColor;
        b1 b1Var;
        d0 d0Var = this.f43138f;
        d0Var.f43168x = null;
        r0 r0Var = new r0(new u0[]{this.f43135a});
        c1 c1Var = d0Var.f43149a;
        r0Var.f43293c = c1Var.getCurrentColor();
        r0Var.d = this.f43136b * 1.0f;
        m mVar = this.f43137c;
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
        if (z10 && (b1Var = c1Var.f43139a) != null) {
            b1Var.e();
        }
        Runnable runnable = this.e;
        if (runnable != null) {
            runnable.run();
        }
    }
}
