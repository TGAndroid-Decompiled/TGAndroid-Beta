package qg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class c0 extends AnimatorListenerAdapter {
    public final u0 f44383a;
    public final float f44384b;
    public final m f44385c;
    public final boolean d;
    public final Runnable f44386e;
    public final d0 f44387f;

    public c0(d0 d0Var, u0 u0Var, float f7, m mVar, boolean z10, Runnable runnable) {
        this.f44387f = d0Var;
        this.f44383a = u0Var;
        this.f44384b = f7;
        this.f44385c = mVar;
        this.d = z10;
        this.f44386e = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int currentColor;
        b1 b1Var;
        d0 d0Var = this.f44387f;
        d0Var.f44419x = null;
        r0 r0Var = new r0(new u0[]{this.f44383a});
        c1 c1Var = d0Var.f44399a;
        r0Var.f44551c = c1Var.getCurrentColor();
        r0Var.d = this.f44384b * 1.0f;
        m mVar = this.f44385c;
        r0Var.f44552e = mVar;
        mVar.getClass();
        if (mVar instanceof d) {
            currentColor = -1;
        } else {
            currentColor = c1Var.getCurrentColor();
        }
        q0 painting = c1Var.getPainting();
        boolean z10 = this.d;
        painting.c(r0Var, currentColor, z10, null);
        if (z10 && (b1Var = c1Var.f44388a) != null) {
            b1Var.e();
        }
        Runnable runnable = this.f44386e;
        if (runnable != null) {
            runnable.run();
        }
    }
}
