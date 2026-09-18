package pg;

import android.animation.ValueAnimator;
import android.graphics.RectF;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.ui.Components.qr;
public final class o0 implements Runnable {
    public final int f41180a;
    public final s0 f41181b;
    public final h1 f41182c;

    public o0(s0 s0Var, h1 h1Var, int i10) {
        this.f41180a = i10;
        this.f41181b = s0Var;
        this.f41182c = h1Var;
    }

    @Override
    public final void run() {
        boolean z10;
        boolean z11;
        float f7;
        int i10 = this.f41180a;
        h1 h1Var = this.f41182c;
        s0 s0Var = this.f41181b;
        switch (i10) {
            case 0:
                s0Var.f41222c = h1Var;
                if (s0Var.h == null) {
                    s0Var.h = new RectF();
                }
                s0Var.f41222c.a(s0Var.h);
                n2.e eVar = s0Var.f41220a;
                if (eVar != null) {
                    eVar.t();
                    return;
                }
                return;
            default:
                if (h1Var != null && s0Var.f41233q == 0) {
                    s0Var.f41233q = t1.b(s0Var.f41224g);
                }
                boolean z12 = s0Var.H;
                if (h1Var != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z12 != z10) {
                    if (h1Var != null) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    s0Var.H = z11;
                    ValueAnimator valueAnimator = s0Var.K;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        s0Var.K = null;
                    }
                    float f10 = s0Var.I;
                    if (s0Var.H) {
                        f7 = 1.0f;
                    } else {
                        f7 = 0.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
                    s0Var.K = ofFloat;
                    ofFloat.addUpdateListener(new n0(s0Var, 0));
                    s0Var.K.addListener(new r0(s0Var, 0));
                    s0Var.K.setInterpolator(qr.h);
                    s0Var.K.start();
                    s0Var.d = h1Var;
                    n2.e eVar2 = s0Var.f41220a;
                    if (eVar2 != null) {
                        eVar2.t();
                    }
                    if (s0Var.H) {
                        BotWebViewVibrationEffect.SELECTION_CHANGE.vibrate();
                        return;
                    }
                    return;
                } else if (h1Var != s0Var.d) {
                    s0Var.d = h1Var;
                    n2.e eVar3 = s0Var.f41220a;
                    if (eVar3 != null) {
                        eVar3.t();
                        return;
                    }
                    return;
                } else {
                    return;
                }
        }
    }
}
