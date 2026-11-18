package sg;

import android.animation.ValueAnimator;
import android.graphics.RectF;
import org.telegram.messenger.q2;
import org.telegram.ui.Components.hn;
import org.telegram.ui.Components.lr;
public final class d0 implements Runnable {
    public final int f57179a;
    public final i0 f57180b;
    public final x0 f57181c;

    public d0(i0 i0Var, x0 x0Var, int i7) {
        this.f57179a = i7;
        this.f57180b = i0Var;
        this.f57181c = x0Var;
    }

    @Override
    public final void run() {
        boolean z10;
        boolean z11;
        float f10;
        int i7 = this.f57179a;
        x0 x0Var = this.f57181c;
        i0 i0Var = this.f57180b;
        switch (i7) {
            case 0:
                i0Var.f57223c = x0Var;
                if (i0Var.h == null) {
                    i0Var.h = new RectF();
                }
                i0Var.f57223c.a(i0Var.h);
                hn hnVar = i0Var.f57221a;
                if (hnVar != null) {
                    hnVar.l();
                    return;
                }
                return;
            default:
                if (x0Var != null && i0Var.f57235q == 0) {
                    i0Var.f57235q = i1.b(i0Var.f57226g);
                }
                boolean z12 = i0Var.H;
                if (x0Var != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z12 != z10) {
                    if (x0Var != null) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    i0Var.H = z11;
                    ValueAnimator valueAnimator = i0Var.K;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        i0Var.K = null;
                    }
                    float f11 = i0Var.I;
                    if (i0Var.H) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
                    i0Var.K = ofFloat;
                    ofFloat.addUpdateListener(new c0(i0Var, 0));
                    i0Var.K.addListener(new g0(i0Var, 0));
                    i0Var.K.setInterpolator(lr.h);
                    i0Var.K.start();
                    i0Var.d = x0Var;
                    hn hnVar2 = i0Var.f57221a;
                    if (hnVar2 != null) {
                        hnVar2.l();
                    }
                    if (i0Var.H) {
                        q2.SELECTION_CHANGE.a();
                        return;
                    }
                    return;
                } else if (x0Var != i0Var.d) {
                    i0Var.d = x0Var;
                    hn hnVar3 = i0Var.f57221a;
                    if (hnVar3 != null) {
                        hnVar3.l();
                        return;
                    }
                    return;
                } else {
                    return;
                }
        }
    }
}
