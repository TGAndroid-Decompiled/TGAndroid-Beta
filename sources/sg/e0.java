package sg;

import android.animation.ValueAnimator;
import android.graphics.RectF;
import org.telegram.messenger.p2;
import org.telegram.ui.Components.vy;
import org.telegram.ui.Components.xq;
public final class e0 implements Runnable {
    public final int f55055a;
    public final j0 f55056b;
    public final y0 f55057c;

    public e0(j0 j0Var, y0 y0Var, int i7) {
        this.f55055a = i7;
        this.f55056b = j0Var;
        this.f55057c = y0Var;
    }

    @Override
    public final void run() {
        boolean z9;
        boolean z10;
        float f10;
        int i7 = this.f55055a;
        y0 y0Var = this.f55057c;
        j0 j0Var = this.f55056b;
        switch (i7) {
            case 0:
                j0Var.f55101c = y0Var;
                if (j0Var.h == null) {
                    j0Var.h = new RectF();
                }
                j0Var.f55101c.a(j0Var.h);
                vy vyVar = j0Var.f55099a;
                if (vyVar != null) {
                    vyVar.b();
                    return;
                }
                return;
            default:
                if (y0Var != null && j0Var.f55113q == 0) {
                    j0Var.f55113q = j1.b(j0Var.f55104g);
                }
                boolean z11 = j0Var.H;
                if (y0Var != null) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (z11 != z9) {
                    if (y0Var != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    j0Var.H = z10;
                    ValueAnimator valueAnimator = j0Var.K;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        j0Var.K = null;
                    }
                    float f11 = j0Var.I;
                    if (j0Var.H) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
                    j0Var.K = ofFloat;
                    ofFloat.addUpdateListener(new d0(j0Var, 0));
                    j0Var.K.addListener(new h0(j0Var, 0));
                    j0Var.K.setInterpolator(xq.h);
                    j0Var.K.start();
                    j0Var.d = y0Var;
                    vy vyVar2 = j0Var.f55099a;
                    if (vyVar2 != null) {
                        vyVar2.b();
                    }
                    if (j0Var.H) {
                        p2.SELECTION_CHANGE.a();
                        return;
                    }
                    return;
                } else if (y0Var != j0Var.d) {
                    j0Var.d = y0Var;
                    vy vyVar3 = j0Var.f55099a;
                    if (vyVar3 != null) {
                        vyVar3.b();
                        return;
                    }
                    return;
                } else {
                    return;
                }
        }
    }
}
