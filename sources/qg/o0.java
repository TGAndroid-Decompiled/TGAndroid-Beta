package qg;

import android.animation.ValueAnimator;
import android.graphics.RectF;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.ui.Components.bs;
public final class o0 implements Runnable {
    public final int f45006a;
    public final s0 f45007b;
    public final h1 f45008c;

    public o0(s0 s0Var, h1 h1Var, int i10) {
        this.f45006a = i10;
        this.f45007b = s0Var;
        this.f45008c = h1Var;
    }

    @Override
    public final void run() {
        boolean z10;
        boolean z11;
        float f7;
        int i10 = this.f45006a;
        h1 h1Var = this.f45008c;
        s0 s0Var = this.f45007b;
        switch (i10) {
            case 0:
                s0Var.f45046c = h1Var;
                if (s0Var.h == null) {
                    s0Var.h = new RectF();
                }
                s0Var.f45046c.a(s0Var.h);
                ki.t1 t1Var = s0Var.f45044a;
                if (t1Var != null) {
                    t1Var.J();
                    return;
                }
                return;
            default:
                if (h1Var != null && s0Var.f45057q == 0) {
                    s0Var.f45057q = t1.b(s0Var.f45048g);
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
                    ki.t1 t1Var2 = s0Var.f45044a;
                    if (t1Var2 != null) {
                        t1Var2.J();
                    }
                    if (s0Var.H) {
                        BotWebViewVibrationEffect.SELECTION_CHANGE.vibrate();
                        return;
                    }
                    return;
                } else if (h1Var != s0Var.d) {
                    s0Var.d = h1Var;
                    ki.t1 t1Var3 = s0Var.f45044a;
                    if (t1Var3 != null) {
                        t1Var3.J();
                        return;
                    }
                    return;
                } else {
                    return;
                }
        }
    }
}
