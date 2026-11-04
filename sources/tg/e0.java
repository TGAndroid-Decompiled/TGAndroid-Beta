package tg;

import android.animation.ValueAnimator;
import android.graphics.RectF;
import org.telegram.messenger.p2;
import org.telegram.ui.Components.nh;
import org.telegram.ui.Components.xq;
public final class e0 implements Runnable {
    public final int f55152a;
    public final i0 f55153b;
    public final x0 f55154c;

    public e0(i0 i0Var, x0 x0Var, int i3) {
        this.f55152a = i3;
        this.f55153b = i0Var;
        this.f55154c = x0Var;
    }

    @Override
    public final void run() {
        boolean z10;
        boolean z11;
        float f10;
        int i3 = this.f55152a;
        x0 x0Var = this.f55154c;
        i0 i0Var = this.f55153b;
        switch (i3) {
            case 0:
                i0Var.f55191c = x0Var;
                if (i0Var.h == null) {
                    i0Var.h = new RectF();
                }
                i0Var.f55191c.a(i0Var.h);
                nh nhVar = i0Var.f55189a;
                if (nhVar != null) {
                    nhVar.x();
                    return;
                }
                return;
            default:
                if (x0Var != null && i0Var.f55203q == 0) {
                    i0Var.f55203q = i1.b(i0Var.f55194g);
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
                    ofFloat.addUpdateListener(new d0(i0Var, 0));
                    i0Var.K.addListener(new h0(i0Var, 0));
                    i0Var.K.setInterpolator(xq.h);
                    i0Var.K.start();
                    i0Var.d = x0Var;
                    nh nhVar2 = i0Var.f55189a;
                    if (nhVar2 != null) {
                        nhVar2.x();
                    }
                    if (i0Var.H) {
                        p2.SELECTION_CHANGE.a();
                        return;
                    }
                    return;
                } else if (x0Var != i0Var.d) {
                    i0Var.d = x0Var;
                    nh nhVar3 = i0Var.f55189a;
                    if (nhVar3 != null) {
                        nhVar3.x();
                        return;
                    }
                    return;
                } else {
                    return;
                }
        }
    }
}
