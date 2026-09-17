package pg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class c0 extends AnimatorListenerAdapter {
    public final u0 f40842a;
    public final float f40843b;
    public final m f40844c;
    public final boolean d;
    public final Runnable e;
    public final d0 f40845f;

    public c0(d0 d0Var, u0 u0Var, float f7, m mVar, boolean z10, Runnable runnable) {
        this.f40845f = d0Var;
        this.f40842a = u0Var;
        this.f40843b = f7;
        this.f40844c = mVar;
        this.d = z10;
        this.e = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int currentColor;
        b1 b1Var;
        d0 d0Var = this.f40845f;
        d0Var.f40875x = null;
        r0 r0Var = new r0(new u0[]{this.f40842a});
        c1 c1Var = d0Var.f40856a;
        r0Var.f41000c = c1Var.getCurrentColor();
        r0Var.d = this.f40843b * 1.0f;
        m mVar = this.f40844c;
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
        if (z10 && (b1Var = c1Var.f40846a) != null) {
            b1Var.e();
        }
        Runnable runnable = this.e;
        if (runnable != null) {
            runnable.run();
        }
    }
}
