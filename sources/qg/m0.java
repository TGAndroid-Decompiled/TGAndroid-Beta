package qg;

import android.animation.ValueAnimator;
import android.graphics.RectF;
import ji.w4;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.ui.Components.es;
public final class m0 implements Runnable {
    public final int f43228a;
    public final q0 f43229b;
    public final f1 f43230c;

    public m0(q0 q0Var, f1 f1Var, int i10) {
        this.f43228a = i10;
        this.f43229b = q0Var;
        this.f43230c = f1Var;
    }

    @Override
    public final void run() {
        boolean z10;
        boolean z11;
        float f7;
        int i10 = this.f43228a;
        f1 f1Var = this.f43230c;
        q0 q0Var = this.f43229b;
        switch (i10) {
            case 0:
                q0Var.f43265c = f1Var;
                if (q0Var.h == null) {
                    q0Var.h = new RectF();
                }
                q0Var.f43265c.a(q0Var.h);
                w4 w4Var = q0Var.f43263a;
                if (w4Var != null) {
                    w4Var.Y0();
                    return;
                }
                return;
            default:
                if (f1Var != null && q0Var.f43276q == 0) {
                    q0Var.f43276q = r1.b(q0Var.f43267g);
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
                    q0Var.K.setInterpolator(es.h);
                    q0Var.K.start();
                    q0Var.d = f1Var;
                    w4 w4Var2 = q0Var.f43263a;
                    if (w4Var2 != null) {
                        w4Var2.Y0();
                    }
                    if (q0Var.H) {
                        BotWebViewVibrationEffect.SELECTION_CHANGE.vibrate();
                        return;
                    }
                    return;
                } else if (f1Var != q0Var.d) {
                    q0Var.d = f1Var;
                    w4 w4Var3 = q0Var.f43263a;
                    if (w4Var3 != null) {
                        w4Var3.Y0();
                        return;
                    }
                    return;
                } else {
                    return;
                }
        }
    }
}
