package sg;

import android.animation.ValueAnimator;
import android.graphics.RectF;
import org.telegram.messenger.q2;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.nd0;
public final class d0 implements Runnable {
    public final int f57302a;
    public final h0 f57303b;
    public final w0 f57304c;

    public d0(h0 h0Var, w0 w0Var, int i7) {
        this.f57302a = i7;
        this.f57303b = h0Var;
        this.f57304c = w0Var;
    }

    @Override
    public final void run() {
        boolean z10;
        boolean z11;
        float f10;
        int i7 = this.f57302a;
        w0 w0Var = this.f57304c;
        h0 h0Var = this.f57303b;
        switch (i7) {
            case 0:
                h0Var.f57341c = w0Var;
                if (h0Var.h == null) {
                    h0Var.h = new RectF();
                }
                h0Var.f57341c.a(h0Var.h);
                nd0 nd0Var = h0Var.f57339a;
                if (nd0Var != null) {
                    nd0Var.p();
                    return;
                }
                return;
            default:
                if (w0Var != null && h0Var.f57353q == 0) {
                    h0Var.f57353q = h1.b(h0Var.f57344g);
                }
                boolean z12 = h0Var.H;
                if (w0Var != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z12 != z10) {
                    if (w0Var != null) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    h0Var.H = z11;
                    ValueAnimator valueAnimator = h0Var.K;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        h0Var.K = null;
                    }
                    float f11 = h0Var.I;
                    if (h0Var.H) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
                    h0Var.K = ofFloat;
                    ofFloat.addUpdateListener(new c0(h0Var, 0));
                    h0Var.K.addListener(new g0(h0Var, 0));
                    h0Var.K.setInterpolator(kr.h);
                    h0Var.K.start();
                    h0Var.d = w0Var;
                    nd0 nd0Var2 = h0Var.f57339a;
                    if (nd0Var2 != null) {
                        nd0Var2.p();
                    }
                    if (h0Var.H) {
                        q2.SELECTION_CHANGE.a();
                        return;
                    }
                    return;
                } else if (w0Var != h0Var.d) {
                    h0Var.d = w0Var;
                    nd0 nd0Var3 = h0Var.f57339a;
                    if (nd0Var3 != null) {
                        nd0Var3.p();
                        return;
                    }
                    return;
                } else {
                    return;
                }
        }
    }
}
