package pg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class c0 extends AnimatorListenerAdapter {
    public final w0 f44432a;
    public final float f44433b;
    public final m f44434c;
    public final boolean d;
    public final Runnable f44435e;
    public final e0 f44436f;

    public c0(e0 e0Var, w0 w0Var, float f7, m mVar, boolean z10, Runnable runnable) {
        this.f44436f = e0Var;
        this.f44432a = w0Var;
        this.f44433b = f7;
        this.f44434c = mVar;
        this.d = z10;
        this.f44435e = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int currentColor;
        e1 e1Var;
        e0 e0Var = this.f44436f;
        e0Var.f44472x = null;
        t0 t0Var = new t0(new w0[]{this.f44432a});
        f1 f1Var = e0Var.f44452a;
        t0Var.f44629c = f1Var.getCurrentColor();
        t0Var.d = this.f44433b * 1.0f;
        m mVar = this.f44434c;
        t0Var.f44630e = mVar;
        mVar.getClass();
        if (mVar instanceof d) {
            currentColor = -1;
        } else {
            currentColor = f1Var.getCurrentColor();
        }
        s0 painting = f1Var.getPainting();
        boolean z10 = this.d;
        painting.c(t0Var, currentColor, z10, null);
        if (z10 && (e1Var = f1Var.f44477a) != null) {
            e1Var.e();
        }
        Runnable runnable = this.f44435e;
        if (runnable != null) {
            runnable.run();
        }
    }
}
