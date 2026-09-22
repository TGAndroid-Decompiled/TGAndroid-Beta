package pg;

import android.animation.ValueAnimator;
import android.graphics.RectF;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.ui.Components.qr;
public final class o0 implements Runnable {
    public final int f41241a;
    public final s0 f41242b;
    public final i1 f41243c;

    public o0(s0 s0Var, i1 i1Var, int i10) {
        this.f41241a = i10;
        this.f41242b = s0Var;
        this.f41243c = i1Var;
    }

    @Override
    public final void run() {
        boolean z10;
        boolean z11;
        float f7;
        int i10 = this.f41241a;
        i1 i1Var = this.f41243c;
        s0 s0Var = this.f41242b;
        switch (i10) {
            case 0:
                s0Var.f41272c = i1Var;
                if (s0Var.h == null) {
                    s0Var.h = new RectF();
                }
                s0Var.f41272c.a(s0Var.h);
                l.d dVar = s0Var.f41270a;
                if (dVar != null) {
                    dVar.V();
                    return;
                }
                return;
            default:
                if (i1Var != null && s0Var.f41283q == 0) {
                    s0Var.f41283q = u1.b(s0Var.f41274g);
                }
                boolean z12 = s0Var.H;
                if (i1Var != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z12 != z10) {
                    if (i1Var != null) {
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
                    s0Var.d = i1Var;
                    l.d dVar2 = s0Var.f41270a;
                    if (dVar2 != null) {
                        dVar2.V();
                    }
                    if (s0Var.H) {
                        BotWebViewVibrationEffect.SELECTION_CHANGE.vibrate();
                        return;
                    }
                    return;
                } else if (i1Var != s0Var.d) {
                    s0Var.d = i1Var;
                    l.d dVar3 = s0Var.f41270a;
                    if (dVar3 != null) {
                        dVar3.V();
                        return;
                    }
                    return;
                } else {
                    return;
                }
        }
    }
}
