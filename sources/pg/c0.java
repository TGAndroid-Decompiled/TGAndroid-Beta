package pg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class c0 extends AnimatorListenerAdapter {
    public final w0 f41069a;
    public final float f41070b;
    public final m f41071c;
    public final boolean d;
    public final Runnable e;
    public final e0 f41072f;

    public c0(e0 e0Var, w0 w0Var, float f7, m mVar, boolean z10, Runnable runnable) {
        this.f41072f = e0Var;
        this.f41069a = w0Var;
        this.f41070b = f7;
        this.f41071c = mVar;
        this.d = z10;
        this.e = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int currentColor;
        d1 d1Var;
        e0 e0Var = this.f41072f;
        e0Var.f41104x = null;
        t0 t0Var = new t0(new w0[]{this.f41069a});
        e1 e1Var = e0Var.f41085a;
        t0Var.f41253c = e1Var.getCurrentColor();
        t0Var.d = this.f41070b * 1.0f;
        m mVar = this.f41071c;
        t0Var.e = mVar;
        mVar.getClass();
        if (mVar instanceof d) {
            currentColor = -1;
        } else {
            currentColor = e1Var.getCurrentColor();
        }
        s0 painting = e1Var.getPainting();
        boolean z10 = this.d;
        painting.c(t0Var, currentColor, z10, null);
        if (z10 && (d1Var = e1Var.f41107a) != null) {
            d1Var.e();
        }
        Runnable runnable = this.e;
        if (runnable != null) {
            runnable.run();
        }
    }
}
