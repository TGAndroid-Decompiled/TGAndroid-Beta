package sg;

import android.animation.ValueAnimator;
import android.graphics.RectF;
import org.telegram.messenger.ou;
import org.telegram.messenger.p2;
import org.telegram.ui.Components.er;
public final class d0 implements Runnable {
    public final int f56605a;
    public final i0 f56606b;
    public final x0 f56607c;

    public d0(i0 i0Var, x0 x0Var, int i7) {
        this.f56605a = i7;
        this.f56606b = i0Var;
        this.f56607c = x0Var;
    }

    @Override
    public final void run() {
        boolean z10;
        boolean z11;
        float f10;
        int i7 = this.f56605a;
        x0 x0Var = this.f56607c;
        i0 i0Var = this.f56606b;
        switch (i7) {
            case 0:
                i0Var.f56649c = x0Var;
                if (i0Var.h == null) {
                    i0Var.h = new RectF();
                }
                i0Var.f56649c.a(i0Var.h);
                ou ouVar = i0Var.f56647a;
                if (ouVar != null) {
                    ouVar.E0();
                    return;
                }
                return;
            default:
                if (x0Var != null && i0Var.f56661q == 0) {
                    i0Var.f56661q = i1.b(i0Var.f56652g);
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
                    i0Var.K.setInterpolator(er.h);
                    i0Var.K.start();
                    i0Var.d = x0Var;
                    ou ouVar2 = i0Var.f56647a;
                    if (ouVar2 != null) {
                        ouVar2.E0();
                    }
                    if (i0Var.H) {
                        p2.SELECTION_CHANGE.a();
                        return;
                    }
                    return;
                } else if (x0Var != i0Var.d) {
                    i0Var.d = x0Var;
                    ou ouVar3 = i0Var.f56647a;
                    if (ouVar3 != null) {
                        ouVar3.E0();
                        return;
                    }
                    return;
                } else {
                    return;
                }
        }
    }
}
