package qg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class d0 extends AnimatorListenerAdapter {
    public final x0 f44475a;
    public final float f44476b;
    public final m f44477c;
    public final boolean d;
    public final Runnable e;
    public final e0 f44478f;

    public d0(e0 e0Var, x0 x0Var, float f7, m mVar, boolean z10, Runnable runnable) {
        this.f44478f = e0Var;
        this.f44475a = x0Var;
        this.f44476b = f7;
        this.f44477c = mVar;
        this.d = z10;
        this.e = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int currentColor;
        e1 e1Var;
        e0 e0Var = this.f44478f;
        e0Var.f44508x = null;
        u0 u0Var = new u0(new x0[]{this.f44475a});
        f1 f1Var = e0Var.f44489a;
        u0Var.f44660c = f1Var.getCurrentColor();
        u0Var.d = this.f44476b * 1.0f;
        m mVar = this.f44477c;
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
        if (z10 && (e1Var = f1Var.f44512a) != null) {
            e1Var.e();
        }
        Runnable runnable = this.e;
        if (runnable != null) {
            runnable.run();
        }
    }
}
