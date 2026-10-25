package rg;

import android.animation.ValueAnimator;
import android.graphics.RectF;
import li.e3;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.ui.Components.ds;
public final class m0 implements Runnable {
    public final int f47463a;
    public final q0 f47464b;
    public final f1 f47465c;

    public m0(q0 q0Var, f1 f1Var, int i10) {
        this.f47463a = i10;
        this.f47464b = q0Var;
        this.f47465c = f1Var;
    }

    @Override
    public final void run() {
        boolean z10;
        boolean z11;
        float f7;
        int i10 = this.f47463a;
        f1 f1Var = this.f47465c;
        q0 q0Var = this.f47464b;
        switch (i10) {
            case 0:
                q0Var.f47502c = f1Var;
                if (q0Var.h == null) {
                    q0Var.h = new RectF();
                }
                q0Var.f47502c.a(q0Var.h);
                e3 e3Var = q0Var.f47500a;
                if (e3Var != null) {
                    e3Var.v0();
                    return;
                }
                return;
            default:
                if (f1Var != null && q0Var.f47513q == 0) {
                    q0Var.f47513q = r1.b(q0Var.f47504g);
                }
                boolean z12 = q0Var.H;
                if (f1Var != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z12 != z10) {
                    if (f1Var != null) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    q0Var.H = z11;
                    ValueAnimator valueAnimator = q0Var.K;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        q0Var.K = null;
                    }
                    float f10 = q0Var.I;
                    if (q0Var.H) {
                        f7 = 1.0f;
                    } else {
                        f7 = 0.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
                    q0Var.K = ofFloat;
                    ofFloat.addUpdateListener(new l0(q0Var, 0));
                    q0Var.K.addListener(new p0(q0Var, 0));
                    q0Var.K.setInterpolator(ds.h);
                    q0Var.K.start();
                    q0Var.d = f1Var;
                    e3 e3Var2 = q0Var.f47500a;
                    if (e3Var2 != null) {
                        e3Var2.v0();
                    }
                    if (q0Var.H) {
                        BotWebViewVibrationEffect.SELECTION_CHANGE.vibrate();
                        return;
                    }
                    return;
                } else if (f1Var != q0Var.d) {
                    q0Var.d = f1Var;
                    e3 e3Var3 = q0Var.f47500a;
                    if (e3Var3 != null) {
                        e3Var3.v0();
                        return;
                    }
                    return;
                } else {
                    return;
                }
        }
    }
}
