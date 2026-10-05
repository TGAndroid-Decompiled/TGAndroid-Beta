package pg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class c0 extends AnimatorListenerAdapter {
    public final w0 f44446a;
    public final float f44447b;
    public final m f44448c;
    public final boolean d;
    public final Runnable f44449e;
    public final e0 f44450f;

    public c0(e0 e0Var, w0 w0Var, float f7, m mVar, boolean z10, Runnable runnable) {
        this.f44450f = e0Var;
        this.f44446a = w0Var;
        this.f44447b = f7;
        this.f44448c = mVar;
        this.d = z10;
        this.f44449e = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int currentColor;
        e1 e1Var;
        e0 e0Var = this.f44450f;
        e0Var.f44486x = null;
        t0 t0Var = new t0(new w0[]{this.f44446a});
        f1 f1Var = e0Var.f44466a;
        t0Var.f44643c = f1Var.getCurrentColor();
        t0Var.d = this.f44447b * 1.0f;
        m mVar = this.f44448c;
        t0Var.f44644e = mVar;
        mVar.getClass();
        if (mVar instanceof d) {
            currentColor = -1;
        } else {
            currentColor = f1Var.getCurrentColor();
        }
        s0 painting = f1Var.getPainting();
        boolean z10 = this.d;
        painting.c(t0Var, currentColor, z10, null);
        if (z10 && (e1Var = f1Var.f44491a) != null) {
            e1Var.e();
        }
        Runnable runnable = this.f44449e;
        if (runnable != null) {
            runnable.run();
        }
    }
}
