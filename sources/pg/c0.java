package pg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class c0 extends AnimatorListenerAdapter {
    public final v0 f40773a;
    public final float f40774b;
    public final m f40775c;
    public final boolean d;
    public final Runnable e;
    public final d0 f40776f;

    public c0(d0 d0Var, v0 v0Var, float f7, m mVar, boolean z10, Runnable runnable) {
        this.f40776f = d0Var;
        this.f40773a = v0Var;
        this.f40774b = f7;
        this.f40775c = mVar;
        this.d = z10;
        this.e = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int currentColor;
        c1 c1Var;
        d0 d0Var = this.f40776f;
        d0Var.f40796x = null;
        s0 s0Var = new s0(new v0[]{this.f40773a});
        d1 d1Var = d0Var.f40777a;
        s0Var.f40937c = d1Var.getCurrentColor();
        s0Var.d = this.f40774b * 1.0f;
        m mVar = this.f40775c;
        s0Var.e = mVar;
        mVar.getClass();
        if (mVar instanceof d) {
            currentColor = -1;
        } else {
            currentColor = d1Var.getCurrentColor();
        }
        r0 painting = d1Var.getPainting();
        boolean z10 = this.d;
        painting.c(s0Var, currentColor, z10, null);
        if (z10 && (c1Var = d1Var.f40799a) != null) {
            c1Var.e();
        }
        Runnable runnable = this.e;
        if (runnable != null) {
            runnable.run();
        }
    }
}
