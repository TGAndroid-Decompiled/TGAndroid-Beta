package qg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class d0 extends AnimatorListenerAdapter {
    public final x0 f44487a;
    public final float f44488b;
    public final m f44489c;
    public final boolean d;
    public final Runnable e;
    public final e0 f44490f;

    public d0(e0 e0Var, x0 x0Var, float f7, m mVar, boolean z10, Runnable runnable) {
        this.f44490f = e0Var;
        this.f44487a = x0Var;
        this.f44488b = f7;
        this.f44489c = mVar;
        this.d = z10;
        this.e = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int currentColor;
        e1 e1Var;
        e0 e0Var = this.f44490f;
        e0Var.f44520x = null;
        u0 u0Var = new u0(new x0[]{this.f44487a});
        f1 f1Var = e0Var.f44501a;
        u0Var.f44672c = f1Var.getCurrentColor();
        u0Var.d = this.f44488b * 1.0f;
        m mVar = this.f44489c;
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
        if (z10 && (e1Var = f1Var.f44524a) != null) {
            e1Var.e();
        }
        Runnable runnable = this.e;
        if (runnable != null) {
            runnable.run();
        }
    }
}
