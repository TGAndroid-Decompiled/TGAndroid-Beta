package qg;

import android.animation.ValueAnimator;
import android.graphics.RectF;
import ji.u4;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.ui.Components.pr;
public final class m0 implements Runnable {
    public final int f44510a;
    public final q0 f44511b;
    public final f1 f44512c;

    public m0(q0 q0Var, f1 f1Var, int i10) {
        this.f44510a = i10;
        this.f44511b = q0Var;
        this.f44512c = f1Var;
    }

    @Override
    public final void run() {
        boolean z10;
        boolean z11;
        float f7;
        int i10 = this.f44510a;
        f1 f1Var = this.f44512c;
        q0 q0Var = this.f44511b;
        switch (i10) {
            case 0:
                q0Var.f44549c = f1Var;
                if (q0Var.h == null) {
                    q0Var.h = new RectF();
                }
                q0Var.f44549c.a(q0Var.h);
                u4 u4Var = q0Var.f44547a;
                if (u4Var != null) {
                    u4Var.n();
                    return;
                }
                return;
            default:
                if (f1Var != null && q0Var.f44561q == 0) {
                    q0Var.f44561q = r1.b(q0Var.f44552g);
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
                    q0Var.K.setInterpolator(pr.h);
                    q0Var.K.start();
                    q0Var.d = f1Var;
                    u4 u4Var2 = q0Var.f44547a;
                    if (u4Var2 != null) {
                        u4Var2.n();
                    }
                    if (q0Var.H) {
                        BotWebViewVibrationEffect.SELECTION_CHANGE.vibrate();
                        return;
                    }
                    return;
                } else if (f1Var != q0Var.d) {
                    q0Var.d = f1Var;
                    u4 u4Var3 = q0Var.f44547a;
                    if (u4Var3 != null) {
                        u4Var3.n();
                        return;
                    }
                    return;
                } else {
                    return;
                }
        }
    }
}
