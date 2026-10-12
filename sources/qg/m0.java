package qg;

import android.animation.ValueAnimator;
import android.graphics.RectF;
import ji.h5;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.ui.Components.es;
public final class m0 implements Runnable {
    public final int f43486a;
    public final q0 f43487b;
    public final f1 f43488c;

    public m0(q0 q0Var, f1 f1Var, int i10) {
        this.f43486a = i10;
        this.f43487b = q0Var;
        this.f43488c = f1Var;
    }

    @Override
    public final void run() {
        boolean z10;
        boolean z11;
        float f7;
        int i10 = this.f43486a;
        f1 f1Var = this.f43488c;
        q0 q0Var = this.f43487b;
        switch (i10) {
            case 0:
                q0Var.f43523c = f1Var;
                if (q0Var.h == null) {
                    q0Var.h = new RectF();
                }
                q0Var.f43523c.a(q0Var.h);
                h5 h5Var = q0Var.f43521a;
                if (h5Var != null) {
                    h5Var.Q0();
                    return;
                }
                return;
            default:
                if (f1Var != null && q0Var.f43534q == 0) {
                    q0Var.f43534q = r1.b(q0Var.f43525g);
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
                    h5 h5Var2 = q0Var.f43521a;
                    if (h5Var2 != null) {
                        h5Var2.Q0();
                    }
                    if (q0Var.H) {
                        BotWebViewVibrationEffect.SELECTION_CHANGE.vibrate();
                        return;
                    }
                    return;
                } else if (f1Var != q0Var.d) {
                    q0Var.d = f1Var;
                    h5 h5Var3 = q0Var.f43521a;
                    if (h5Var3 != null) {
                        h5Var3.Q0();
                        return;
                    }
                    return;
                } else {
                    return;
                }
        }
    }
}
