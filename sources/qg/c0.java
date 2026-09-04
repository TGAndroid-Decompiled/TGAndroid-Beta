package qg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class c0 extends AnimatorListenerAdapter {
    public final u0 f44382a;
    public final float f44383b;
    public final m f44384c;
    public final boolean d;
    public final Runnable f44385e;
    public final d0 f44386f;

    public c0(d0 d0Var, u0 u0Var, float f7, m mVar, boolean z10, Runnable runnable) {
        this.f44386f = d0Var;
        this.f44382a = u0Var;
        this.f44383b = f7;
        this.f44384c = mVar;
        this.d = z10;
        this.f44385e = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int currentColor;
        b1 b1Var;
        d0 d0Var = this.f44386f;
        d0Var.f44418x = null;
        r0 r0Var = new r0(new u0[]{this.f44382a});
        c1 c1Var = d0Var.f44398a;
        r0Var.f44550c = c1Var.getCurrentColor();
        r0Var.d = this.f44383b * 1.0f;
        m mVar = this.f44384c;
        r0Var.f44551e = mVar;
        mVar.getClass();
        if (mVar instanceof d) {
            currentColor = -1;
        } else {
            currentColor = c1Var.getCurrentColor();
        }
        q0 painting = c1Var.getPainting();
        boolean z10 = this.d;
        painting.c(r0Var, currentColor, z10, null);
        if (z10 && (b1Var = c1Var.f44387a) != null) {
            b1Var.e();
        }
        Runnable runnable = this.f44385e;
        if (runnable != null) {
            runnable.run();
        }
    }
}
