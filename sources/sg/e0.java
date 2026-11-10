package sg;

import android.animation.ValueAnimator;
import android.graphics.RectF;
import org.telegram.messenger.p2;
import org.telegram.ui.Components.uy;
import org.telegram.ui.Components.wq;
public final class e0 implements Runnable {
    public final int f55054a;
    public final j0 f55055b;
    public final y0 f55056c;

    public e0(j0 j0Var, y0 y0Var, int i7) {
        this.f55054a = i7;
        this.f55055b = j0Var;
        this.f55056c = y0Var;
    }

    @Override
    public final void run() {
        boolean z9;
        boolean z10;
        float f10;
        int i7 = this.f55054a;
        y0 y0Var = this.f55056c;
        j0 j0Var = this.f55055b;
        switch (i7) {
            case 0:
                j0Var.f55100c = y0Var;
                if (j0Var.h == null) {
                    j0Var.h = new RectF();
                }
                j0Var.f55100c.a(j0Var.h);
                uy uyVar = j0Var.f55098a;
                if (uyVar != null) {
                    uyVar.b();
                    return;
                }
                return;
            default:
                if (y0Var != null && j0Var.f55112q == 0) {
                    j0Var.f55112q = j1.b(j0Var.f55103g);
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
                    j0Var.K.setInterpolator(wq.h);
                    j0Var.K.start();
                    j0Var.d = y0Var;
                    uy uyVar2 = j0Var.f55098a;
                    if (uyVar2 != null) {
                        uyVar2.b();
                    }
                    if (j0Var.H) {
                        p2.SELECTION_CHANGE.a();
                        return;
                    }
                    return;
                } else if (y0Var != j0Var.d) {
                    j0Var.d = y0Var;
                    uy uyVar3 = j0Var.f55098a;
                    if (uyVar3 != null) {
                        uyVar3.b();
                        return;
                    }
                    return;
                } else {
                    return;
                }
        }
    }
}
