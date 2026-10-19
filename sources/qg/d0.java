package qg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class d0 extends AnimatorListenerAdapter {
    public final x0 f44473a;
    public final float f44474b;
    public final m f44475c;
    public final boolean d;
    public final Runnable e;
    public final e0 f44476f;

    public d0(e0 e0Var, x0 x0Var, float f7, m mVar, boolean z10, Runnable runnable) {
        this.f44476f = e0Var;
        this.f44473a = x0Var;
        this.f44474b = f7;
        this.f44475c = mVar;
        this.d = z10;
        this.e = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int currentColor;
        e1 e1Var;
        e0 e0Var = this.f44476f;
        e0Var.f44506x = null;
        u0 u0Var = new u0(new x0[]{this.f44473a});
        f1 f1Var = e0Var.f44487a;
        u0Var.f44658c = f1Var.getCurrentColor();
        u0Var.d = this.f44474b * 1.0f;
        m mVar = this.f44475c;
        u0Var.e = mVar;
        mVar.getClass();
        if (mVar instanceof d) {
            currentColor = -1;
        } else {
            currentColor = f1Var.getCurrentColor();
        }
        t0 painting = f1Var.getPainting();
        boolean z10 = this.d;
        painting.c(u0Var, currentColor, z10, null);
        if (z10 && (e1Var = f1Var.f44510a) != null) {
            e1Var.e();
        }
        Runnable runnable = this.e;
        if (runnable != null) {
            runnable.run();
        }
    }
}
