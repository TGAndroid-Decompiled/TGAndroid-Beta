package qg;

import android.animation.ValueAnimator;
import android.graphics.RectF;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.ui.Components.bs;
public final class o0 implements Runnable {
    public final int f44583a;
    public final s0 f44584b;
    public final h1 f44585c;

    public o0(s0 s0Var, h1 h1Var, int i10) {
        this.f44583a = i10;
        this.f44584b = s0Var;
        this.f44585c = h1Var;
    }

    @Override
    public final void run() {
        boolean z10;
        boolean z11;
        float f7;
        int i10 = this.f44583a;
        h1 h1Var = this.f44585c;
        s0 s0Var = this.f44584b;
        switch (i10) {
            case 0:
                s0Var.f44625c = h1Var;
                if (s0Var.h == null) {
                    s0Var.h = new RectF();
                }
                s0Var.f44625c.a(s0Var.h);
                le.b bVar = s0Var.f44623a;
                if (bVar != null) {
                    bVar.a0();
                    return;
                }
                return;
            default:
                if (h1Var != null && s0Var.f44636q == 0) {
                    s0Var.f44636q = t1.b(s0Var.f44627g);
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
                    le.b bVar2 = s0Var.f44623a;
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
                    le.b bVar3 = s0Var.f44623a;
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
