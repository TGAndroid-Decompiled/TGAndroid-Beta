package qg;

import android.animation.ValueAnimator;
import android.graphics.RectF;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.ui.Components.bs;
public final class p0 implements Runnable {
    public final int f44595a;
    public final t0 f44596b;
    public final i1 f44597c;

    public p0(t0 t0Var, i1 i1Var, int i10) {
        this.f44595a = i10;
        this.f44596b = t0Var;
        this.f44597c = i1Var;
    }

    @Override
    public final void run() {
        boolean z10;
        boolean z11;
        float f7;
        int i10 = this.f44595a;
        i1 i1Var = this.f44597c;
        t0 t0Var = this.f44596b;
        switch (i10) {
            case 0:
                t0Var.f44637c = i1Var;
                if (t0Var.h == null) {
                    t0Var.h = new RectF();
                }
                t0Var.f44637c.a(t0Var.h);
                ki.t1 t1Var = t0Var.f44635a;
                if (t1Var != null) {
                    t1Var.s();
                    return;
                }
                return;
            default:
                if (i1Var != null && t0Var.f44648q == 0) {
                    t0Var.f44648q = u1.b(t0Var.f44639g);
                }
                boolean z12 = t0Var.H;
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
                    t0Var.H = z11;
                    ValueAnimator valueAnimator = t0Var.K;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        t0Var.K = null;
                    }
                    float f10 = t0Var.I;
                    if (t0Var.H) {
                        f7 = 1.0f;
                    } else {
                        f7 = 0.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
                    t0Var.K = ofFloat;
                    ofFloat.addUpdateListener(new o0(t0Var, 0));
                    t0Var.K.addListener(new s0(t0Var, 0));
                    t0Var.K.setInterpolator(bs.h);
                    t0Var.K.start();
                    t0Var.d = i1Var;
                    ki.t1 t1Var2 = t0Var.f44635a;
                    if (t1Var2 != null) {
                        t1Var2.s();
                    }
                    if (t0Var.H) {
                        BotWebViewVibrationEffect.SELECTION_CHANGE.vibrate();
                        return;
                    }
                    return;
                } else if (i1Var != t0Var.d) {
                    t0Var.d = i1Var;
                    ki.t1 t1Var3 = t0Var.f44635a;
                    if (t1Var3 != null) {
                        t1Var3.s();
                        return;
                    }
                    return;
                } else {
                    return;
                }
        }
    }
}
