package pg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class c0 extends AnimatorListenerAdapter {
    public final w0 f45637a;
    public final float f45638b;
    public final m f45639c;
    public final boolean d;
    public final Runnable f45640e;
    public final d0 f45641f;

    public c0(d0 d0Var, w0 w0Var, float f7, m mVar, boolean z10, Runnable runnable) {
        this.f45641f = d0Var;
        this.f45637a = w0Var;
        this.f45638b = f7;
        this.f45639c = mVar;
        this.d = z10;
        this.f45640e = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int currentColor;
        d1 d1Var;
        d0 d0Var = this.f45641f;
        d0Var.f45673x = null;
        t0 t0Var = new t0(new w0[]{this.f45637a});
        e1 e1Var = d0Var.f45653a;
        t0Var.f45834c = e1Var.getCurrentColor();
        t0Var.d = this.f45638b * 1.0f;
        m mVar = this.f45639c;
        t0Var.f45835e = mVar;
        mVar.getClass();
        if (mVar instanceof d) {
            currentColor = -1;
        } else {
            currentColor = e1Var.getCurrentColor();
        }
        s0 painting = e1Var.getPainting();
        boolean z10 = this.d;
        painting.c(t0Var, currentColor, z10, null);
        if (z10 && (d1Var = e1Var.f45677a) != null) {
            d1Var.e();
        }
        Runnable runnable = this.f45640e;
        if (runnable != null) {
            runnable.run();
        }
    }
}
