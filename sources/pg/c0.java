package pg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class c0 extends AnimatorListenerAdapter {
    public final w0 f44431a;
    public final float f44432b;
    public final m f44433c;
    public final boolean d;
    public final Runnable f44434e;
    public final e0 f44435f;

    public c0(e0 e0Var, w0 w0Var, float f7, m mVar, boolean z10, Runnable runnable) {
        this.f44435f = e0Var;
        this.f44431a = w0Var;
        this.f44432b = f7;
        this.f44433c = mVar;
        this.d = z10;
        this.f44434e = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int currentColor;
        e1 e1Var;
        e0 e0Var = this.f44435f;
        e0Var.f44471x = null;
        t0 t0Var = new t0(new w0[]{this.f44431a});
        f1 f1Var = e0Var.f44451a;
        t0Var.f44628c = f1Var.getCurrentColor();
        t0Var.d = this.f44432b * 1.0f;
        m mVar = this.f44433c;
        t0Var.f44629e = mVar;
        mVar.getClass();
        if (mVar instanceof d) {
            currentColor = -1;
        } else {
            currentColor = f1Var.getCurrentColor();
        }
        s0 painting = f1Var.getPainting();
        boolean z10 = this.d;
        painting.c(t0Var, currentColor, z10, null);
        if (z10 && (e1Var = f1Var.f44476a) != null) {
            e1Var.e();
        }
        Runnable runnable = this.f44434e;
        if (runnable != null) {
            runnable.run();
        }
    }
}
