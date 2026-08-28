package xf;

import android.animation.ValueAnimator;
import android.graphics.RectF;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.ui.Components.gr;
public final class l0 implements Runnable {
    public final int f49267a;
    public final q0 f49268b;
    public final f1 f49269c;

    public l0(q0 q0Var, f1 f1Var, int i9) {
        this.f49267a = i9;
        this.f49268b = q0Var;
        this.f49269c = f1Var;
    }

    @Override
    public final void run() {
        boolean z10;
        boolean z11;
        float f10;
        int i9 = this.f49267a;
        f1 f1Var = this.f49269c;
        q0 q0Var = this.f49268b;
        switch (i9) {
            case 0:
                q0Var.f49312c = f1Var;
                if (q0Var.h == null) {
                    q0Var.h = new RectF();
                }
                q0Var.f49312c.a(q0Var.h);
                m5.c0 c0Var = q0Var.f49310a;
                if (c0Var != null) {
                    c0Var.i();
                    return;
                }
                return;
            default:
                if (f1Var != null && q0Var.f49324q == 0) {
                    q0Var.f49324q = r1.b(q0Var.f49315g);
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
                    float f11 = q0Var.I;
                    if (q0Var.H) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
                    q0Var.K = ofFloat;
                    ofFloat.addUpdateListener(new k0(q0Var, 0));
                    q0Var.K.addListener(new p0(q0Var, 0));
                    q0Var.K.setInterpolator(gr.h);
                    q0Var.K.start();
                    q0Var.d = f1Var;
                    m5.c0 c0Var2 = q0Var.f49310a;
                    if (c0Var2 != null) {
                        c0Var2.i();
                    }
                    if (q0Var.H) {
                        BotWebViewVibrationEffect.SELECTION_CHANGE.vibrate();
                        return;
                    }
                    return;
                } else if (f1Var != q0Var.d) {
                    q0Var.d = f1Var;
                    m5.c0 c0Var3 = q0Var.f49310a;
                    if (c0Var3 != null) {
                        c0Var3.i();
                        return;
                    }
                    return;
                } else {
                    return;
                }
        }
    }
}
