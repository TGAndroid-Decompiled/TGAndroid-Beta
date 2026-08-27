package yf;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

public final class c0 extends AnimatorListenerAdapter {

    public final t0 f49889a;

    public final float f49890b;

    public final m f49891c;
    public final boolean d;

    public final Runnable f49892e;

    public final d0 f49893f;

    public c0(d0 d0Var, t0 t0Var, float f10, m mVar, boolean z10, Runnable runnable) {
        this.f49893f = d0Var;
        this.f49889a = t0Var;
        this.f49890b = f10;
        this.f49891c = mVar;
        this.d = z10;
        this.f49892e = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        a1 a1Var;
        d0 d0Var = this.f49893f;
        d0Var.f49916x = null;
        q0 q0Var = new q0(new t0[]{this.f49889a});
        b1 b1Var = d0Var.f49896a;
        int currentColor = b1Var.getCurrentColor();
        float f10 = this.f49890b * 1.0f;
        q0Var.f50040c = currentColor;
        q0Var.d = f10;
        m mVar = this.f49891c;
        q0Var.f50041e = mVar;
        mVar.getClass();
        int currentColor2 = mVar instanceof d ? -1 : b1Var.getCurrentColor();
        p0 painting = b1Var.getPainting();
        boolean z10 = this.d;
        painting.c(q0Var, currentColor2, z10, null);
        if (z10 && (a1Var = b1Var.f49878a) != null) {
            a1Var.e();
        }
        Runnable runnable = this.f49892e;
        if (runnable != null) {
            runnable.run();
        }
    }
}
