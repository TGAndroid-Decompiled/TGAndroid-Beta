package qg;

import android.animation.ValueAnimator;
import android.graphics.RectF;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.ui.Components.bs;
public final class o0 implements Runnable {
    public final int f44608a;
    public final s0 f44609b;
    public final h1 f44610c;

    public o0(s0 s0Var, h1 h1Var, int i10) {
        this.f44608a = i10;
        this.f44609b = s0Var;
        this.f44610c = h1Var;
    }

    @Override
    public final void run() {
        boolean z10;
        boolean z11;
        float f7;
        int i10 = this.f44608a;
        h1 h1Var = this.f44610c;
        s0 s0Var = this.f44609b;
        switch (i10) {
            case 0:
                s0Var.f44647c = h1Var;
                if (s0Var.h == null) {
                    s0Var.h = new RectF();
                }
                s0Var.f44647c.a(s0Var.h);
                le.b bVar = s0Var.f44645a;
                if (bVar != null) {
                    bVar.a0();
                    return;
                }
                return;
            default:
                if (h1Var != null && s0Var.f44658q == 0) {
                    s0Var.f44658q = t1.b(s0Var.f44649g);
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
                    s0Var.K.setInterpolator(bs.h);
                    s0Var.K.start();
                    s0Var.d = h1Var;
                    le.b bVar2 = s0Var.f44645a;
                    if (bVar2 != null) {
                        bVar2.a0();
                    }
                    if (s0Var.H) {
                        BotWebViewVibrationEffect.SELECTION_CHANGE.vibrate();
                        return;
                    }
                    return;
                } else if (h1Var != s0Var.d) {
                    s0Var.d = h1Var;
                    le.b bVar3 = s0Var.f44645a;
                    if (bVar3 != null) {
                        bVar3.a0();
                        return;
                    }
                    return;
                } else {
                    return;
                }
        }
    }
}
