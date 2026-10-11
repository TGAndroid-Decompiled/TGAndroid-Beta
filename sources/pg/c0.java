package pg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class c0 extends AnimatorListenerAdapter {
    public final w0 f45627a;
    public final float f45628b;
    public final m f45629c;
    public final boolean d;
    public final Runnable f45630e;
    public final d0 f45631f;

    public c0(d0 d0Var, w0 w0Var, float f7, m mVar, boolean z10, Runnable runnable) {
        this.f45631f = d0Var;
        this.f45627a = w0Var;
        this.f45628b = f7;
        this.f45629c = mVar;
        this.d = z10;
        this.f45630e = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int currentColor;
        d1 d1Var;
        d0 d0Var = this.f45631f;
        d0Var.f45663x = null;
        t0 t0Var = new t0(new w0[]{this.f45627a});
        e1 e1Var = d0Var.f45643a;
        t0Var.f45824c = e1Var.getCurrentColor();
        t0Var.d = this.f45628b * 1.0f;
        m mVar = this.f45629c;
        t0Var.f45825e = mVar;
        mVar.getClass();
        if (mVar instanceof d) {
            currentColor = -1;
        } else {
            currentColor = e1Var.getCurrentColor();
        }
        s0 painting = e1Var.getPainting();
        boolean z10 = this.d;
        painting.c(t0Var, currentColor, z10, null);
        if (z10 && (d1Var = e1Var.f45667a) != null) {
            d1Var.e();
        }
        Runnable runnable = this.f45630e;
        if (runnable != null) {
            runnable.run();
        }
    }
}
