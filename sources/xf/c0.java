package xf;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class c0 extends AnimatorListenerAdapter {
    public final u0 f49173a;
    public final float f49174b;
    public final m f49175c;
    public final boolean d;
    public final Runnable f49176e;
    public final d0 f49177f;

    public c0(d0 d0Var, u0 u0Var, float f10, m mVar, boolean z10, Runnable runnable) {
        this.f49177f = d0Var;
        this.f49173a = u0Var;
        this.f49174b = f10;
        this.f49175c = mVar;
        this.d = z10;
        this.f49176e = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int currentColor;
        b1 b1Var;
        d0 d0Var = this.f49177f;
        d0Var.f49209x = null;
        r0 r0Var = new r0(new u0[]{this.f49173a});
        c1 c1Var = d0Var.f49189a;
        r0Var.f49342c = c1Var.getCurrentColor();
        r0Var.d = this.f49174b * 1.0f;
        m mVar = this.f49175c;
        r0Var.f49343e = mVar;
        mVar.getClass();
        if (mVar instanceof d) {
            currentColor = -1;
        } else {
            currentColor = c1Var.getCurrentColor();
        }
        q0 painting = c1Var.getPainting();
        boolean z10 = this.d;
        painting.c(r0Var, currentColor, z10, null);
        if (z10 && (b1Var = c1Var.f49178a) != null) {
            b1Var.e();
        }
        Runnable runnable = this.f49176e;
        if (runnable != null) {
            runnable.run();
        }
    }
}
