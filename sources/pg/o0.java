package pg;

import android.animation.ValueAnimator;
import android.graphics.RectF;
import m.f3;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.ui.Components.hs;
public final class o0 implements Runnable {
    public final int f45709a;
    public final s0 f45710b;
    public final h1 f45711c;

    public o0(s0 s0Var, h1 h1Var, int i10) {
        this.f45709a = i10;
        this.f45710b = s0Var;
        this.f45711c = h1Var;
    }

    @Override
    public final void run() {
        boolean z10;
        boolean z11;
        float f7;
        int i10 = this.f45709a;
        h1 h1Var = this.f45711c;
        s0 s0Var = this.f45710b;
        switch (i10) {
            case 0:
                s0Var.f45755c = h1Var;
                if (s0Var.h == null) {
                    s0Var.h = new RectF();
                }
                s0Var.f45755c.a(s0Var.h);
                f3 f3Var = s0Var.f45753a;
                if (f3Var != null) {
                    f3Var.g();
                    return;
                }
                return;
            default:
                if (h1Var != null && s0Var.f45767q == 0) {
                    s0Var.f45767q = t1.b(s0Var.f45758g);
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
                    s0Var.K.setInterpolator(hs.h);
                    s0Var.K.start();
                    s0Var.d = h1Var;
                    f3 f3Var2 = s0Var.f45753a;
                    if (f3Var2 != null) {
                        f3Var2.g();
                    }
                    if (s0Var.H) {
                        BotWebViewVibrationEffect.SELECTION_CHANGE.vibrate();
                        return;
                    }
                    return;
                } else if (h1Var != s0Var.d) {
                    s0Var.d = h1Var;
                    f3 f3Var3 = s0Var.f45753a;
                    if (f3Var3 != null) {
                        f3Var3.g();
                        return;
                    }
                    return;
                } else {
                    return;
                }
        }
    }
}
