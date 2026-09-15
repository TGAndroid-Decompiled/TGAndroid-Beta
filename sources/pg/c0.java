package pg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class c0 extends AnimatorListenerAdapter {
    public final u0 f40820a;
    public final float f40821b;
    public final m f40822c;
    public final boolean d;
    public final Runnable e;
    public final d0 f40823f;

    public c0(d0 d0Var, u0 u0Var, float f7, m mVar, boolean z10, Runnable runnable) {
        this.f40823f = d0Var;
        this.f40820a = u0Var;
        this.f40821b = f7;
        this.f40822c = mVar;
        this.d = z10;
        this.e = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int currentColor;
        b1 b1Var;
        d0 d0Var = this.f40823f;
        d0Var.f40853x = null;
        r0 r0Var = new r0(new u0[]{this.f40820a});
        c1 c1Var = d0Var.f40834a;
        r0Var.f40978c = c1Var.getCurrentColor();
        r0Var.d = this.f40821b * 1.0f;
        m mVar = this.f40822c;
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
        if (z10 && (b1Var = c1Var.f40824a) != null) {
            b1Var.e();
        }
        Runnable runnable = this.e;
        if (runnable != null) {
            runnable.run();
        }
    }
}
